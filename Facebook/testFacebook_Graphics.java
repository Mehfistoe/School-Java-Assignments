// This is the testFacebook_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011


//import jpb.*;
import java.util.*;

public class testFacebook_Graphics{

  public static void main (String[] args){

    // Prompt user to enter the number of facebookpresons
    // SimpleIO.prompt("Enter the number of facebookpresons to be created: ");
    // String userInput = SimpleIO.readLine();
    // int numP = Integer.parseInt(userInput);

	Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the number of facebookpresons to be created: ");
    int numP = userInput.nextInt();

    FacebookPerson_Graphics[] fbp = new FacebookPerson_Graphics[numP];

    //Ask the user to enter the name for each person, and create the persons
    for(int i=0; i< numP; i++){
    	System.out.println("Enter the name for person "+ (i+1)+ ":");
        String name = userInput.next();
        fbp[i] = new FacebookPerson_Graphics(name);
    }
    System.out.println("-------select a person and type the mood below--------");


    //Ask the user to set the mood for a person, and update the mood, enter "####" to exit
    while(true){
    	System.out.println("Enter the name for a person (enter #### to exit):");
        String name = userInput.next();
        if(name.equals("####"))
             System.exit(0);
        int personID = -1;
        for(int i=0; i< numP; i++){
            if(fbp[i].getName().equals(name)){
                personID = i;
                break;
            }
        }
        if(personID!=-1){  // found the person
        	System.out.println("Enter the mood for the person:");
            String mood = userInput.next();
            fbp[personID].setMood(mood);
        }
        else
            System.out.println("unrecognized name!");
    } // end while

  } // end main

}
