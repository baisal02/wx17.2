package Interface18;

public abstract class Liveplace {
    private Person[]people;

    public Liveplace(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }
    public abstract void Adress();

}
