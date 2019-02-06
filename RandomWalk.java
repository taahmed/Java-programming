package ch04;

import java.util.Random;

public class RandomWalk {

	public static void main(String[] args) {

		int walk = 0;
		int max = walk;

		for (int i = 0; i < 10; i++) {
			walk = walk + randomWalk();

			if (max < walk)
				max = walk;

			System.out.println("position" + i + " = " + walk);
		}
		System.out.println("max position = " + max);

	}

	public static int randomWalk() {

		Random rand = new Random();
		int num = rand.nextInt(2);

		if (num == 1) {
			return -1;
		}

		return 1;
	}
}