package Java_classes;

public class MainApplication {
    public static void main(String[] args){
        Admin curAdmin = new Admin(1234, "stephen", "xa1@LW42%3");
        User curuser = new User(4455, "John");

        curAdmin.performOperation(new Update());
        curuser.performOperation(new View());
    }
}
