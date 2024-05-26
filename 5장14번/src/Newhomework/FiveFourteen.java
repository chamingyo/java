package Newhomework;

interface Shape{ //인터페이스 Shape 선언
	void redraw(); // redraw라는 추상메서드 생성
	double getArea(); // getArea라는 추상 메서드 생성
}

class Circle implements Shape{ // Circle 라는 인터페이스 구현
	private int radious; // 접근 지정자 private 형식은 int 인 변수 radious 생성
	Circle(int radious){ // int형 매개변수 radious를 가지는 기본 생성자 Circle 생성
		this.radious = radious; // 객체의 radious = 매개변수의 radious
	}
	@Override
	public void redraw() { // 추상메서드 redraw를 구현
		System.out.println("--- 다시 그립니다. 반지름이 " + radious + "인 원입니다.");
		// "--- 다시 그립니다. 반지름이 " + radious + "인 원입니다." 출력
	}
	@Override
	public double getArea() { // 추상메서드 getArea를 구현
		return 3.14 * radious * radious; //  3.14 * radious * radious를 반환
	}
}

class Oval implements Shape{ // Oval 라는 인터페이스 구현
	private int i, n; // 접근 지정자 private 형식은 int 인 변수 i,n 생성
	Oval(int i, int n){ // int형 매개변수 i, n을 가지는 기본 생성자 Oval 생성
		this.i = i; //객체의 i = 매개변수의 i
		this.n = n; //객체의 n = 매개변수의 n
	}
	@Override
	public void redraw() { // 추상메서드 redraw를 구현
		System.out.println("--- 다시 그립니다. " + i + "*" + n + "에 내접하는 타원 입니다.");
		//"--- 다시 그립니다. " + i + "*" + n + "에 내접하는 타원 입니다." 출력
	}
	@Override
	public double getArea() { // 추상메서드 getArea를 구현
		return 3.14 * i * n; // 3.14 * i * n 반환
	}
}

class Rect implements Shape{ //Rect 라는 인터페이스 구현
	private int i, n; // 접근 지정자 private 형식은 int 인 변수 i,n 생성
	Rect(int i, int n){ // int형 매개변수 i, n을 가지는 기본 생성자 Rect 생성
		this.i = i; //객체의 i = 매개변수의 i
		this.n = n; //객체의 n = 매개변수의 n
	}
	@Override
	public void redraw() { // 추상메서드 redraw를 구현
		System.out.println("--- 다시 그립니다. " + i + "*" + n + "크기의 사각형 입니다.");
		//"--- 다시 그립니다. " + i + "*" + n + "크기의 사각형 입니다." 출력
	}
	@Override
	public double getArea() { // 추상메서드 getArea를 구현
		return i * n; //i * n 반환
	}
}


public class FiveFourteen { // 메인클래스 FiveFourteen 생성
	static public void main (String [] args) { // main문 생성
		Shape [] list = new Shape[3]; // Shape 인터페이스 타입의 배열 선언, 배열의 크기는 3
        list[0] = new Circle(10); // radious 가 10인 Circle 객체 생성하여 list[0]에 저장
        list[1] = new Oval(20, 30); //  i=20, n=30 인 Oval 객체 생성하여 list[1]에 저장
        list[2] = new Rect(10, 40); // i=10, n=40 인 Rect 객체 생성하여 list[2]에 저장
		
		for(int i = 0; i < list.length; i++) {// i는 0부터 배열의 크기-1까지 1++하며 반복
			list[i].redraw(); // list[i]배열에 있는 객체의 redraw()메서드 실행
		}
		for(int i = 0; i < list.length; i++) {// i는 0부터 배열의 크기-1까지 1++하며 반복
			System.out.println("면적은 " + list[i].getArea()); 
			//"면적은 " + list[i].getArea() 출력
			//list[i] 배열에 있는 객체의 getArea() 메서드 실행
		}
	}
}
