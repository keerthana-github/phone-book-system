package Exercise2;

public class PhoneBookAdmin extends User {
    // email
    private String email;

    // default
    public PhoneBookAdmin() {
        super();
    }

    // full constructor
    public PhoneBookAdmin(String username, String password, PhoneBookDirectory phoneBookDirectory, String email) {
        super(username, password, phoneBookDirectory);
        this.email = email;
    }

    // get email
    public String getEmail() {
        return email;
    }

    // set email
    public void setEmail(String email) {
        this.email = email;
    }

    // delete an entry
    public void deleteEntry(int id) {
        if (phoneBookDirectory.deleteEntry(id) == 0) {
            System.out.println("The entry does not exist.");
        } else {
            System.out.println("The entry has been deleted.");
        }
    }

    // sort entries by id
    public void sortDirectoryById() {
        phoneBookDirectory.sortEntriesById();
    }

    // linear search
    public int linearSearch(String phoneNumber) {
        return phoneBookDirectory.LinearSearchByPhoneNumber(phoneNumber);
    }

    // binary search
    public void binarySearch(int id) {
        if (phoneBookDirectory.SearchByIdBinarySearch(id).getId() != -1) {
            System.out.println("entry:");
            phoneBookDirectory.SearchByIdBinarySearch(id).printBookEntry();
        }
    }

    // print admin info
    public void PrintAdminInfo() {
        super.PrintUserInfo();
        System.out.println("email: " + email);
    }

    // change pass
    public void changePassword(String password) {
        super.password = password;
    }

    // change username
    public void changeUsername(String username) {
        super.username = username;
    }

}