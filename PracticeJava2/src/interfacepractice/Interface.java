package interfacepractice;

public interface Interface {
	
	public void cut();
	
	public void paste();
	
	public void copy();
	
	public void keyboard();
	
	default void security() {
		commonCode();
		System.out.println("Interface security code");
		
	}
	static void audio() {
		commonCode();
		System.out.println("Laptop audio code");
	}
	
	private static void commonCode() {
		System.out.println("Common code");
	}
}
