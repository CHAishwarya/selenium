package Ishu;

public class Class1 {
	int a = 20, b = 10, c = 0;

	public void add() {
		c = a + b;
		System.out.println("Addition of a & b is :" + c);
	}

	
	public void sub() {
		c = a - b;
		System.out.println("Subtraction of a & b is :" + c);
	}

	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.add();
		obj.sub();

	}

}
