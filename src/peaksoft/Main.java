package peaksoft;

public class Main {

    public static void main(String[] args) {

        Swimable swimable = new Robot("Robokop", 10, "white", 50);
        Runable runable = new Robot("Robokop", 10, "white", 50);
        Swimable swimable1 = new Submarina("Подводная лодка", 44, "blue", 20000);
        Fluable fluable = new BlackShort("Черная- Акула", 23, "Black", 1200.2);

        AbstrTehnika abstrTehnika = new BlackShort("Черная- Акула", 23, "Black", 1200.2);
        System.out.println(abstrTehnika);
        abstrTehnika.stay();
        abstrTehnika.startUp();
        fluable.flyable();
        fluable.land();

        System.out.println("_______________________________________________________");
        AbstrTehnika abstrTehnika1 = new Submarina("Подводная лодка", 44, "blue", 20000);
        System.out.println(abstrTehnika1);
        abstrTehnika1.startUp();
        abstrTehnika1.stay();
        swimable1.swimAble();
        swimable1.dive();

        System.out.println("____________________________________________________________________________");
        AbstrTehnika abstrTehnika2 = new Robot("Robokop", 10, "white", 50);
        System.out.println(abstrTehnika2);
        abstrTehnika2.startUp();
        abstrTehnika2.stay();
         swimable.dive();
        swimable.swimAble();
        runable.jump();
        runable.RunAble();

    }
}

