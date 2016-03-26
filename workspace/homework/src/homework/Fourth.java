package homework;


public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//采用多个一维数组
		
		int[] a=new int[10];
		int[] b=new int[10];
		for(int i=1;i<=a.length-1;i++)
			for(int j=1;j<=b.length-1;j++)
			{
				if(i>=j)
				{
					a[i]=i;
					b[j]=j;
					int p=a[i]*b[j];
					System.out.print(i+"*"+j+"="+p+"\t");
					if(i==j)
						System.out.println();
				}
			}
	}
}