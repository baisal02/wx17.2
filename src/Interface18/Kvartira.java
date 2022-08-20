package Interface18;

public class Kvartira extends Liveplace implements Liveable {

    public Kvartira(Person[] people) {
        super(people);
    }

    @Override
    public void Adress() {
        System.out.println("Kvartira");
    }

    @Override
    public void PayWay() {
        System.out.println("usluga toloshot");
    }
}
