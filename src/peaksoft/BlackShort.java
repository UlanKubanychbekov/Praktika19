package peaksoft;

public class BlackShort extends AbstrTehnika implements Fluable{
    public BlackShort(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void startUp() {
        System.out.println(getName()+" заводится");

    }

    @Override
    public void stay() {
        System.out.println(getName()+" stay");
    }

    @Override
    public void flyable() {
        System.out.println(getName()+" flyable");

    }

    @Override
    public void land() {
        System.out.println(getName()+" land");

    }

}
