package test;

import java.util.Random;
import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Random r = new Random();
		int random = r.nextInt(1000) + 1;

		System.out.println("你有八次猜數字的機會，範圍是1~1000");
		System.out.println("請開始");

		int i = 8;
		while (i >= 0) {
			try {
				Scanner sc = new Scanner(System.in);
				int keyin = sc.nextInt();
				i--;
				if (keyin > 1000 || keyin <= 0) {
					System.out.println("請輸入遊戲範圍內的數字");
					i++;
					System.out.println("你還剩下" + i + "次");
				} else if (keyin > 0 && keyin <= 1000) {
					if (i == 0 && keyin == random || keyin == random) {
						System.out.println("恭喜答對!");
						return;
					} else if (i == 0 && keyin != random) {
						System.out.println("沒有機會了，答案為:" + random);
						return;
					} else if (keyin < random) {
						System.out.println("大一點");
						System.out.println("你還剩下" + i + "次");
					} else if (keyin > random) {
						System.out.println("小一點");
						System.out.println("你還剩下" + i + "次");
					}
				}
			} catch (Exception e) {
				System.out.println("請輸入數字，再來一次");
			}
		}
	}
}