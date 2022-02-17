package peaksoft;

public class Submarina extends AbstrTehnika implements Swimable{

    public Submarina(String name, int age, String colour, double weight) {
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
    public void swimAble() {
        System.out.println(getName()+" swimable");

    }

    @Override
    public void dive() {
        System.out.println(getName()+" dive");


    }

}
