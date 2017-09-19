import java.util.Scanner;
public class Arm{
public static void main(String[] args){
	int a,b,sum=0,temp;
	Scanner std =new Scanner(System.in);
	System.out.println("Enter the number");
	a=std.nextInt();
	for(temp=a;a>0;a=a/10)
	{
		b=a%10;
		sum=sum+(b*b*b);
	}
	if(sum==temp)
		System.out.println("is a armstrong number");
	else
		System.out.println("it is not a armstrong number");
	}
	

}
