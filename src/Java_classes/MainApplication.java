package Java_classes;

public class MainApplication {
    public static void main(String[] args){
        Admin curAdmin = new Admin(1234, "stephen", "xa1@LW42%3");
        RegularUser curuser = new RegularUser(4455, "John");

        Operation updateOp = new Update();
        Operation viewOp = new View();

        curAdmin.performOperation(updateOp);
        curAdmin.performOperation(viewOp);

        curuser.performOperation(updateOp);
        curuser.performOperation(viewOp);
    }
}
