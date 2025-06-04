public class FractionsMain {
    public static void main(String[] args) {
        Fraction fractions[] = new Fraction[5];

        fractions[0] = new Fraction(1, 2);
        fractions[1] = new Fraction(2, 5);
        fractions[2] = new Fraction(2, 4);
        fractions[3] = new Fraction(4, 10);

        System.out.println(fractions[0]);
        System.out.println(fractions[1]);
        System.out.println(fractions[2]);
        System.out.println(fractions[3]);

        System.out.println("\n");

        System.out.println(fractions[0].getNum());
        System.out.println(fractions[0].getDenom());

        System.out.println("\n");

        fractions[0].setNum(2);
        System.out.println(fractions[0]);

        fractions[0].setDenom(9);
        System.out.println(fractions[0]);

        fractions[4] = fractions[1].add(fractions[3]);
        System.out.println(fractions[4]);

        if(fractions[0].equals(fractions[2])){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }


    }
}
