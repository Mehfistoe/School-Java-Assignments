import java.util.*;
public class testFacebook_Graphics_Vector {
	public static void main(String[] args) {
		
		Vector<FacebookPerson_Graphics> fbp = new Vector<FacebookPerson_Graphics> (10,5);
		Scanner userInput = new Scanner(System.in);
		
		for(int i=0; i>=0;) {
			System.out.println("Enter facebook person " + (i+1) + "(input #### when you are done putting in persons): ");
			String name = userInput.next();
			String error = "";
			if (name.equals("####")){
				break;
			}
			if(fbp.size()>=1) { //vector is about to create another space
				for(int j=0; j<fbp.size(); j++) { 
					if(name.equals(fbp.get(j).getName())) { //name is compared to the first space and so on
						error = "Duplicate name";
						System.out.println(error);
						break; //break out of the for loop and start from the beginning
					}
				}
			}
			if (error == "Duplicate name") {
				continue;
			}else {
			fbp.add(new FacebookPerson_Graphics(name));
			i++;
			}
		}
		
		System.out.println("-------select a person and type the mood below--------");
		
		while(true){
			System.out.println("Enter the name for a person (enter #### to exit):");
			String name = userInput.next();
			if(name.equals("####")){
	             System.exit(0);
			}
			int personID = -1;
			for (int i=0; i<fbp.size(); i++) {
				if(fbp.get(i).getName().equals(name)){
					personID = i;
					break;
				}
			}
			if(personID != -1) {
				System.out.println("Enter the mood for the person:");
		        String mood = userInput.next();
		        fbp.get(personID).setMood(mood);
				} else {
					System.out.println("Unrecognized name!");
				}
		}
	}
}
