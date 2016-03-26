package homerk04;

public class First {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  student[][] = new int[35][3];
		for(int i=0; i<35; i++)
		{
		    for(int j=0; j<3; j++)
			{			    
				{				   
					student[i][j] = (int)(Math.random() *51 )+ 50;
				}
			}
		}
		//第一门课程
   	 	int iMAX1,iMIN1;
   	    int r1,k1;
   	    float m1=0;
   	 	int iSUM1=0;
		iMIN1 = iMAX1 = student[0][0];
		r1=k1=0;
		 
		 for(int i=0;i<35;i++)
	        {
			 iSUM1+=student[i][0];
             m1=(float)iSUM1/i;
	            for(int j=0;j<3;j++)
	            {
	                if(iMAX1<student[i][0])
	                {
	                	iMAX1=student[i][0];
	                    r1=i;	                    
	                }
	                
	                
	                if(iMIN1>student[i][0])
	                {
	                	iMIN1=student[i][0];
	                    k1=i;	                    
	                }
	               
	            }
	            
	        }
		    System.out.println("第一门平均分是"+m1);
			System.out.println("第一门成绩最高分是"+iMAX1+"是"+r1+"号同学");
			System.out.println("第一门成绩最低分是"+iMIN1+"是"+k1+"号同学");
			//第二门课程
	   	 	int iMAX2,iMIN2;
	   	    int r2,k2;
	   	    float m2=0;
	   	 	int iSUM2=0;
			iMIN2 = iMAX2 = student[0][1];
			r2=k2=0;
			 
			 for(int i=0;i<35;i++)
		        {
				 iSUM2+=student[i][1];
	             m2=(float)iSUM2/i;
		            for(int j=0;j<3;j++)
		            {
		                if(iMAX2<student[i][1])
		                {
		                	iMAX2=student[i][1];
		                    r2=i;	                    
		                }
		                
		                
		                if(iMIN2>student[i][1])
		                {
		                	iMIN2=student[i][1];
		                    k2=i;	                    
		                }
		               
		            }
		            
		        }
			    System.out.println("第二门平均分是"+m2);
				System.out.println("第二门成绩最高分是"+iMAX2+"是"+r2+"号同学");
				System.out.println("第二门成绩最低分是"+iMIN2+"是"+k2+"号同学");
			
				//第三门课程
		   	 	int iMAX3,iMIN3;
		   	    int r3,k3;
		   	    float m3=0;
		   	 	int iSUM3=0;
				iMIN3 = iMAX3 = student[0][2];
				r3=k3=0;
				 
				 for(int i=0;i<35;i++)
			        {
					 iSUM3+=student[i][2];
		             m3=(float)iSUM3/i;
			            for(int j=0;j<3;j++)
			            {
			                if(iMAX3<student[i][2])
			                {
			                	iMAX3=student[i][2];
			                    r1=i;	                    
			                }
			                
			                
			                if(iMIN3>student[i][2])
			                {
			                	iMIN3=student[i][2];
			                    k3=i;	                    
			                }
			               
			            }
			            
			        }
				    System.out.println("第三门平均分是"+m3);
					System.out.println("第三门成绩最高分是"+iMAX3+"是"+r3+"号同学");
					System.out.println("第三门成绩最低分是"+iMIN3+"是"+k3+"号同学");
	
	}
}
