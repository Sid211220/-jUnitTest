package jUnitTestPackage;




public class jUnitFunctions {
//	static method to add two integers
	static int AddNumbers(int N1 , int N2)
	{
		return N1+N2;
	}
//	static method to add two strings.
	static String AddStrings(String N1  , String N2)
	{
		return (N1+N2);
	}

	public static void main(String[] args) {
//		regular file execution.
		System.out.println(AddNumbers(1,2));
		System.out.println(AddStrings("Siddharth ","Yadav"));

	}

}
