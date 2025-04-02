package com.edu.training.jc.masMas;

import java.util.Random;

/**
 * Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
 * [0, 9].
 */

public class masMas02 {

	public static void main(String[] args) {

		int[][] mas = new int[2][3];
		init(mas);
		print(mas);
	}

	@SuppressWarnings("unused")
	private Random rand = new Random();

	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);

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
