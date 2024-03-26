package abstractClass;

public abstract class SampleAC implements Laptop{

	@Override
	public void cut() {
		System.out.println("Laptop cut code");
	}

	@Override
	public void copy() {
		System.out.println("Laptop copy code");
	}

	@Override
	public abstract void paste();

	@Override
	public abstract void keyboard();
	
	

}
