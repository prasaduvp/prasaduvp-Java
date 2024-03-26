package variables;

public class InstanceNonstaticfield {

	int id = 108;
	String name = "Ulli Vara prasad";
	int weight = 50;
	
	public static void main(String[] args) {
		
		InstanceNonstaticfield InstanceNonstaticfield = new InstanceNonstaticfield();
		System.out.println(InstanceNonstaticfield.id);
		System.out.println(InstanceNonstaticfield.name);
		System.out.println(InstanceNonstaticfield.weight);
	}

}
