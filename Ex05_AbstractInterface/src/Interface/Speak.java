package Interface;

public interface Speak{
	
	//Interface : 클래스가 공통으로 구현해야 하는 기능 미리 정의
	//프로젝트 설계중 설계도면 ||작업명세서 같은 느낌
	
	// 1. field data must be Constant (final.)
	// 2. Must have 'static' keyword
	// 	  - static : fixed area, first order during execute
	// 3. Interface only have Abstract Method
	//	  - Method : public, abstract
	// 4. Multiple Inheritance
	// 5. Can NOT make constructor
	// 6. must override parent interface's Method
	// interface - implements
	   public abstract void speaking();
	   public abstract void barking();
	  
	      
	   
}
