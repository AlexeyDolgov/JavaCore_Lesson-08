package ua.lviv.lgs.task8_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a;
		int b;

		System.out.println("������� ������ ����� �����:");

		if (scanner.hasNextInt()) {
			a = scanner.nextInt();

			System.out.println("������� ������ ����� �����:");

			if (scanner.hasNextInt()) {
				b = scanner.nextInt();
				System.out.println("����� ��������� ����� ����� " + (a + b));
			}

			else
				System.out.println("������! ���������� ���� ������ ����� �����");
		}

		else
			System.out.println("������! ���������� ���� ������ ����� �����");

	}
}
