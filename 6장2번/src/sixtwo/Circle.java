package sixtwo;

public class Circle { //Circle 클래스 생성
	private int x,y,radius; // private int형 맴버변수 x y radius 생성
	public Circle(int x, int y, int radius) { 
		// int형 변수 x y radius를 맴버변수로 가지는 생성자 생성
		this.x = x; // 멤버 변수 x에 생성자의 매개변수 x를 할당
		this.y = y; // 멤버 변수 y에 생성자의 매개변수 y를 할당
		this.radius = radius; // 멤버 변수 radius에 생성자의 매개변수 radius를 할당
	}
	public String toString() {
		// toString 메서드 재정의
		return "Circle(" + x + "," + y + ") 반지름 " + radius; 
		// Circle 객체를 "(x, y) 반지름 radius" 으로 반환
	}
	public boolean equals(Object obj) {
		// 객체의 같음 비교하는 equals 메서드 재정의
		Circle c = (Circle)obj; 
		// 매개변수로 받은 Object 타입을 Circle 타입으로 업캐스팅...?
		if(x == c.x && y == c.y) 
			// 현재 객체의 x와 y가 비교 대상 객체의 x와 y와 같은지 확인
			return true; // 같다면 true 반환
		else return false; // 다르다면 false 반환
	}

public static void main(String[] args) {
	// main 메서드 정의
	Circle a = new Circle(2, 3, 5); 
	// x=2 y=3 radius=5를 가진 Circle 객체 a 생성
	Circle b = new Circle(2, 3, 30); 
	// x=2 y=3 radius=30를 가진 Circle 객체 b 생성
	System.out.println("원 a : " + a); 
	// a 객체의 toString 메서드를 호출하여 "원 a : a객체" 형식으로 출력
	// toString 메서드애의해 a객체는 "(2,3) 반지름 5" 으로 출력
	System.out.println("원 b : " + b); 
	// b 객체의 toString 메서드를 호출하여 "원 b : b객체" 형식으로 출력
	// toString 메서드애의해 b객체는 "(2,3) 반지름 30" 으로 출력
	if(a.equals(b))
		// a와 b 객체의 equals 메서드를 사용하여 같은지 비교
		System.out.println("같은 원"); 
		// equals 메서드가 true를 반환하면 "같은 원" 출력
	else
		System.out.println("서로 다른 원"); 
		// equals 메서드가 false를 반환하면 "서로 다른 원" 출력
	}
}