package ExceptionDemo;

public class ExceptionsPractice {
	
	public static void main(String[] args) throws MyCheckedException {
		demo2();
		demo1();
	}

	private static void demo2() throws MyCheckedException {
		// TODO Auto-generated method stub
		throw new MyCheckedException();
		
	}

	private static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Division by 0 isnt allowed");
		}
	}

}
