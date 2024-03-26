package javapractice;

public class ConstructorPractice {
	public int j;

	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice(794);
		System.out.println(cp.j);
	}
	public ConstructorPractice() {
		j = 30;
	}
	public ConstructorPractice(int p) {
		j=p;
	}
}
