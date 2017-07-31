package main.lesson170731.teacherworkinclass;

public class TryWithResourcesExample {

	static class Resource implements AutoCloseable  {

		@Override
		public void close() {

		}

		public void use() {}
	}

	public static void main(String[] args) {

		try (Resource resource = new Resource()) {
			resource.use();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
