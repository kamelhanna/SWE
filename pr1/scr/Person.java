/**
 * Person
 */
public abstract class Person {
    
    protected String name;
    protected int id;
    protected int age;

    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getId();
    public abstract void setId(int id);
    public abstract int getAge();
    public abstract void setAge(int age);
}