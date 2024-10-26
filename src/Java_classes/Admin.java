package Java_classes;

public class Admin extends Account{
    private String Authpassword;
    public Admin(int _id, String _name, String _password){
        id = _id;
        name = _name;
        Authpassword = _password;
    }
}
