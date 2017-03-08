
/**
 * 
 * @author Bihter Cakal
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);

		/*
		 * Variables
		 * 
		 */
		int want = 0;

		/*
		 * String variables
		 */
		String input;
		String name = null;
		String address = null;
		String oldName;
		String newName;
		String oldAddress;
		String newAddress;

		Book abook = new Book();

		System.out.println("WELCOME TO ADDRESS BOOK");

		/**
		 * do-while condition
		 */
		do {
			System.out.println(" ");
			System.out.println("1:Add\n2:Delete\n3:Modify\n4:Search\n5:Show\n6:Quit");
			System.out.println("Choose a number for your request");
			want = scan.nextInt();

			if (want == 1) {
				System.out.println("Please, write name of the person");
				name = scan.next();
				System.out.println("Please, write address(only city) of the person");
				address = scan.next();
				Person i = new Person(name, address);
				abook.addPerson(i);
			} else if (want == 2) {
				abook.print();
				System.out.println("Please, write name of the person");
				String who = scan.next();
				abook.delete(who);
			} else if (want == 3) {
				System.out.println("Name or Address? Which information do you want to modify?");
				input = scan.next();
				if (input.equalsIgnoreCase("name")) {
					System.out.println("write old name of the person");
					oldName = scan.next();
					if (!oldName.equals(name)) {
						System.out.println("Please careful! you write wrong");
						break;
					}
					System.out.println("Write new name of the person");
					newName = scan.next();
					abook.modifyName(oldName, newName);
				} else if (input.equalsIgnoreCase("address")) {
					System.out.println("Write name of the person for modify address");
					name = scan.next();
					System.out.println("write old address of the person");
					oldAddress = scan.next();
					if (!oldAddress.equals(address)) {
						System.out.println("Please careful! you write wrong");
						break;
					}
					System.out.println("Write new address of the person");
					newAddress = scan.next();
					abook.modifyAddress(oldAddress, newAddress);
				} else {
					System.out.println();
				}
			} else if (want == 4) {
				System.out.println("Please, write the name of the person for searching");
				name = scan.next();
				if (abook.searchPerson(name)) {
					System.out.println(name + " is found address book\nif you see, please choose number 5");
				} else {
					System.out.println(name + " is not found address book");
				}

			} else if (want == 5) {
				abook.print();
			}
		} while (want != 6);

		System.out.println("good bye\nif you start again, please click run");
		
		} catch (InputMismatchException errors) {
			System.out.println("Please write carefully. Process is over and run again!");
		}

	}
}