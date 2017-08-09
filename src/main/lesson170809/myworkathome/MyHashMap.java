package main.lesson170809.myworkathome;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap<E> implements Iterable<MyHashMap.Pair<E>> {

	private int count;

	public static class Pair<T> {
		T key;
		T value;
		Pair(final T key, final T value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "Pair{" +
					"key=" + key +
					", value=" + value +
					'}';
		}
	}

	private static final int MAX = 10;

	List<Pair<E>>[] data = new List[MAX];

	public void put(E key, E value) {
		if (count >= data.length) {
			resize();
		}
		int index = hash(key);
		List<Pair<E>> list = data[index];
		if (list == null) {
			list = new LinkedList<>();
			data[index] = list;
		}
		Pair<E> pair = getPair(key, index);
		if (pair == null) {
			list.add(new Pair<>(key, value));
			count++;
			return;
		}
		pair.value = value;
	}

	private void resize() {
		List<Pair<E>>[] newData = new List[(data.length >> 1) + data.length];
		List<List<Pair<E>>> list = new LinkedList<>();
		for (List<Pair<E>> pairList : data) {
			if (pairList != null) {
				list.add(pairList);
			}
		}
		data = newData;
		for (List<Pair<E>> pairList : list) {
			for (Pair<E> pair : pairList) {
				put(pair.key, pair.value);
			}
		}
	}

	private int hash(final E key) {
		return key.hashCode() & 0x7FFFFFFF % data.length;
	}

	public E get(E key) {
		Pair<E> pair = getPair(key, hash(key));
		return pair == null ? null : pair.value;
	}

	private Pair<E> getPair(final E key, int index) {
		List<Pair<E>> list = data[index];
		if (list == null) {
			return null;
		}
		for (Pair<E> pair : list) {
			if (pair.key.equals(key)) {
				return pair;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "MyHashMap{" +
				"data=" + Arrays.toString(data) +
				'}';
	}

	@NotNull
	@Override
	public Iterator<Pair<E>> iterator() {
		return new Iterator<MyHashMap.Pair<E>>() {
			int currentElement = -1;
			Iterator<Pair<E>> listIterator = null;
			@Override
			public boolean hasNext() {
				if (listIterator != null && listIterator.hasNext()) {
					return true;
				}
				listIterator = null;
				for (++currentElement; listIterator == null && currentElement < data.length; currentElement++) {
					List<Pair<E>> list = data[currentElement];
					if (list == null) {
						continue;
					}
					listIterator = list.iterator();
					if (!listIterator.hasNext()) {
						continue;
					}
					return listIterator.hasNext();
				}
				return false;
			}
			@Override
			public Pair<E> next() {
				if (!listIterator.hasNext()) {
					throw new IllegalArgumentException();
				}
				return listIterator.next();
			}
		};
	}
}
