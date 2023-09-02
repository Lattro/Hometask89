public class Pet
{
    private int id;
    private String name;
    private int age;
    private String color;
    private int owner;
    public Pet(int id, String name, int age, String color, int owner) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
    public int getOwner() {
        return owner;
    }
}
