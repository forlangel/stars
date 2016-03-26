package homerk04;

public class Third {

	public static void main(String[] args) {
		System.out.println(Sum(0));// TODO Auto-generated method stub
       
	}
		private static int Sum(int LastNum) {
			if (LastNum < 500) {
				int temp = LastNum;
				LastNum++;
				return Sum(LastNum) + temp;
			} else {

				return LastNum;
			}

	}
}