package ua.lviv.lgs.task8_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите целое число:");

		if (scanner.hasNextInt()) {
			if (scanner.nextInt() % 2 == 0) {
				System.out.println("Число является четным");
			} else
				System.out.println("Число является нечетным");
		} else {
			System.out.println("Необходимо ввести ЦЕЛОЕ число!");
		}
	}
}
