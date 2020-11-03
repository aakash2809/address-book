package addressBookManipulation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AddressBookManager {

	// TO ADD NEW ENTRY TO ADDRESSBOOK
	public static void addEntry(List<Person> personList) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		System.out.println("Enter FirstName : ");
		person.setFirstName(sc.nextLine());
		System.out.println("Enter LastName : ");
		person.setLastName(sc.nextLine());
		System.out.println("Enter address : ");
		person.setAddress(sc.nextLine());
		System.out.println("Enter City  : ");
		person.setCity(sc.nextLine());
		System.out.println("Enter state  : ");
		person.setState(sc.nextLine());
		System.out.println("Enter Zip  : ");
		person.setZip(sc.nextLine());
		System.out.println("Enter Mobile Number  : ");
		person.setZip(sc.nextLine());
		personList.add(person);
		System.out.println("address book updated");

	}

	// TO SEARCH ENTRY BY THE USER FIRST NAME ALSO FILTER ALL SIMILARS
	public static void searchEntryByName(List<Person> personList) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name or name start with : ");
		String name = sc.nextLine().toUpperCase();

		for (Person p : personList) {
			if (p.getFirstName().toUpperCase().startsWith(name)) {
				flag = 1;
				System.out.println(p);
			}
		}

		if (flag == 0) {
			System.out.println("Entry not found");
		}

	}

	// TO DELETE ENTRY FROM ADDRESS BOOK
	public static void deleteEntry(List<Person> personList) {
		System.out.println("please enter serial number which which you want to delete ");
		Scanner sc = new Scanner(System.in);
		int serialNumber = sc.nextInt();
		//LIST TRAVERSING
		for (Person p : personList) {
			if (p.getserialNumber() == serialNumber) {
				personList.remove(p);
				System.out.println("Entry has been deleted and address book updated");
				break;
			}
		}

	}

	// TO SHOW ALL THE ENTRIES FROM ADDRESS BOOK
	public static void showList(List<Person> personList) {
		//SORTING THE LIST BY FIRST NAME
		Collections.sort(personList);
		for (Person p : personList) {
			System.out.println(p);
		}
	}

	// TO UPDATE OR EDIT ENTRIES IN ADDRESSBOOK
	public static void updateEntry(List<Person> personList) {
		int flag = 0;
		System.out.println("Enter serial number to edit data");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Person p = new Person();
		p.setSerialNumber(key);
		boolean b = true;
		while (b) {
			System.out.println(" ");
			System.out.println("choose option -:");
			// OPTIONS
			System.out.println("For Update first name: 1");
			System.out.println("For Update last name : 2");
			System.out.println("For Update address   : 3");
			System.out.println("For Update city      : 4");
			System.out.println("For Update state     : 5");
			System.out.println("For Update zip       : 6");
			System.out.println("For Update mobile    : 7");
			System.out.println("For go to main menu  : 8");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter new first Name");
				String fname = sc.nextLine();
				if (personList.contains(p)) {
					p.setFirstName(fname);
					flag = 1;
				}
				break;
			case 2:
				System.out.println("Enter new last Name");
				String lname = sc.nextLine();
				if (personList.contains(p)) {
					p.setLastName(lname);
					flag = 1;
				}
				break;
			case 3:
				System.out.println("Enter new address");
				String address = sc.nextLine();
				if (personList.contains(p)) {
					p.setAddress(address);
					flag = 1;
				}
				break;
			case 4:
				System.out.println("Enter new city name");
				String city = sc.nextLine();
				if (personList.contains(p)) {
					p.setCity(city);
					flag = 1;
				}
				break;
			case 5:
				System.out.println("Enter new state Name");
				String state = sc.nextLine();
				if (personList.contains(p)) {
					p.setState(state);
					flag = 1;
				}
				break;
			case 6:
				System.out.println("Enter new zip Name");
				String zip = sc.nextLine();
				if (personList.contains(p)) {
					p.setZip(zip);
					flag = 1;
				}
				break;
			case 7:
				System.out.println("Enter new mobile Name");
				String mobno = sc.nextLine();
				if (personList.contains(p)) {
					p.setPhoneNumber(mobno);
					flag = 1;
				}
				break;
			case 8:
				b = false;
				break;
			default:
				System.out.println("choose a valid option");
			}

		}

		if (flag == 0)
			System.out.println("you enter wrong serial Number if dont know your serial number"
					+ " go to main menu then search your detail and then find your serial number");
		else
			System.out.println("Entry updated ");

	}

	// MAIN METHOD
	public static void main(String[] args) {
		// DEFAULT ENTRIES
		Person person = new Person("Rahul", "Sahu", "Bada Bazar", "Sagar", "Madhya Padesh", "470002", "9346523960");
		Person person2 = new Person("Parag", "jain", "chetak birdge ", "Bhopal", "Madhya Padesh", "474502", "94456523698");
		Person person3 = new Person("Ashish", "jain", "noida city center", "Noida", "Utter pradesh", "345645", "9467896659");
		Person person4 = new Person("pankaj", "patel", "vishrantvadi", "pune", "Maharastra", "4756762", "8988798909");
		ArrayList<Person> personList = new ArrayList<Person>();
		// ADDING DEFAULT ENTRIES INTO ARRAYLIST
		personList.add(person);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(" ");
			System.out.println("choose option -:");
			// OPTIONS
			System.out.println("For show the address book press                              : 1");
			System.out.println("For add a Entry in address book press 	                     : 2");
			System.out.println("For delete a Entry from address book press                   : 3");
			System.out.println("For search name and contact detail from address book press   : 4");
			System.out.println("For update your detail press                                 : 5");
			System.out.println("For exit press                                               : 6");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				showList(personList);
				break;
			case 2:
				addEntry(personList);

				break;
			case 3:
				deleteEntry(personList);
				break;
			case 4:
				searchEntryByName(personList);
				break;
			case 5:
				updateEntry(personList);
				break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("choose a valid option");
			}

		}
	}

}
