package hometask3;


import java.util.Scanner;
public class calculator
{
    public static void main(String[] args) 
    {
        float a,b,res;
        char choice,ch;
        Scanner scan=new Scanner(System.in);
        do
        {
            System.out.print("1.addition\n");
            System.out.print("2.subtraction\n");
            System.out.print("3.multiplication\n");
            System.out.print("4.division\n");
            System.out.print("5.exit\n\n");
            System.out.print("enter your choice\n");
            choice=scan.next().charAt(0);
            switch(choice)
            {
                case'1' : System.out.print("enter 2 nos\n");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a+b;
                System.out.print("result="+res);
                break;
                case'2' : System.out.print("enter 2 nos\n");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a-b;
                System.out.print("result="+res);
                break;
                case'3' : System.out.print("enter 2 nos\n");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a*b;
                System.out.print("result="+res);
                break;
                case'4' : System.out.print("enter 2 nos\n");
                a=scan.nextFloat();
                b=scan.nextFloat();
                res=a/b;
                System.out.print("result="+res);
                break;
                case'5' : System.exit(0);
                break;
                default:System.out.print("wrong choice");
                break;
            }
            System.out.print("\n.........\n");
        }while(choice!=5);
    }

	


