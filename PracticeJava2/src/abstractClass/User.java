package abstractClass;

public class User {

	public static void main(String[] args) {
		
//		Lenovo l=new Lenovo();
		
		Laptop l= new Lenovo();
		l.copy();
		l.paste();
		l.cut();
		
		Laptop hp = new Hp();
		hp.copy();
		hp.cut();
		hp.keyboard();
		hp.paste();
//		hp.printing();

	}

}
