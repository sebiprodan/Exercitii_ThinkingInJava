public class Incrementable {

    static int i = 47;

    public static void main(String[] args){

        Incrementable st1 = new Incrementable();
        Incrementable st2 = new Incrementable();
        Incrementable st3 = new Incrementable();

        boolean check = true;

        if (st1.i == st2.i && st2.i == st3.i){
            check = true;
            System.out.println(check + " i este " + st1.i);

        }

    }
}
