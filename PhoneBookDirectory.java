package Exercise2;
import java.util.Arrays;
import java.util.*;

public class PhoneBookDirectory {
    private int full = 0;
    PhoneBookEntry[] phoneBookDirectory = new PhoneBookEntry[6];

    // add an entry
    public int addEntry(PhoneBookEntry entry) {
        for (int i = 0; i < phoneBookDirectory.length; i++) {
            if (phoneBookDirectory[i] == null) {
                phoneBookDirectory[i] = entry;
                full++;
                return 1;
            }
        }
        return 0;
    }

    // print all entries
    public void printAllEntires() {
        for (int i = 0; i < phoneBookDirectory.length; i++) {
            if (phoneBookDirectory[i] != null) {
                phoneBookDirectory[i].printBookEntry();
            }
        }
    }

    // search for an entry by number (linear)
    public int LinearSearchByPhoneNumber(String PhoneNumber) {
        for (int i = 0; i < phoneBookDirectory.length; i++) {
            if (phoneBookDirectory[i].getPhone() == PhoneNumber) {
                return 1;
            }
        }
        return 0;
    }

    // search by id (binary)
    // sort values to conduct the binary search
    public void sortEntries(PhoneBookEntry[] phoneBookDirectory) {
        for (int i = 0; i < full; i++) {
            int min = phoneBookDirectory[i].getId();
            int minIndex = i;
            for (int j = i + 1; j < full; j++) {
                if (min > phoneBookDirectory[j].getId()) {
                    min = phoneBookDirectory[j].getId();
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                phoneBookDirectory[minIndex] = phoneBookDirectory[i];
                phoneBookDirectory[i] = phoneBookDirectory[min];
            }
        }
    }

    public PhoneBookEntry SearchByIdBinarySearch(int id) {
        sortEntries(phoneBookDirectory);
        int low = 0;
        int high = full - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (id < phoneBookDirectory[mid].getId()) {
                high = mid - 1;
            } else if (id == phoneBookDirectory[mid].getId()) {
                return new PhoneBookEntry(phoneBookDirectory[mid].getId(), phoneBookDirectory[mid].getFirst(),
                        phoneBookDirectory[mid].getLast(), phoneBookDirectory[mid].getEmail(),
                        phoneBookDirectory[mid].getZip(), phoneBookDirectory[mid].getPhone());
            } else {
                low = mid + 1;
            }
        }
        return new PhoneBookEntry();
    }

    // edit an entry
    public int Edit(String firstName, String lastName) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < full; i++) {
            if (phoneBookDirectory[i].getFirst() == firstName && phoneBookDirectory[i].getLast() == lastName) {
                System.out.println("1. ID; 2. First name; 3. Last name; 4. Email; 5. Zipcode; 6. Phone Number");
				System.out.println("Enter the number of which section you would like to edit for person " + firstName + " " + lastName);
				int user = input.nextInt();	
                if (user == 1) {
                    System.out.println("Enter new ID");
                    int newID = input.nextInt();
                    phoneBookDirectory[i].setId(newID);
                } else if(user == 2){
                    System.out.println("Enter new first name");
                    input.nextLine();
                    String newFirst = input.nextLine();
                    phoneBookDirectory[i].setFirst(newFirst);
                } else if(user == 3) {
                    System.out.println("Enter new last name");
                    input.nextLine();
                    String newLast = input.nextLine();
                    phoneBookDirectory[i].setLast(newLast);
                } else if(user == 4) {
                    System.out.println("Enter new email");
                    input.nextLine();
                    String newEmail = input.nextLine();
                    phoneBookDirectory[i].setEmail(newEmail);
                } else if(user == 5) {
                    System.out.println("Enter new zip code");
                    input.nextLine();
                    String newZip = input.nextLine();
                    phoneBookDirectory[i].setZip(newZip);;
                } else if(user == 6) {
                    System.out.println("Enter new phone number");
                    input.nextLine();
                    String newPhone = input.nextLine();
                    phoneBookDirectory[i].setPhone(newPhone);
                } else {
                    input.close();
                    return 0;
                }
                input.close();
                return 1;
            }
        }
        input.close();
        return 0;
    }
    // sort by id
    // does not have argument for alck of reference variable, but same as one above
    public void sortEntriesById() {
		for (int i = 0; i < full; i++) {
            int min = phoneBookDirectory[i].getId();
            int minIndex = i;
            for (int j = i + 1; j < full; j++) {
                if (min > phoneBookDirectory[j].getId()) {
                    min = phoneBookDirectory[j].getId();
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                phoneBookDirectory[minIndex] = phoneBookDirectory[i];
                phoneBookDirectory[i] = phoneBookDirectory[min];
            }
        }
	}
    // delete entry
    public int deleteEntry(int id) {
        // note because array is fixed, cannot technically "delete" entry
		PhoneBookEntry delete = SearchByIdBinarySearch(id);
		if (delete.getId() == -1){
            return 0;
        }
        // can only submit a dummy value to substitute
		delete.setId(-1);
		delete.setFirst("null");
		delete.setLast("null");
		delete.setEmail("null");
		delete.setZip("null");
		delete.setPhone("null");
		full -= 1;
		phoneBookDirectory[full] = delete;
		return 1;
	}
}
