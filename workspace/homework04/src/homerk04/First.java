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
		//��һ�ſγ�
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
		    System.out.println("��һ��ƽ������"+m1);
			System.out.println("��һ�ųɼ���߷���"+iMAX1+"��"+r1+"��ͬѧ");
			System.out.println("��һ�ųɼ���ͷ���"+iMIN1+"��"+k1+"��ͬѧ");
			//�ڶ��ſγ�
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
			    System.out.println("�ڶ���ƽ������"+m2);
				System.out.println("�ڶ��ųɼ���߷���"+iMAX2+"��"+r2+"��ͬѧ");
				System.out.println("�ڶ��ųɼ���ͷ���"+iMIN2+"��"+k2+"��ͬѧ");
			
				//�����ſγ�
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
				    System.out.println("������ƽ������"+m3);
					System.out.println("�����ųɼ���߷���"+iMAX3+"��"+r3+"��ͬѧ");
					System.out.println("�����ųɼ���ͷ���"+iMIN3+"��"+k3+"��ͬѧ");
	
	}
}
