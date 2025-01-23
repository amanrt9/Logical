package javaPractice;

public class A21_MultiplicationTable {

	public static void main(String[] args) {

		int num=5;
		int mul=1;
		
		for(int i=1;i<=10;i++) {
			mul=num*i;
			System.out.println(num+" x "+i+" = "+mul);
		}
	}

}
