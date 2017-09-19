import java.util.Scanner;
public class Copyar{
	public static void main(String[] args){
		int i, n;
		Scanner std=new Scanner(System.in);
		System.out.println("enter limit of the array");
		n=std.nextInt();
		int[] a=new int[n];
		int[] k=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++){
				a[i]=std.nextInt();
		}
		for(i=0;i<n;i++){
			k[i]=a[i];
		}
		System.out.println("the copied is");
		for(i=0;i<n;i++){
			System.out.print(" "+k[i]);
		}
			
	}
	
}