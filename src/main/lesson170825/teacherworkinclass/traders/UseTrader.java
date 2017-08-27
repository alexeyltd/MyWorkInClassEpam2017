package main.lesson170825.teacherworkinclass.traders;

import java.util.*;
import java.util.stream.Collectors;

public class UseTrader {

	/*
	 *
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 *
	 * 2 What are all the unique cities where the traders work?
	 *
	 * 3 Find all traders from Cambridge and sort them by name.
	 *
	 * 4 Return a string of all traders’ names sorted alphabetically.
	 *
	 * 5 Are any traders based in Milan?
	 *
	 * 6 Print all transactions’ values from the traders living in Cambridge.
	 *
	 * 7 What’s the highest value of all the transactions?
	 *
	 * 8 Find the transaction with the smallest value.
	 */

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

		System.out.println("TASK ONE");
		System.out.println("-----------");

//		1 Find all transactions in the year 2011 and sort them by value (small to high).

		List<Transaction> resultOnFirstTask = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparingInt(Transaction::getValue))
				.collect(Collectors.toList());

		System.out.println(resultOnFirstTask);

		System.out.println("TASK Two");
		System.out.println("-----------");

//		2 What are all the unique cities where the traders work?

		List<String> resultOnSecondTask =  transactions.stream()
				.map(transaction -> transaction.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList());

		System.out.println(resultOnSecondTask);

		System.out.println("TASK THREE");
		System.out.println("-----------");

//		3 Find all traders from Cambridge and sort them by name.

		List<Trader> resultOnThirdTask =  transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName))
				.distinct()
				.collect(Collectors.toList());

		System.out.println(resultOnThirdTask);

		System.out.println("TASK FOUR");
		System.out.println("-----------");

//		4 Return a string of all traders’ names sorted alphabetically.

		String resultOnFourthTask =  transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.map(Trader::getName)
				.sorted()
				.collect(Collectors.joining(", "));


		System.out.println(resultOnFourthTask);

		System.out.println("TASK FIVE");
		System.out.println("-----------");

//		5 Are any traders based in Milan?

		Boolean resultOnFifthTask =  transactions.stream()
				.map(Transaction::getTrader)
				.distinct()
				.anyMatch(trader -> trader.getCity().equals("Milan"));

		System.out.println(resultOnFifthTask);

		System.out.println("TASK SIX");
		System.out.println("-----------");

//		6 Print all transactions’ values from the traders living in Cambridge.

		transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.forEach(System.out::println);

		System.out.println("TASK SEVEN");
		System.out.println("-----------");

//		7 What’s the highest value of all the transactions?

		Optional<Integer> maxTransactionValue = transactions.stream()
				.map(Transaction::getValue)
				.max(Integer::compare);

		Optional<Integer> maxTransactionValue2 = transactions.stream()
				.map(Transaction::getValue)
				.reduce(Integer::max);

		if (maxTransactionValue.isPresent()) {
			System.out.println(maxTransactionValue);
		}


		System.out.println("TASK EIGHT");
		System.out.println("-----------");

//		8 Find the transaction with the smallest value.

		Optional<Transaction> resultOneEghthTask = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue));
		
		resultOneEghthTask.ifPresent(System.out::println);




	}

}
