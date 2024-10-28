package Java_classes;

public class RegularUser extends User {
    public RegularUser(int id, String name) {
        super(id,name);
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation instanceof View) {
            System.out.println("User " + name + " is performing a view operation.");
            operation.execute(); // Regular user can only perform view operations
        } else {
            System.out.println("User " + name + " is not allowed to perform this operation.");
        }
    }
}
