package Ex02_ClassObject;

public class Ex04_cons {
	//생성자를 정의하지 않으면 자동으로 기본 생성자가 정의됨(컴파일러에 의해))
	String name;
	int age;
	public Ex04_cons() {
		this.name = "Dong jin";
		this.age = 27;
	
	}	
	public Ex04_cons(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
}
//생성자 오버로딩
// 생성자의 이름이 같아도, 매개변수의 타입이나 갯수가 다르다면 다른 것으로 판단
	