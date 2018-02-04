package Others;

public class DataOnly {

    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);
        double d = Double.parseDouble(args[1]);
        boolean b = true;
        DataOnly data = new DataOnly();
        System.out.println(data.trueOrFalse(i,d));
    }

    public boolean trueOrFalse(int i, double d) {
        boolean b;
        if (i > 10 && d < 10) {
            b = false;
        } else {
            b = true;
        } return b;
    }
}