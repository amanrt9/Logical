package javaPractice;

public class A02_StringWordReverse {

	public static void main(String[] args) {

		String name="Hi good evening"; //answer: iH doog gnineve 

			
		String[] index=name.split(" ");
		
		for(String word: index)
		{
			String rev="";
			
			for(int i=word.length()-1;i>=0;i--) 
			{
		      rev+=word.charAt(i);
			}
	
			System.out.print(rev+" ");
		}
		
		
	}

}
