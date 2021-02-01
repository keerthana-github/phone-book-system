package Exercise2;

public class PhoneBookEntry {
    // set up variables
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private String phoneNumber;

    // default constuctor
    public PhoneBookEntry() {
    }

    // constructor with all arguments
    public PhoneBookEntry(int newId, String newFirst, String newLast, String newEmail, String newZip, String newPhone) {
        id = newId;
        firstName = newFirst;
        lastName = newLast;
        email = newEmail;
        zipCode = newZip;
        phoneNumber = newPhone;
    }

    // constructor with only firstName and phoneNumber
    PhoneBookEntry(String newFirst, String newPhone) {
        firstName = newFirst;
        phoneNumber = newPhone;
    }

    // only first name
    PhoneBookEntry(String newFirst) {
        firstName = newFirst;
    }

    // setter for
    // id
    public void setId(int newId) {
        id = newId;
    }

    // firstName
    public void setFirst(String newFirst) {
        firstName = newFirst;
    }

    // lastName
    public void setLast(String newLast) {
        lastName = newLast;
    }

    // email
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    // zipCode
    public void setZip(String newZip) {
        zipCode = newZip;
    }

    // phoneNumber
    public void setPhone(String newPhone) {
        phoneNumber = newPhone;
    }

    // getter for
    // id
    public int getId() {
        return id;
    }

    // firstName
    public String getFirst() {
        return firstName;
    }

    // lastName
    public String getLast() {
        return lastName;
    }

    // email
    public String getEmail() {
        return email;
    }

    // zipCode
    public String getZip() {
        return zipCode;
    }

    // phoneNumber
    public String getPhone() {
        return phoneNumber;
    }

    // printBookEntry method
    public void printBookEntry() {
        System.out.println("id: " + id);
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("email: " + email);
        System.out.println("zip code: " + zipCode);
        System.out.println("phone number: " + phoneNumber);
    }
}
