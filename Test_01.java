package test;

import java.util.Random;
import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Random r = new Random();
		int random = r.nextInt(1000) + 1;

		System.out.println("�A���K���q�Ʀr�����|�A�d��O1~1000");
		System.out.println("�ж}�l");

		int i = 8;
		while (i >= 0) {
			try {
				Scanner sc = new Scanner(System.in);
				int keyin = sc.nextInt();
				i--;
				if (keyin > 1000 || keyin <= 0) {
					System.out.println("�п�J�C���d�򤺪��Ʀr");
					i++;
					System.out.println("�A�ٳѤU" + i + "��");
				} else if (keyin > 0 && keyin <= 1000) {
					if (i == 0 && keyin == random || keyin == random) {
						System.out.println("���ߵ���!");
						return;
					} else if (i == 0 && keyin != random) {
						System.out.println("�S�����|�F�A���׬�:" + random);
						return;
					} else if (keyin < random) {
						System.out.println("�j�@�I");
						System.out.println("�A�ٳѤU" + i + "��");
					} else if (keyin > random) {
						System.out.println("�p�@�I");
						System.out.println("�A�ٳѤU" + i + "��");
					}
				}
			} catch (Exception e) {
				System.out.println("�п�J�Ʀr�A�A�Ӥ@��");
			}
		}
	}
}