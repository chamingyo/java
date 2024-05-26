package homework;
import java.util.Scanner; //Scanner 클래스 포함

class Seat{ // Seat 클래스 생성
	Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	String S[]; // String 클래스 배열 S[]생성
	String A[]; //String 클래스 배열 A[]생성
	String B[]; //String 클래스 배열 B[]생성
	
	public Seat() //생성자 생성
	{
		S = new String[10]; // S 배열의 크기는 10으로 정의하면서 생성
		A = new String[10]; // A 배열의 크기는 10으로 정의하면서 생성
		B = new String[10]; // B 배열의 크기는 10으로 정의하면서 생성
		for(int i = 0; i < 10; i++) // i가 0부터 9까지 1씩증가하며 반복
		{
			S[i] = "---"; // S[i] 에 --- 입력
			A[i] = "---"; // A[i] 에 --- 입력
			B[i] = "---"; // B[i] 에 --- 입력
		}
	}
	public void Print() { // Print 메서드 생성
		System.out.print("S>> "); // S출력
		for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
			System.out.print(S[i] + " "); // S[i] 출력
		}
		System.out.println(" "); // 줄바꿈
		System.out.print("A>> "); // A출력
		for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
			System.out.print(A[i] + " "); // A[i] 출력
		}
		System.out.println(" "); // 줄바꿈
		System.out.print("B>> "); // B출력
		for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
			System.out.print(B[i] + " "); // B[i] 출력
		}
		System.out.println(" "); // 줄바꿈
		System.out.println("<<<조회를 완료하였습니다.>>> "); // 조회를 완료했습니다 출력
	}
	public void Setting() { // Setting 메서드 생성
		System.out.print("좌석구분 S(1), A(2), B(3)>> "); // 좌석구분 S(1), A(2), B(3)>> 출력
		int s1; // int 형 변수 s1 생성
		s1 = scanner.nextInt(); // 입력받은 값을 s1에 넣음
		String name = null; // Stirng 형 변수 name 생성 및 null 값으로 초기화
		int number = 0; // int 형 변수 number 생성 및 0으로 초기화
		if(s1 == 1) { // 만약 s1 이 1이면 
			System.out.print("S>> "); // S>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(S[i] + " "); // S[i] 출력
			}
			System.out.println(" "); // 줄 바뀜
			System.out.print("이름>> "); // 이름>> 출력
			name = scanner.next(); // 입력받은 값을 name 에 저장
			System.out.print("번호>> "); // 번호>> 출력
			number = scanner.nextInt(); // 입력받은 값을 number 에 저장
			try { // try문 실행(오류가 생기면 catch 문으로 이동)
				if(!S[number-1].equals("---")) { // 만약 S[number-1] 이 --- 이 아니면
					System.out.println("이미 예약된 좌석."); // 이미 예약된 자석 출력
				}
				if(number <= 10) { // 만약 number 이 10보다 작거나 같으면
					S[number-1] = name; // S[number-1] = name 으로 초기화
				}
			}
			catch(ArrayIndexOutOfBoundsException e){ // 배열의 최대값을 넘는 오류가 발생하면
				System.out.println("없는 자리."); // 없는 자리 출력
				}
			}
		if(s1 == 2) { // 만약 s1 이 2라면
			System.out.print("A>> "); // A>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(A[i] + " "); // A[i]  출력
			}
			System.out.println(" "); // 줄바꿈
			System.out.print("이름>> "); // 이름>> 출력
			name = scanner.next(); //입력받은 값을 name 에 저장
			System.out.print("번호>> "); // 번호>> 출력
			number = scanner.nextInt(); // 입력받은 값을 number 에 저장
			try {  // try문 실행(오류가 생기면 catch 문으로 이동)
				if(!A[number-1].equals("---")) { // 만약 A[number-1] 이 --- 이 아니면
					System.out.println("이미 예약된 좌석."); // 이미 예약된 자석 출력
				}
				if(number <= 10) { // 만약 number 이 10보다 작거나 같으면
					A[number-1] = name; // A[number-1] = name 으로 초기화
				}
			}
			catch(ArrayIndexOutOfBoundsException e){ // 배열의 최대값을 넘는 오류가 발생하면
				System.out.println("없는 자리."); // 없는자리 출력
				}
			}
		if(s1 == 3) {
			System.out.print("B>> "); // B>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(B[i] + " "); // B[i]출력
			}
			System.out.println(" "); // 줄 바꿈
			System.out.print("이름>> "); // 이름>> 출력
			name = scanner.next(); //입력받은 값을 name 에 저장
			System.out.print("번호>> "); // 번호>> 출력
			number = scanner.nextInt(); // 입력받은 값을 number 에 저장
			try { // try문 실행(오류가 생기면 catch 문으로 이동)
				if(!B[number-1].equals("---")) { // 만약 B[number-1] 이 --- 이 아니면
					System.out.println("이미 예약된 좌석."); // 이미 예약된 자석 출력
				}
				if(number <= 10) { // 만약 number 이 10보다 작거나 같으면
					B[number-1] = name; // B[number-1] = name 으로 초기화
				}
			}
			catch(ArrayIndexOutOfBoundsException e){ // 배열의 최대값을 넘는 오류가 발생하면
				System.out.println("없는 자리."); // 없는자리 출력
			}
		}
	}
	public void Cancel() { // Cancel 메서드 생성
		System.out.print("좌석 S:1, A:2, B:3 >> "); //좌석 S:1, A:2, B:3 >> 출력
		int s1; // int형 변수 s1생성
		s1 = scanner.nextInt(); // 입력받은 값을 s1에 저장
		String name = null; // String 형 변수 name 생성 및 null 값으로 초기화
		if(s1 == 1) { // 만약 s1이 1이면
			System.out.print("S>> "); // S>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(S[i] + " "); // S[i]  출력
			}
			System.out.println(" "); // 줄바꿈
				System.out.print("이름>> "); // 이름>> 출력
				name = scanner.next(); // 입력받은 값을 name 에 저장
				for(int i = 0; i < 10; i++) { // i가 0부터 9까지 1씩증가하며 반복
					if(name.equals(S[i])) { // 만약 name 이랑 S[i]값이 같으면
					S[i] = "---"; // S[i]는 --- 으로 초기화
				}
					else ; // 아니면 ;
			}
		}
		if(s1 == 2) { // 만약 s1이 2이면
			System.out.print("A>> "); // A>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(A[i] + " "); // A[i]  출력
			}
			System.out.println(" "); // 줄바꿈
				System.out.print("이름>> "); // 이름>> 출력
				name = scanner.next(); // 입력받은 값을 name 에 저장
				for(int i = 0; i < 10; i++) { // i가 0부터 9까지 1씩증가하며 반복
					if(name.equals(A[i])) { // 만약 name 이랑 A[i]값이 같으면
					A[i] = "---"; // A[i] 를 --- 으로 초기화
				}
					else ; // 아니면 ;
			}
		}
		if(s1 == 3) { // 만약 s1이 3이면
			System.out.print("B>> "); // B>> 출력
			for(int i = 0; i<10; i++) { // i가 0부터 9까지 1씩증가하며 반복
				System.out.print(B[i] + " "); // B[i]  출력
			}
			System.out.println(" "); // 줄바꿈
				System.out.print("이름>> "); // 이름>> 출력
				name = scanner.next(); // 입력받은 값을 name 에 저장
				for(int i = 0; i < 10; i++) { // i가 0부터 9까지 1씩증가하며 반복
					if(name.equals(B[i])) { // 만약 name 이랑 B[i]값이 같으면
					B[i] = "---"; // B[i] 를 --- 으로 초기화
				}
					else ; // 아니면;
			}
		}
	}
}
	
