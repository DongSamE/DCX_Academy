package Interface;

public class Parrot extends Animal implements Speak{

	   String name;
	   String food;
	   
	   public Parrot(String n, String e) {
	      this.name = n;
	      this.food = e;
	      
	      
	   }
	   @Override
	   public void move() {
	      // Animal에서 상속 받기
	      System.out.println("Prr Prr" + this.name + " is eating" + this.food);
	   }
	   
	   // Speak 인터페이스 메소드 재 정의
	   @Override
	   public void speaking() {
	      System.out.println("안녕ㅇㅇ 안녕ㅇㅇ");
	      
	   }
	   @Override
	   public void barking() {
	      System.out.println("짹ㅉ0쨱ㅉ");
	      
	   }

}
