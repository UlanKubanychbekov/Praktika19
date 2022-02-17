package peaksoft;

public abstract class AbstrTehnika  {
    private String name;
    private int age;
    private String colour;
    private double weight;

    public AbstrTehnika(String name, int age, String colour, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;



    }
    public abstract void startUp();
    public  void stay(){
        System.out.println("остановиться");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "AbstrTehnika: \n" +
                "name: " + name +
                ", age: " + age +
                ", colour: " + colour +
                ", weight: " + weight ;
    }
}

