package main.lesson170724.teacherworkinclass.nested;

public class InnerExamples {

	int state;

	public void change() {
		state++;
	}

	class Processor {

		public void process() {
			InnerExamples.this.state = 20;
			InnerExamples.this.change();
			InnerExamples.this.change();

			System.out.println(InnerExamples.this);
		}

	}

	@Override
	public String toString() {
		return "InnerExamples{" +
				"state=" + state +
				'}';
	}

}
