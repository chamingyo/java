package twotwo;

import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("10의 자리와 1의자리가 같은지 판별하는 프로그램 입니다. ");
		System.out.println("2자리 정수를 입력해 주세요(10~99사이 정수)");
		int number = scanner.nextInt();
		
		if (number % 11 == 0) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다. ");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다. ");
		}
		scanner.close();
	}
}