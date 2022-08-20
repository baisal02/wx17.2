package Interface18;

public class Hostel extends Liveplace implements Liveable{
    public Hostel(Person[] people) {
        super(people);
    }

    @Override
    public void Adress() {
        System.out.println("Hostel");
    }

    @Override
    public void PayWay() {
        System.out.println("arenda toloshot");
    }
}
