//////////////////////////////////////////////////////////////////////////////////////////////////////////
// Name: McKenzie Rochester																				//
// Purpose: You are to write a program name Arraylist.java that implements the ArrayList data Structure.//
// The class must be written to accept any type of Objects.												//
// Data structures: Arrays 																				//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Arrays;

//class that creates the ArrayList data structure
public class Arraylist {
	
	Object[] arraylist;
	
	//default Arraylist contructor
	public Arraylist() {
		arraylist = new Object[10]; //sets the default size to 10
	}
	
	//constructor that accepts a parameter of type int and sets the size to this parameter
	public Arraylist(int n) {
		arraylist = new Object[n];
	}

	//Precondition: an object
	//Postcondition:method adds an object at the end of the list
	public void add(Object x) {
		//loop is used to find the empty cell where the object can be inserted
		for(int i = 0; i < arraylist.length; i++) {
			if (arraylist[i] == null) {
				arraylist[i] = x;
				break;
			}
			//if the loop reaches the end and there isn't an open cell
			if (i + 1 == arraylist.length) {
				//create a new object array that is double the length of the original array
				Object[] newArraylist = new Object[arraylist.length*2];
				//copy the contents from the original array into the new array
				int count = 0;
				for (; count < arraylist.length; count++) {
					newArraylist[count] = arraylist [count];
				}
				//add the object at the end of the copied content
				arraylist = newArraylist;
				arraylist[count + 1] = x;
			}
		}
	}
	
	//Precondtion: index >= 0, an object
	//Postcondition: method adds an an object at an specific place 
	//indicated by the index
	public void add(int index, Object x) {
		try {
			//to shift the elements in array when you want to insert an object in a non-null cell
			if (arraylist[index] != null) {
				//create a new array with an increased size
				Object[] copyArray = new Object[arraylist.length*2];
				//copy values from the original array into the new array before index
				for (int firstPart = 0; firstPart < index; firstPart++) {
					copyArray[firstPart] = arraylist[firstPart];
				}
				copyArray[index] = x;
				//copy values after index in the new array
				for (int nextPart = index + 1; nextPart < arraylist.length; nextPart++) {
					copyArray[nextPart] = arraylist[nextPart];
				}
				//this will make the orignal array in the form of the copied array
				arraylist = copyArray;
			} else {
				//if the index falls within the the array then the object will be added as normal
				arraylist[index] = x;
			}
		} catch (ArrayIndexOutOfBoundsException e) { //if an object is being added 
													//in an index outside of the original array
			//create a new array with an increased size
			Object[] newArraylist = new Object[arraylist.length*2];
			//loop to copy values from the original array into the new array
			for (int count = 0; count < arraylist.length; count++) {
				newArraylist[count] = arraylist[count];
			}
			//this will make the orignal array in the form of the copied array
			arraylist = newArraylist;
			arraylist[index] = x;
		}
	}

	//Precondition: an integer to indicate the index
	//Postcondition: method to retrive the the object indicated by the index
	public Object get(int index) {
		//assign an object to the object in the array indicated by the index
		Object a = arraylist[index];
		return a;
	}

	//Precondition: an arraylist object to measure
	//Postcondition: method to return the size of the arraylist
	public int size() {
		int elements = 0;
		for(int i = 0; i < arraylist.length; i++) {
			if (arraylist[i] != null) {
				elements++;
			}
		}
		return elements;
	}

	//Precondition: an arraylist object
	//Postcondition: method to see the if the arraylist is empty
	public boolean isEmpty() {
		//loop to keep count of each empty cell in the array
		int emptyCounter = 0;
		for (int j = 0; j < arraylist.length; j++) {
			if (arraylist[j] == null) {
				emptyCounter++;
			}
		}
		if (emptyCounter == arraylist.length) {
			return true;
		} else {
			return false;
		}
	}

	//Precondition: an arraylist and an object to find
	//Postcondition: method to check if a certain object is in the arraylist
	public boolean isIn(Object ob) {
		boolean objectIsIn = false;
		//loop to search the arraylist for the object
		for (int k = 0; k < arraylist.length; k++) {
			if (ob == arraylist[k]) {
				objectIsIn = true;
				break;
			}
		}
		return objectIsIn;
	}

	//Precondition: an arraylist and an object to find
	//Postcondition: the location of the object
	public int find(Object n) {
		int f = 0; //the index
		//loop to find the object
		for (; f < arraylist.length; f++) {
			if (n == arraylist[f]) {
				break;
			}
		}
		return f;
	}

	//Precondition: arraylist and an object
	//Postcondition: the object has been taken out of the arraylist, leaving a null value
	public void remove(Object n) {
		//loop to find the object given
		for (int r = 0; r < arraylist.length; r++) {
			if (n == arraylist[r]) {
				arraylist[r] = null;
				break;
			}
		}
	}
}