package Exercise2;

public class NormalUser extends User {
    // id
    private int id;

    // constructor
    public NormalUser() {
        super();
    }

    // full constructor
    public NormalUser(String username, String password, PhoneBookDirectory phoneBookDirectory, int id) {
        // refers to parent method
        super(username, password, phoneBookDirectory);
        this.id = id;
    }

    // get id
    public int getId() {
        return id;
    }

    // set id
    public void setId(int id) {
        this.id = id;
    }

    // print user info
    public void PrintNormalUserInfo() {
        super.PrintUserInfo();
        System.out.println("id: " + id);
    }

}