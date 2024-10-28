package Java_classes;

abstract class User{
    protected int id;
    protected String name;
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    public abstract void performOperation(Operation operation);
}
