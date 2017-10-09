///////////////////////////////////////////////////////
//Name: McKenzie Rochester							 //
//Purpose: driver program to test the Arraylist class//
///////////////////////////////////////////////////////

public class testarray {
	
	public static void main (String[] args) {
		String egg = "egg";
		String carrot = "carrot";
		String nugget = "nugget";
		String oreo = "oreo";
		String bread = "bread";
		String protein = "protein bar";
		String milk = "milk";
		String cereal = "cereal";
		String tea = "tea";
		String chicken = "chicken";
		String beef = "beef";
		
		Arraylist al = new Arraylist();
		Arraylist a = new Arraylist(12);
		
		al.add(carrot);
		if (al.get(0) == carrot) {
			System.out.println("Addition successful");
		}
		al.add(egg);
		al.add(nugget);
		al.add(oreo);
		al.add(bread);
		al.add(protein);
		al.add(milk);
		al.add(cereal);
		al.add(tea);
		al.add(chicken);
		al.add(beef);

		al.add(6,milk);
		if (al.get(6) == milk) {
			System.out.println("Insertion and shift successful");
		}
		a.add(7,bread);
		a.add(14,nugget);

		al.remove(carrot);

		System.out.println(al.get(3));
		System.out.println(al.get(10));

		System.out.println(al.size());

		System.out.println(al.isEmpty());

		System.out.println(al.isIn(carrot));

		System.out.println(a.find(bread));
		System.out.println(a.find(nugget));
	}
}