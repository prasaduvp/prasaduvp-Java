package javapractice;

public class Objects {
	
	int j;
	int p;
	public Objects() {
		j = 89;
		p = 79;
	}
	public Objects(int j, int p) {
		this.j=j;
		this.p=p;
	}

	public static void main(String[] args) {
		Objects object = new Objects();
		Objects object1 = new Objects(200,300);
		Objects object2 = new Objects(980,794);
		
		//System.out.println(object.hashCode());
		//System.out.println(object1.hashCode());
		//System.out.println(object2.hashCode());
		
		//System.out.println(object.add());
		//System.out.println(object1.add());
		//System.out.println(object2.add());
		
		System.out.println(object.j);
		System.out.println(object.p);
		System.out.println(object1.j);
		System.out.println(object1.p);
		System.out.println(object2.j);
		System.out.println(object2.p);
	}
	public int add (){
		return j+p;
	}

}
