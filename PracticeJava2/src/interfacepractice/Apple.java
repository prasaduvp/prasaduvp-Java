package interfacepractice;

public class Apple implements Interface {

	@Override
	public void cut() {
		System.out.println("Apple cut code");
		
	}

	@Override
	public void paste() {
		System.out.println("Apple paste code");
		
	}

	@Override
	public void copy() {
		System.out.println("Apple copy code");
		
	}

	@Override
	public void keyboard() {
		System.out.println("Apple keyboard code");
		
	}
	
	public void camera() {
		System.out.println("Apple camera code");
	}
	
	public void security() {
		System.out.println("Apple security code");
	}

}
