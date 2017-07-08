package lesson170707.teacherworkinclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("one");
		list.add("one");

		Collection<String> strings = Collections.unmodifiableCollection(list);


	}

}
