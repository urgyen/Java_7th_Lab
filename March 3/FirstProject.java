import java.util.Scanner;
import Input;

public class FirstProject
{

	public static void main(String[] args)
		{
			System.out.println("Calculator: A stuff To Calculate");
			System.out.println("Press 1 to ADD ___  Press 2 to Subtract ___ Press 3 to Multiply ___ Press 4 to Divide");
			System.out.println("What do you want to perform?");
			//int In = S("What Do you Want to Perform?"));
			Scanner sc= new Scanner(System.in);
			int In= sc.nextInt();

	switch(In)
			{
				case 1:
					int z=Sum();
					System.out.println(z);
					break;

				case 2:
					int y =Subtract();
					System.out.println(y);

					break;

			//	case 3:
			//		Multiply();
			//		break;

			//	case 4:
			//		Divide();
			//		break;

				default:
					System.out.println("Wrong Input");
				}
			}


		public static int Sum()
			{
				System.out.println("Addition");
				Scanner sca= new Scanner(System.in);
								int a, b, Sum;
								System.out.println("First Number");
								a= sca.nextInt();
								System.out.println("SecongNumber");
								b= sca.nextInt();
								//	a= input("First Number");
								//	b= input("Second Number");
								Sum=a+b;
					return Sum;
			}

		 public static int Subtract()
				{
					System.out.println("Subtraction");
									int c,d, Dif;
								//	a= input("First Number");
								//	b= input("Second Number");
									Scanner scan= new Scanner(System.in);
									System.out.println("First Number");
									c= scan.nextInt();
									System.out.println("SecongNumber");
									d= scan.nextInt();

									Dif=c-d;
									return Dif;
				}

	 public static int Multipy()
					{
						System.out.println("Multiplication");
										int e,f, Mul;
									//	a= input("First Number");
									//	b= input("Second Number");

										System.out.println("First Number");
										c= Input.Get_Int();
										System.out.println("SecongNumber");
										d= Input.Get_Int();

										Dif=c-d;
										return Dif;
				}


}

