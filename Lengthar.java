import java.util.Scanner;
public class Lengthar{
	public static void main(String[] args){
		int i, n,m;
		Scanner std=new Scanner(System.in);
		System.out.println("enter length of the first array");
		n=std.nextInt();
		System.out.println("enter length of the second array");
		m=std.nextInt();
		int[] a=new int[n];
		int[] k=new int[m];
		System.out.println("enter the  elements for the first array");
		for(i=0;i<n;i++){
			a[i]=std.nextInt();
		}
		System.out.println("enter the second elements for the first array");
		for(i=0;i<m;i++){
			k[i]=std.nextInt();
		if (a.length<k.length){
			System.out.println("Second array");
			for(i=0;i<m;i++)
				System.out.print(" " +k[i]);
		}
			else{
				System.out.println("First array");
			for(i=0;i<n;i++)
				System.out.print(" " +a[i]);
			}			
	}
	
}
}