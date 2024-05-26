// app 패키지에 속한 GraphicEditor 클래스 선언
package app;

import base.Shape; // base 패키지에 있는 Shape 클래스를 import
import derived.Circle; // derived 패키지에 있는 Circle 클래스를 import

public class GraphicEditor { // GraphicEditor 클래스 선언
	public static void main(String[] args) { 
		// 프로그램 실행의 시작점인 main 메서드 정의
		Shape shape = new Circle(); 
		// Shape 타입의 변수 shape를 선언하고 Circle 객체로 초기화
		shape.draw(); 
		// shape 객체의 draw 메서드를 호출
	}
}