public class Program { // Program 클래스 생성
	public static void main(String [] args) { //메인 메서드 실행
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		Seat Seat = new Seat(); // Seat 객체 생성
		int n; // int 형 변수 n 생성
		System.out.println("명품콘서트홀 예약 시스템입니다."); //명품콘서트홀 예약 시스템입니다. 출력
		while (true) { // 계속 반복
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> "); //예약:1, 조회:2, 취소:3, 끝내기:4 >>  출력
			n = scanner.nextInt(); // 입력받은값을 n에 저장
			switch(n) { //n에 대해서 케이스별로 분류해서 실행
			case 1: // 만약 n 이 1이면
				Seat.Setting(); // Seat클래스의 Setting() 메서드 실행
				continue; // while 문 처음으로 돌아가기
			case 2: // 만약 n 이 2이면
				Seat.Print(); // Seat클래스의 Print() 메서드 실행
				continue; // while 문 처음으로 돌아가기
			case 3: // 만약 n 이 3이면
				Seat.Cancel(); // Seat클래스의 Cancel() 메서드 실행
				continue; // while 문 처음으로 돌아가기
			case 4: // 만약 n 이 4이면
				break; // while문 종료
			default: // 1, 2, 3, 4 가 아니면
				continue; // while 문 처음으로 돌아가기
			}
			break; // while 문 종료
		}
	}
}