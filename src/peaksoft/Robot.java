package peaksoft;

public class Robot extends AbstrTehnika implements Runable, Swimable{

    public Robot(String name, int age, String colour, double weight) {
        super(name, age, colour, weight);
    }

    @Override
    public void startUp() {
        System.out.println(getName()+" включается");

    }

    @Override
    public void stay() {
        System.out.println(getName()+" останавливается");;
    }

    @Override
    public void RunAble() {
        System.out.println(getName()+ " runable");

    }

    @Override
    public void jump() {
        System.out.println(getName()+" jump");

    }

    @Override
    public void swimAble() {
        System.out.println(getName()+" swimable");

    }

    @Override
    public void dive() {
        System.out.println(getName()+" dive");


    }

}
