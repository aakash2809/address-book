package addressBookManipulation;

//PERSON IMPLEMETING COMPARABLE INTERFACE FOR SORTING PERPOSE
public class Person implements Comparable<Object> {
	// VARIABLE DECALRATION
	private static int tempNumber = 1;
	private int serialNumber;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;

	// AUTO INCREAMETATION OF SERIAL NUMBER
	public static int serialNumberIncreament() {

		return tempNumber++;
	}

	// DEFAULT CONSTRUCTOR
	public Person() {
		serialNumber = serialNumberIncreament();
	}

	// CONSTRUCTOR TO ASSIGN ENTRIES
	public Person(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber) {

		serialNumber = serialNumberIncreament();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}

	// SETTER GETTER METHODS
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getserialNumber() {
		return serialNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// OVERRIDING THE tostring() METHOD
	@Override
	public String toString() {
		return "Person [serialNumber=" + serialNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNumber="
				+ phoneNumber + "]";
	}

	// OVERRIDING THE COMPARETO() METHOD
	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;// DOWNCASTING THE OBJECT
		String a = this.firstName.toUpperCase();
		String b = p.firstName.toUpperCase();
		return a.compareTo(b);
	}

	// OVERRIDING THE EQUALS() METHOD
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj; // DOWNCASTING THE OBJECT
		return this.serialNumber == p.serialNumber;
	}

}
