public class ATypeName {
    public static void main (String[] args){

        double impartitorul = Double.parseDouble(args[1]);
        double deimpartitul = Double.parseDouble(args[0]);
        ATypeName a = new ATypeName();
        System.out.println(a.impartire(deimpartitul,impartitorul));
    }

       public double impartire (double deimpartitul, double impartitorul){
        double rezultatul = 0;
        rezultatul = deimpartitul/impartitorul;
        return rezultatul;
       }

    }

