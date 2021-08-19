package test;

import java.util.Random;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {

		Random r = new Random();
		int random0 = r.nextInt(10);
		int random1 = r.nextInt(10);
		int random2 = r.nextInt(10);
		int random3 = r.nextInt(10);

		while (true) {
			if (random0 == random1 || random0 == random2 || random0 == random3) {
				int random4 = r.nextInt(10);
				random0 = random4;
			}
			if (random1 == random0 || random1 == random2 || random1 == random3) {
				int random5 = r.nextInt(10);
				random1 = random5;
			}
			if (random2 == random0 || random2 == random1 || random2 == random3) {
				int random6 = r.nextInt(10);
				random2 = random6;
			}
			if (random3 == random0 || random3 == random1 || random3 == random2) {
				int random7 = r.nextInt(10);
				random3 = random7;
			}
			int[] Random = new int[4];
			Random[0] = random0;
			Random[1] = random1;
			Random[2] = random2;
			Random[3] = random3;

			/*
			 * System.out.print(random0); System.out.print(random1);
			 * System.out.print(random2); System.out.println(random3);
			 */// 測試用

			int[] Keyin = new int[4];
			System.out.println("請開始遊戲");
			System.out.println("0 ~ 9 分別輸入4個數字");
			System.out.println();

			int i = 0;
			int j = 0;
			int Number = 1;
			while (true) {
				try {
					Scanner sc = new Scanner(System.in);
					int keyin0 = sc.nextInt();
					Keyin[0] = keyin0;
					if (Keyin[0] > 9) {
						System.out.println("您輸入數字大於9");
						continue;
					}
					int keyin1 = sc.nextInt();
					Keyin[1] = keyin1;
					if (Keyin[1] > 9) {
						System.out.println("您輸入數字大於9");
						continue;
					}
					int keyin2 = sc.nextInt();
					Keyin[2] = keyin2;
					if (Keyin[2] > 9) {
						System.out.println("您輸入數字大於9");
						continue;
					}
					int keyin3 = sc.nextInt();
					Keyin[3] = keyin3;
					if (Keyin[2] > 9) {
						System.out.println("您輸入數字大於9");
						continue;
					}

					if ((Keyin[0] == Keyin[1] || Keyin[0] == Keyin[2] || Keyin[0] == Keyin[3]) 
						|| (Keyin[1] == Keyin[0] || Keyin[1] == Keyin[2] || Keyin[1] == Keyin[3])
						|| (Keyin[2] == Keyin[0] || Keyin[2] == Keyin[1] || Keyin[2] == Keyin[3])
						|| (Keyin[3] == Keyin[0] || Keyin[3] == Keyin[1] || Keyin[3] == Keyin[2])) {
						System.out.println("您已重複輸入相同數字");
						continue;
					}

					System.out.print("這是你剛剛輸入的數字:");
					for (int a = 0; a <= 3; a++) {
						System.out.print(Keyin[a]);
					}
					System.out.println();

					if (Keyin[0] == Random[0] && Keyin[1] == Random[1] && Keyin[2] == Random[2]) {
						System.out.println("恭喜答對!" + "你猜了" + Number + "次!");
						return;
					}
					if (Keyin[0] == Random[0]) {
						i++;
					} else if (Keyin[0] == Random[1] || Keyin[0] == Random[2] || Keyin[0] == Random[3]) {
						j++;
					}
					if (Keyin[1] == Random[1]) {
						i++;
					} else if (Keyin[1] == Random[0] || Keyin[1] == Random[2] || Keyin[1] == Random[3]) {
						j++;
					}
					if (Keyin[2] == Random[2]) {
						i++;
					} else if (Keyin[2] == Random[0] || Keyin[2] == Random[1] || Keyin[2] == Random[3]) {
						j++;
					}
					if (Keyin[3] == Random[3]) {
						i++;
					} else if (Keyin[3] == Random[0] || Keyin[3] == Random[1] || Keyin[3] == Random[2]) {
						j++;
					}
					System.out.println(i + "A" + j + "B");
					i = 0;
					j = 0;
					Number++;
				} catch (Exception e) {
					System.out.println("請輸入數字，再來一次");
				}
			}
		}
	}
}