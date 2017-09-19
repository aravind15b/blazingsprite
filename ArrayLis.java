import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayLis {

	public void op() {
		ArrayList<Integer> d= new ArrayList<Integer>();
		{
			Scanner std = new Scanner (System.in);
			Scanner std1 = new Scanner (System.in);
			System.out.println("enter limit of number to like to enter:\t");
			int n= std1.nextInt();
			
			System.out.println("enter the numbers");
			for(int a=0;a<n;a++)
			{
				d.add( std.nextInt());
			}
			System.out.println("the ascending the order is :");
			Collections.sort(d);
			for(int g:d)
			{
			System.out.println(g);
			}
		System.out.println("the descending order is :");
		Collections.reverse(d);
		for(int h:d) 
		{
			System.out.println(h);
		}
	}
	
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLis s = new ArrayLis();
		s.op();
	
		// TODO Auto-generated method stub
		
	}


}
