public class Fraction {
    int numerator;
    int denominator;
    
    public Fraction (int n, int d){
        numerator = n;
        denominator = d;
    }

    public int getNum (){
        return numerator;
    }

    public int getDenom (){
        return denominator;
    }    

    public void setNum (int n){
        numerator = n;
    }

    public void setDenom (int d){
        if(d == 0){
            throw new ArithmeticException();
        }
        denominator = d;
    }

    public Fraction add(Fraction a){
        int num,
            denom;

        denom = denominator * a.denominator;
        num = (numerator*a.denominator) + (a.numerator*denominator);

        while(denom % 2 == 0 && numerator % 2 == 0){
            denom /= 2;
            num /= 2;
        }

        return new Fraction(num, denom);
    }

    public boolean equals(Fraction a){
        if(numerator*a.denominator == denominator*a.numerator){
            return true;
        }
        return false;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }
}