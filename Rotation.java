# I am adding this comment

package arrays;

import java.util.Scanner;

public class Rotation {
	
	 int[] rotate(int a[], int s, int t) {
		for(int i=0; i<t;i++) {
			lRotate(a,s);
		}
		return a;
		
}
void lRotate(int arra[],int siz) {
			
			int temp=arra[0];
			for(int i=0 ; i < siz-1 ; i++) {
				arra[i]=arra[i+1];
				}
			arra[siz-1]=temp;
}

 void print(int a[],int size) {
	for(int x:a)
		System.out.print(x+" ");
	System.out.println();
	
}
		
	 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of test cases");
		int testCase=sc.nextInt();
		int array[]=new int[testCase];

		while(testCase>0) {
			System.out.println("emter size and times of rotation");
		int size=sc.nextInt();
		int times=sc.nextInt();
		System.out.println("enter array elements");
		int ar[]=new int[size];
		for(int i=0;i<size;i++)
			ar[i]=sc.nextInt();
		Rotation r=new Rotation();
		r.rotate(ar, size, times);
		r.print(ar,size);
		
		testCase--;
			
		}
		
	}

}
