package com.edu.training.jc.masMas;

import java.util.Random;

/**
 * Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
 * была ровно одна единица, и вывести на экран.
 */

public class masMas01 {

	public static void main(String[] args) {

		int[][] mas = new int[3][4];
		init(mas);
		print(mas);
	}

	@SuppressWarnings("unused")
	// метод заполняет строки массива нолями и единицами, единица на всю строку одна
	// и расположена случайным образом
	private Random rand = new Random();

	public static void init(int[][] mas) {
		int flag = 0; // флаг наличия единицы
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			flag = 0; // в новой строке изначально единицы нет
			for (int j = 0; j < mas[i].length; j++) {
				if (flag == 0) { // если в строке единицы ещё нет, идём сюда
					int val = rand.nextInt(2);
					mas[i][j] = val;
					if (val == 1) { // если поймали единицу, меняем флаг
						flag = 1;
					}
				} else { // если единица в строке есть, забиваем остальное нолями
					mas[i][j] = 0;
				}
			}
			if (flag == 0) { // если всю строку заполнили, а единицу так и не добавили, возвраща5еемся в эту
								// же строку снова
				i--;
			}

		}
	}

	public static void print(int[][] mas) {
		for (int[] element : mas) {
			for (int element2 : element) {
				System.out.printf("[%2d]", element2);
			}
			System.out.println();
		}
	}
}
