package homework;

public class Second {


	public static void main(String[] args) {
		
		double a[]={90,85,66,51,69,78,88,94};
		double b[]={68,88,81,90,65,74,64,46};
		double c[]={68,90,85,88,68,70};
		double d[]={60};
		double a1,b1,c1,d1;
		a1=aver(a);
		b1=aver(b);
		c1=aver(c);
		d1=aver(d);
		System.out.println("课程编号为1001的平均成绩:"+a1);
		System.out.println("课程编号为1002的平均成绩:"+b1);
		System.out.println("课程编号为2001的平均成绩:"+c1);
		System.out.println("课程编号为3001的平均成绩:"+d1);
			
	}//定义求数组内平均值aver方法
		 public static double aver(double n[]){
			 double sum=0;
			 for(int i=0;i<n.length;i++)			 {
				 sum+=n[i];
			 }
			 return sum/n.length;
}
		 }
