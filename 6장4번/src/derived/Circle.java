// derived 패키지에 속한 Circle 클래스 선언
package derived;

import base.Shape; 
// base 패키지에 있는 Shape 클래스를 import

public class Circle extends Shape { 
	// Circle 클래스 선언 및 Shape 클래스를 상속
	public void draw() { 
		// draw 메서드를 재정의 (오버라이드)
		System.out.println("Circle"); 
		// "Circle" 문자열을 출력
	}
}