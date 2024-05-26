package homework;

import java.util.Scanner; // 스캐너 사용을 위해 정의

public abstract class Shape{ // 추상 클래스 Shape 정의
	private Shape next; // 다음 도형을 가리키는 링크
	public Shape() {
		next = null; // 포인터를 널값으로 초기와
	}
	public void setNext(Shape obj) {
		next = obj; // next포인터를 obj 포인터로 설정
	}
	public Shape getNext() {
		return next; // 다음 노드 반환
	}
	public abstract void draw(); // 도형을 그리는 추상 메서드
}

class Line extends Shape{// Shape 를 상속받은 Line 클래스 생성
	@Override
	public void draw() {
		System.out.println("Line"); // Shape의 추상메서드draw()를 정의
	}
}

class Rect extends Shape{ // Shape 를 상속받은 Rect 클래스 생성
	@Override
	public void draw() {
		System.out.println("Rect"); // Shape의 추상메서드draw()를 정의
	}
}

class Circle extends Shape{ // Shape 를 상속받은 Circle 클래스 생성
	@Override
	public void draw() {
		System.out.println("Circle"); // Shape의 추상메서드draw()를 정의
	}
}

class GraphicEditor{ //GraphicEditor클래스 생성
	Shape start = null, end = null; // 링크드리스트의 시작과 끝을 나타내는 변수 생성하고 널값으로 초기화
	Scanner s = new Scanner(System.in); // 입력을 받기 위한 스캐너 객체생성

	public void add() { // add 메서드 추가
		Shape shape = null; // Shape 형 변수 shape 생성후 널으로 초기화
		System.out.print("Line(1), Rect(2), Circle(3) >> "); // 사용법 안내
		int n = s.nextInt(); // int형 변수  n에 입력받은 값을 저장
		switch(n) { // n의 값에 따라 바뀌는 스위치문 생성
			case 1 : // n =1 이면
				shape = new Line(); // shape 를 Line 객체로 업캐스팅...?
				break; //스위치문 종료
			case 2 : // n =2 이면
				shape = new Rect(); // shape 를 Line 객체로 업캐스팅...?
				break; //스위치문 종료
			case 3 : // n =3 이면
				shape = new Circle(); // shape 를 Line 객체로 업캐스팅...?
				break; //스위치문 종료
		}
		if (start == null) { // 링크드 리스트의 시작점이 비어있는 경우
			start = shape; // 시작점을 위에서 생성한 shape로 설정
			end = shape; // 끝점도 위에서 생성한 shape로 설정
		}
		else { // 링크드리스크에 이미 값이 존재하면
			end.setNext(shape); // 현재의 끝점 다음 위치에 shape 설정
			end = shape; // 방금 설정한 shape 지점을 끝점으로 설정
		}
	}

	public void minus() { // minus 매서드 생성
		Shape n = start; // n를 시적점으로 초기화 현재의 노드 포인터로 생각
		Shape p = start; // p를 시작점으로 초기화 이전의 노드 포인터로 생각
		int q; //int형 변수 n 생성
		System.out.print("삭제할 도형의 위치>> "); // 사용법 출력
		q = s.nextInt(); // 입력받은 값을 q에 저장
		if(q==1) { // q가 1이면
			if(start == end) { //만약 시작점과 끝점이 같으면
				start = end = null; // 시작점과 끝점을 널값으로 초기화
			}
			else { // 시작점과 끝점이 다르면
				start = start.getNext(); // 시작점을 시작점다음의 노드로 이동 즉 첫번째 노드 삭제
			}
			return; // 메서드종료
		}
		for(int i = 1; i<q; i++) { // n-1번 반복
			p = n; // p포인터가 n포인터값이랑 같아짐
			n = n.getNext(); // n포인터를 한칸 앞으로 이동
		}
		if(n == null) { // n포인터 값이 널값이면
			System.out.println("삭제할 수 없습니다."); // 삭저할 수 없습니다 출력
			return; // 이 메서드 종료
		}
		p.setNext(n.getNext()); // 이전노드의 포인터를 현재노드의 다음 포인터로 설정
		if(n == end) { // 현재 노드의 포인터가 end랑 같으면
			end = p; // 이전노드의 포인터를 마지막으로 설정
		}
	}

	public void view() { // view 메서드 생성
		Shape s = start; // s는 첫번째 노드의 포인터로 설정
		while(s  != null) { // s값이 null이 아닐 때까지 반복
			s.draw(); // 오버라이딩된 draw 실행
			s = s.getNext(); // s포인터가 다음 노드로 이동
		}
	}

	public void run() { // 첫 시작을 하는 run 메서드 생성
		boolean k = true; // 불린 변수 k는 true로 초기화해서 생성
		System.out.println("그래픽 에디터 beauty을 실행합니다."); // 그래픽 에디터 beauty을 실행합니다. 출력
		while(k) { // k가 true면 계쏙 반복
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> "); //삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>  출력
			int n = s.nextInt(); // n에 입력받은 값을 저장
			switch(n) { // 스위치문 생성
				case 1: { // n =1 이면
					add(); // add()메서드 실행
					break; // 스위치문 종료
				}
				case 2: { // n =2 이면
					minus(); //minus() 메서드 실행
					break; // 스위치문 종료
				}
				case 3: { // n =3 이면
					view(); // view()메서드 실행
					break; // 스위치문 종료
				}
				case 4:{ // n =4 이면
					System.out.println("beauty를 종료합니다"); // beauty를 종료합니다 출력
					k = false; // k를 false로 변경
					break; // 스위치문 종료
				}
			}
		}
	}
}

class running{ // 메인클래스 생성
	public static void main(String args[]) { //메인문 생성
		GraphicEditor e = new GraphicEditor(); // GraphicEditor 객체 생성
		e.run(); // 프로그램 실행
	}
}

