package ff;
import java.util.Scanner;

class Phone{
	Scanner scanner = new Scanner(System.in);
	String name;
	String tell;
	int n;
	public Phone(String name, String tell) {
		this.name = name;
		this.tell = tell;
	}
	String getname() {
		return name;
	}
	String gettell() {
		return tell;
	}
}

public class Phonebook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인원수>> ");
		int n;
		String name = null;
		String tell;
		String search = null;
		n = scanner.nextInt();
		Phone p[] = new Phone[n];
			for(int i = 0; i < n; i++) {
				System.out.println("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>> ");
				name = scanner.next();
				tell = scanner.nextLine();
				p[i] = new Phone(name, tell);
			}
			System.out.println("저장되었습니다...");
			while (true) {
				boolean t1 = true;
				System.out.println("검색 할 이름>> ");
				search = scanner.next();
				if(search.equals("그만")) break;
			for(int i = 0; i < n; i++) {
				if(search.equals(p[i].getname())) {
				System.out.println(p[i].getname() + "의 번호는 " + p[i].gettell());
				t1 = false;
				}
			
			}
			if(t1) {
				System.out.println(search + "이 없습니다.");
			}
		}
	}
}
