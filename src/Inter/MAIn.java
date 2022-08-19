package Inter;

public class MAIn {
    public static void main(String[] args){
        Baked []baked = {new Nan(),new Pirog(),new Bulochka()};
        for (Baked b:
             baked) {
            b.byshat();
        }

    }
}
