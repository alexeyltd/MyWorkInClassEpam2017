package main.lesson170825.teacherworkinclass.traders;

public class Transaction {

	private final Trader trader;
	private final Integer year;
	private final Integer value;

	public Transaction(final Trader trader, final Integer year, final Integer value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"trader=" + trader +
				", year='" + year + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
