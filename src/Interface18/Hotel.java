package Interface18;

public class Hotel extends Liveplace implements Liveable{
    public Hotel(Person[] people) {
        super(people);
    }
    @Override
    public void PayWay(){
        System.out.println("arenda toloshot");
    }
    @Override
    public void Adress(){
        System.out.println("Hotel");
    }
}
