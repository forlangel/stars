package homerk04;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入:");
		String s = sc.nextLine();	
		if( sc.equals("quit"))
		{		
		System.exit(0);	
		}
		System.out.println("你输入的是:"+s);
		
			// TODO Auto-generated method stub
/*Scanner scanner = new Scanner(System.in);
String sc = scanner.next();
if(sc.equals("quit"))
{
System.exit(0);
}*/
	}

}
