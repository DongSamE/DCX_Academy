package Ex02_ClassObject;

public class Ex04_Constructor {
	public static void main(String[] args) {
		//생성자
		//객체가 생성될떄 자동호출되는 메소드
		//new 를 통해 객체를 생성할 때 호출
		//return 불가능
		//생성자의 메소드 이름은 클래스와 동일해야함
		
		Ex04_cons dong = new Ex04_cons();
		System.out.println(dong);
		
		//객체에 넣고싶은 값을 넣으면서 생성
		Ex04_cons dong1 = new Ex04_cons("이동진",27);
		System.out.println(dong1);
		
	}
}
