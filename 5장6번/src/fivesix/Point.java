package fivesix;

class Point{ // Point 클래스 생성
	int x; // int형 변수 x생성
	int y; // int형 변수 y 생성
	public Point(int x, int y) { // (x, y)를 매개변수로 가지는 Point 생성자 생성
		this.x = x; // 매개변수x = 4행의 x
		this.y = y; // 매개변수y = 5행의 y
	}
	public void setXY1(int x, int y) { // return 을 안하는 메서드 setXY1(int x, int y) 생성
		this.x = x; // 매개변수 x = Point클래스의 x
		this.y = y; // 매개변수 y = Point클래스의 y
	}
	public String getXY() { // String 를 리턴하는 getXY메서드 생성
		return "(" + x + ", " + y + ")" ; // "(" + x + ", " + y + ")" 을 리턴함
	}
}

class ColorPoint extends Point { // Point 클래스를 상속받는 ColorPoint클래스를 생성
	int x, y; // int형 변수 x y생성
	String color; // String형 변수 color생성
	public ColorPoint(){ // ColorPoint 기본생성자 생성
		super(0, 0); // 부모클래스의 Point(x,y)를 x=0, y=0으로 초기화해서 호출
		color = "BLACK" ; //color = BLACK로 초기화
	}
	public ColorPoint(int x, int y){ // int형 변수 x,y 를 매개변수로 가지는 ColorPoint 생성자 생성
		super(x, y); // // 부모클래스의 Point(x,y) 호출 
	}
	public void setXY(int x, int y) { //리턴이없는 int형 변수 x,y 를 매개변수로 가지는 메서드 setXY생성
		setXY1(x, y); // 부모클래스의 setXY1(x, y) 실행
	}
	public void setColor(String color) { //리턴값이 없는 String형 변수 color를 매개변수로 가지는 SetColor 메서드 생성
		this.color = color; // 매개변수 color = ColorPoint 의 color
	}
	public String toString() { // String 을 리턴하는 메서드 toString생성
		return color + "색의 " + getXY(); // color + "색의 " + getXY() 를 리턴
	}
	public static void main(String[] args) { // main 문 실행
		ColorPoint zeroPoint = new ColorPoint(); // ColorPoint형 객체 zeroPoint 생성(기본생성자 실행) 단어를 잘 모르겠습니다
		System.out.println(zeroPoint.toString() + " 입니다."); // zeroPoint의 toString()은 color를 리턴하니
		// color + " 입니다." 출력
		// zeroPoint의 toString()는 color + "색의 " + getXY() 리턴하고 getXY()는 "(" + x + ", " + y + ")" 를 리턴하니
		// color + "색의 " + "(" + x + ", " + y + ")" 가 출력됨
		ColorPoint cp = new ColorPoint(10, 10); // ColorPoint형 객체 cp생성 (ColorPoint(10, 10) 실행) 
		cp.setXY(5, 5); // cp의 setXY(5, 5)는 x =5, y=5 로 초기화 시킴 
		cp.setColor("RED"); // cp의 setColor("RED")는 color를 RED로 초기화 시킴
		System.out.println(cp.toString() + " 입니다."); // cp의 toString()는 color + "색의 " + getXY() 를 리턴하고
		// getXY()는 "(" + x + ", " + y + ")"를 리턴하니 color + "색의 " + "(" + x + ", " + y + ")" 를 출력함
	}
}
