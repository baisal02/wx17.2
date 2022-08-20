package Interface18;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jenish");
        Person person1 = new Person("Tilek");
        Person person2 = new Person("Kulipa");

        Person[] family = {person, person1, person2};

        Person person3 = new Person("Azamat");
        Person person4 = new Person("Alymbek");
        Person person5 = new Person("Guliza");
        Person person6 = new Person("Gulnur");

        Person[] family1 = {person3, person4, person5, person6};
        Person[] family2 = {
                new Person("Kanat"),
                new Person("Aiyma"),
                new Person("Alina"),
                new Person("Gulnura"),
        };
        Person[] family3={new Person("Amantur"),new Person("Sabyr"),new Person("Gulnura")};
        Person[] family4={new Person("Bakai"),new Person("Temirlan"),new Person("Elizat"),new Person("Perizat"),new Person("Batma")};
        Person[] family5={new Person("Akylbek"),new Person("Kemal"),new Person("Damira"),new Person("Fatima")};


        Kvartira kvartira = new Kvartira(family);
        Kvartira kvartira2 = new Kvartira(family3);
       Hostel hostel = new Hostel(family4);
        Hostel hostel1 = new Hostel(family1);
        Hotel hotel = new Hotel(family2);
        Hotel hotel1 = new Hotel(family5);

        Liveplace[] liveplaces = {kvartira,kvartira2,hostel,hostel1,hotel,hotel1};
        int kv = 0;
        int hos = 0;
        int hot = 0;
        for (Liveplace l :
                liveplaces) {
            if (l instanceof Kvartira) {
                for (Person p :
                        l.getPeople()) {
                    System.out.println("-" + p.getName());
                    kv++;
                }
                l.Adress();
                ((Kvartira) l).PayWay();
                System.out.println(+l.getPeople().length + " adam");

            }
            System.out.println();
            if (l instanceof Hostel) {
                for (Person p :
                        l.getPeople()) {
                    System.out.println("-" + p.getName());
                    hos++;
                }
                l.Adress();
                ((Hostel) l).PayWay();
                System.out.println(l.getPeople().length + " adam");
            }
            if (l instanceof Hotel) {
                for (Person p :
                        l.getPeople()) {
                    System.out.println("-" + p.getName());
                    hot++;
                }
                l.Adress();
                ((Hotel) l).PayWay();
                System.out.println(l.getPeople().length + " adam");
            }
        }
        System.out.println('\n'+"zhalpy kvartiranttardyn sany: "+kv);
        System.out.println("zhalpy hosteldegilerding sany: "+hos);
        System.out.println("zhalpy hoteldegilerdin sany: "+hot);
    }
}
