package day23_statickeyword;

public class MyConstruktor {
	int x = 3;
	int y = 5;

	MyConstruktor() {
		x += 1;
		System.out.println("-x" + " " + x);
	}

	MyConstruktor(int i) {
		this();
		this.y = i;
		x += y;
		System.out.println("-x" + " " + x);
	}

	MyConstruktor(int i, int i2) {
		this(3);
		this.x -= 4;
		System.out.println("-x" + " " + x);
	}

	public static void main(String[] args) {
		MyConstruktor mc1 = new MyConstruktor(4, 3);
	}
}
