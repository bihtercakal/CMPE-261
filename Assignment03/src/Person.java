/**
 * @author Bihter Cakal
 *
 */
public class Person {

	/**
	 * name is a string variable
	 */
	private String name;

	/**
	 * address is a string variable
	 */
	private String address;

	public Person() {
	}

	/**
	 * @param name
	 * @param address
	 */

	/**
	 * @param name
	 * @param address
	 */
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name  the name to set
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "[" + "Person Name :" + name + "," + " Person Address :" + address + "]";
	}

}
