package Java_classes;

public class Admin extends User{
    private String password;
    public Admin(int id, String name, String password){
        super(id, name);
        this.password = password;
    }
    @Override
    public void performOperation(Operation operation) {
        System.out.println("Admin " + name + " is performing an operation.");
        operation.execute(); // Admin can perform any operation
    }
}
