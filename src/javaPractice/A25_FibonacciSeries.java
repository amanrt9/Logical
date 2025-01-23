package javaPractice;

public class A25_FibonacciSeries {

	public static void main(String[] args) {

		int num=10;
		int first=0;
		int second=1;
		
		System.out.print("Fibonacci series: "+first+" "+second);
		
		for(int i=2;i<=num;i++) {
			int sum=first+second;
			System.out.print(" "+sum);
			first=second;
			second=sum;
		}
	}

}
