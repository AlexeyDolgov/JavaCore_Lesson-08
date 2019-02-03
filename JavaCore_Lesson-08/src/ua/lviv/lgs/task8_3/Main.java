package ua.lviv.lgs.task8_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Введите первое целое число:");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("Введите второе целое число:");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();
				System.out.println("Сумма введенных чисел равна " + (a + b));
			}

			else
				System.out.println("Ошибка! Необходимо было ввести ЦЕЛОЕ число");
		}

		else
			System.out.println("Ошибка! Необходимо было ввести ЦЕЛОЕ число");

	}
}
