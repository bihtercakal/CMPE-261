
import java.util.Scanner;

/**
 * 
 * @author Bihter Cakal
 *
 */
public class Book {

	Person[] people = new Person[100];
	Scanner scr = new Scanner(System.in);

	/**
	 * 
	 * Count is a integer variable
	 */
	private int Count;

	/**
	 * insert new person to address book
	 * 
	 * @param a parameter of the addPerson method
	 */
	public void addPerson(Person a) {

		people[Count] = a;
		Count++;

	}

	/**
	 * delete person in address book
	 * 
	 * @param input parameter of the delete method
	 */
	public void delete(String input) {
		for (int i = 0; i < Count; i++) {
			if(people[i].getName().equals(input)){
			people[i] = people[i + 1];
			Count--;	
			break;
			
		}if(people[i]==people[Count-1]){
			System.out.println("person not found");
		}
			
		}
		
		
	}

	/**
	 * search person in address book
	 * 
	 * @param input parameter of the searchPerson method
	 * @return true or false
	 */
	public boolean searchPerson(String input) {
		for (int i = 0; i < Count; i++) {
			if (people[i].getName().contains(input)) {
				return true;

			}
		}
		return false;

	}

	/**
	 * modify name in address book
	 * 
	 * @param oldName parameter of the modifyName method
	 * @param newName parameter of the modifyName method
	 */
	public void modifyName(String oldName, String newName) {
		for (int i = 0; i < Count; i++) {
			if (people[i].getName().equals(oldName)) {
				people[i].setName(newName);
				System.out.println("Successfully Modify Name");
			}
		}

	}

	/**
	 * modify address in address book
	 * 
	 * @param oldAddress parameter of the modifyAddress method
	 * @param newAddress parameter of the modifyAddress method
	 */
	public void modifyAddress(String oldAddress, String newAddress) {
		for (int i = 0; i < Count; i++) {
			if (people[i].getAddress().equals(oldAddress)) {
				people[i].setAddress(newAddress);
				System.out.println("Successfully Modify Address");
			}
		}

	}

	public void print() {
		for (int i = 0; i < Count; i++) {
			System.out.println(people[i]);
		}
	}
}
