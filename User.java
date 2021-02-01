package Exercise2;

public class User {
    // username
    protected String username = "null";
    // password
    protected String password = "null";
    // phonebook directory
    protected PhoneBookDirectory phoneBookDirectory;

    // default constructor
    public User() {
        phoneBookDirectory = new PhoneBookDirectory();
    }

    public User(String username, String password, PhoneBookDirectory phoneBookDirectory) {
        this.username = username;
        this.password = password;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // user and admin can both
    // get username
    public String getUsername() {
        return username;
    }

    // get password
    public String getPassword() {
        return password;
    }

    // get phone book
    public PhoneBookDirectory getPhonebook() {
        return phoneBookDirectory;
    }

    // set phonebook
    public void setPhonebook(PhoneBookDirectory phoneBookDirectory) {
        this.phoneBookDirectory = phoneBookDirectory;
    }

    // add entry
    public void userAdd(PhoneBookEntry entry) {
        int full = phoneBookDirectory.addEntry(entry);
        if (full == 0)
            System.out.println("The phone book is full.");
        else if (full == 1)
            System.out.println("Entry added.");
    }

    // edit entry
    public void editEntry(String firstname, String lastname) {
        if (phoneBookDirectory.Edit(firstname, lastname) == 1)
            System.out.println("The entry has been edited.");
        else
            System.out.println("The entry doesn't exist.");
    }

    // print user info
    public void PrintUserInfo() {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

}
