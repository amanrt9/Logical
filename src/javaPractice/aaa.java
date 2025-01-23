package javaPractice;

public class aaa {

	
	private int age=18;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa x=new aaa();
		x.setAge(15);
		
		System.out.println(x.getAge());

	}

}
