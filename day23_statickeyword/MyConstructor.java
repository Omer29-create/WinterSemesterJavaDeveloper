package day23_statickeyword;

public class MyConstructor {

	int x = 5;

	MyConstructor() {

		System.out.println("-x" + x);
	}

	MyConstructor(int x) {
		
		this();
		
		
		System.out.println("-x" + x);
	}
	
	public static void main(String[] args) {
		MyConstructor mc1 = new MyConstructor(4);
		
		MyConstructor mc2 = new MyConstructor();
	}

}
