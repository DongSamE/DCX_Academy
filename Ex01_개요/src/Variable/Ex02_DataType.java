package Variable;

public class Ex02_DataType {

	public static void main(String[] args) {
		// General DataType
		
		// Logic Data - Boolean(1byte)
		//				True(1) or False(0)
		boolean bool = true;
		System.out.println(bool);
		
		// Character Data - Char(2byte)
		//					'' only 1 character
		char firstName = '이';
		System.out.println(firstName);
		
		// String Data
		//				""
		String lastName = "동진";
		System.out.println(lastName);
		
		// Integer Data
		// byte(1byte), short(2byte), int(4byte), long(8byte)
		
		// Floating Data
		// float(4byte), double(8byte)
		double numDouble = 3.14;
		float  numFloat1 = (float)3.14;
		float  numFloat2 = 3.14f;			// f = Keyword!
		
		// Change DataType Casting - " (DataType)Value "
		// Allow Loss about data
		byte byteNum = (byte)128;
		System.out.println(byteNum);
		// Float -> Int : Delete decimal
		
		// Change DataType Promotion
		int numInt = 10;
		double Int_Double = numInt;
		System.out.println(Int_Double);
	}

}
