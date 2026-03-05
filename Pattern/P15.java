import java.util.*;
public class P15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++)
				System.out.print(" ");
			for(int j=i+1;j>0;j--)
				System.out.print(j);
			int count=2;
			for(int j=0;j<i;j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
