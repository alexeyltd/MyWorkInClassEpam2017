package main.lesson170901.teacherworkinclass;

public enum Seasons {
	WINTER("Low") {
		{
			System.out.println("init WINTER");
		}
		@Override
		public String getTemperature() {
			return super.getTemperature() + " yeah !";
		}
	}, SPRING("Medium") {

	}, SUMMER("high"), AUTUMN("Medium");

	private final String temperature;

	Seasons(String temperature) {
		this.temperature = temperature;
	}

	public String getTemperature() {
		return temperature;
	}
}
