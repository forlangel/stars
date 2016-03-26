package homework;

public class Six {

	public static void main(String[] args) {
		String str1="this is a test string";
		String str2=str1; 
		String str3 = new String(str1);
		System.out.println("str1==str2?"+(str1==str2));
		System.out.println("str1==str3?"+(str1==str3));
		System.out.println("str1.equals(str3)?"+(str1.equals(str3)));
// TODO Auto-generated method stub

	}

}
