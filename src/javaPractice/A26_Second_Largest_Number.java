package javaPractice;

public class A26_Second_Largest_Number {

	public static void main(String[] args) {

		int arr[]= {4,1,6,5,9,10,3};
		int max=0;
		int secondMax=0;

		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}			
		}
		System.out.println("Second largest number in array: "+secondMax);
	}

}
