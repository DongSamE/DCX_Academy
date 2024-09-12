package Variable;

public class Ex01_Variable {

	public static void main(String[] args) {
		// Variable 
		//	-	Declaration(선언)
		//		Define a
		int a; // Variable a can only int

		//	-	Assign(할당)
		//		Assignment Operator, Put value to Variable * Right -> Left
		a = 20;
		
		int b = 30 ;// Declaration + Assign
		
		
		//Red Line = Compile Error -> Cursor to red line to check Error
		//Yellow Line = Caution -> Cursor to Yellow line to get tips
		
		//	NOTICE!
		//	-VAR name != Keyword
		//	-CAN NOT Duplicate name
		
		
		// Constant
		//	-	Declaration(선언)
		final int c;
		//	-	Assign(할당)
		c = 30;
		//	-	Substitution(대입)
		//			Constant can Reassign
		//	-	Declaration + Assign
		final int d = 50;
		
		//	Naming Rule
		//	Hungarian	: Datatype + Name
		//	Camel		: Capital Second word	(General)
		//	Pascal		: Capital Every word	(Class, Project)
		//	UnderBar	: Word + '_' + Word		(Constant)
	}

}
