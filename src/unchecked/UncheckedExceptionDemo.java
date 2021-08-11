package unchecked;

public class UncheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.age=70;
		user.work();
	}
}

class User{
	int age=10;
	public void work() {
		// TODO Auto-generated method stub
		if(age<=18) {
			throw new MyUncheckedException("Dont be below 18");
			//System.out.println("this cannot be reached");
		}else if(age>60) {
			throw new OverAgeException("dont be a boomer");
		}
	}
}
