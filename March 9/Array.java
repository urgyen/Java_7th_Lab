import java.util.Scanner;
import java.io.*;

public class Array
{

	public static void main(String[] args)
		{



			//int[] b={1,2,3,4,5};
			//int[] a=new int[5];

			//for(int i=0;i<5;i++)
			//	{
			//		Scanner sc = new Scanner(System.in);
         	//		   int x = sc.nextInt();
			//		a[i]=x;
			//	}

	//		a[0]=0;
	//		a[1]=1;
	//		a[2]=10;
	//		a[3]=11;
	//		a[4]=100;

	//		for(int i=0;i<a.length;i++)
	//			{
	//				System.out.println(a[i]);
	//			}

			try{

				int[][] aa=new int[3][3];
		//try catch check
				for(int i=0;i<3;i++)
					{

			}catch(ArrayIndexOutOfBoundsException e) {
      			   System.out.println("Exception thrown  :" + e);
    		 }


						for(int j=0;j<3;i++)
								{
									Scanner sc = new Scanner(System.in);
				         			   int x = sc.nextInt();
									aa[i][j]=x;
								}
						}



				for(int i=0;i<3;i++)
						for(int j=0;j<3;i++)
							{
								System.out.println(aa[i][j]);
		}

		}
}
