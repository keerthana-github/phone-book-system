package Exercise2;
// phone book entry class

// phone book class

public class PhoneBook {
    public static void main(String[] args) {
        // create a new directory
        PhoneBookDirectory direct1 = new PhoneBookDirectory();
        // create new entries
        PhoneBookEntry entry1 = new PhoneBookEntry(1, "John", "Smith", "email1", "Zip1", "Phone1");
        PhoneBookEntry entry2 = new PhoneBookEntry(2, "Sarah", "Smith", "email2", "Zip1", "Phone1");
        PhoneBookEntry entry3 = new PhoneBookEntry(3, "Jayden", "Rivers", "email3", "Zip1", "Phone2");
        PhoneBookEntry entry4 = new PhoneBookEntry(4, "Naomi", "Columbus", "email4", "Zip1", "Phone3");
        PhoneBookEntry entry5 = new PhoneBookEntry(5, "Rebecca", "Stevens", "email5", "Zip1", "Phone4");
        PhoneBookEntry entry6 = new PhoneBookEntry(6, "Jeremy", "Turner", "email6", "Zip1", "Phone5");
        // add entries to the directory
        direct1.addEntry(entry1);
        direct1.addEntry(entry2);
        direct1.addEntry(entry3);
        direct1.addEntry(entry4);
        direct1.addEntry(entry5);
        direct1.addEntry(entry6);
        // conduct binary search for the ID 2 and print it
        direct1.SearchByIdBinarySearch(2).printBookEntry();
        // edit john smith, ID 1
        // can only edit id from a value of 0 - 6 (more specifically the length of an
        // array)
        direct1.Edit("John", "Smith");

        // print out John Smith's new details based on the previous edit
        direct1.SearchByIdBinarySearch(1).printBookEntry();
        String phone = "Phone3";
        // linear search to see if phone number exists
        if (direct1.LinearSearchByPhoneNumber(phone) == 1) {
            System.out.println("Person exists for phone number " + phone);
        } else {
            System.out.print("Phone number " + phone + " does not exist");
        }
        // delete entry
        direct1.deleteEntry(3);
        System.out.println();
        direct1.printAllEntires();
    }
}
