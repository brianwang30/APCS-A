// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW42 -- Be More Rational
// 2021-12-02
// time spent: 0.3 hrs

/*
DISCOVERIES
   0.
UNRESOLVED QUESTIONS
   0. Would it not be best to implement some simplifies inside of operations?
*/

public class Rational {
    protected int p;
    protected int q;

    public Rational() {
        p = 0;
        q = 1;
    }

    public Rational(int a, int b) {
        if (b == 0) {
            System.out.println("the denominator cannot be 0, setting Rational to 0/1");
            p = 0;
            q = 1;
        } else {
            p = a;
            q = b;
        }
    }

    public double floatValue() {
        return (double) p / q;
    }

    public String toString() {
        return p + "/" + q;
    }

    public static int GCD( Rational r ) {
    boolean loop = true;
    int a = r.p;
    int b = r.q;
    while ( loop ) {
      if (a > b ) {
        a = a - b;
      }
      else {
        if (a == b) {
          loop = false;
        }
        else {
          b = b - a;
        }
      }
    }

      return a;
    }

    public void reduce(){
      int gcd = GCD(this);
      p = p / gcd;
      q = q / gcd;
    }

    public void add(Rational r){
        p = p * r.q + r.p * q;
        q = q * r.q;
    }

    public void subtract(Rational r){
        p = p * r.q - r.p * q;
        q = q * r.q;
    }

    public void multiply(Rational r) {
        p = p * r.p;
        q = q * r.q;
    }

    public void divide(Rational r) {
        if (r.p == 0) {
            // throw a divide by zero error
            int i = 1 / 0;
        } else {
            p = p * r.q;
            q = q * r.p;
        }
    }

    public int compareTo(Rational r){
        return p * r.q - r.p * q;

    }

    public static void main(String[] args) {
        Rational r0 = new Rational(10, 0);
        System.out.println(r0);
        System.out.println("=============");

        Rational r1 = new Rational(10, 5);
        Rational r2 = new Rational(3, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.floatValue());
        r1.multiply(r2);
        System.out.println(r1);
        r1.divide(r2);
        System.out.println(r1);

        System.out.println("=============");
        /*
        Rational r3 = new Rational(2, 3);
        Rational r4 = new Rational();

        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r3.floatValue());
        r3.multiply(r4);
        System.out.println(r3);
        r3.divide(r4);
        System.out.println(r3);
        */
        //System.out.println(GCD(200, 100));
        Rational r3 = new Rational(10, 5);
        Rational r4 = new Rational(3, 6);
        System.out.println(r3);
        System.out.println(r4);
        r3.reduce();
        r4.reduce();
        System.out.println(r3);
        System.out.println(r4);
        r3.add(r4);
        System.out.println(r3);
        r3.subtract(r4);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println("Comparisons: ");
        System.out.println(r3.compareTo(r3));
        System.out.println(r3.compareTo(r4));
        System.out.println(r4.compareTo(r3));

        //===============================
        System.out.println("\n\n");
        Rational r = new Rational(2,3); //Stores the rational number 2/3
        Rational s = new Rational(1,2); //Stores the rational number 1/2
        Rational t = new Rational(4,18); //Stores the rational number 4/18
        r.add(s);  //Adds r to s, changes r to 7/6.  s remains 1/2
        System.out.println(r);
        t.reduce(); //Changes t to 2/9
        System.out.println(t);
      }
}
