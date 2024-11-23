public class Operators {
    public static void main(String[] agrs) {
        System.out.println("### OPERATORS ###");

        /**
         * Arithemetic Operators
         */

        System.out.println("$$ ARITHEMETIC OPERATORS $$");
        int a = 10;
        int b = 50;
        System.out.println("Addition : " + (a + b) );
        System.out.println("Subtraction : " + (a - b) );
        System.out.println("Multiplication : " + (a * b) );
        System.out.println("Division : " + (b / a) );
        System.out.println("Modulus : " + (b % a) );

        /**
         * Assignment Operators
         */
        System.out.println("$$ ASSIGNMENT OPERATORS $$");
        a = 20;
        System.out.println("a : " + a);
        a += 10;
        System.out.println("a : " + a);
        a -= 20;
        System.out.println("a : " + a);
        a *= 2;
        System.out.println("a : " + a);
        a /= 10;
        System.out.println("a : " + a);
        a %= 3;
        System.out.println("a : " + a);

        /**
         * Unary Operators
         */
        System.out.println("$$ UNARY OPERATORS $$");
//        a = +10;
//        System.out.println("a : " + a);     // 10
//        a = -5;
//        System.out.println("a : " + a);     // -5
//        System.out.println("a : " + ++a);   // -4
//        System.out.println("a : " + a--);   // -4 -> -5
//        System.out.println("a : " + a++);   // -5 -> -4
//        System.out.println("a : " + --a);   // -5

        a = +10;
        System.out.println("a : " + +a);     // 10
        System.out.println("a : " + ++a);   // 11
        System.out.println("a : " + a--);   // 11 -> 10
        System.out.println("a : " + a++);   // 10 -> 11
        System.out.println("a : " + --a);   // 10

        System.out.println("not true : " + !true);

        /**
         * Bitwise Operator
         */
        a = 5;
        b = 3;
        System.out.println("5 & 3 : " + (a & b));
        a = 12;
        b = 9;
        System.out.println("12 & 9 : " + (a & b));

        a = 5;
        b = 3;
        System.out.println("5 | 3 : " + (a | b));
        a = 12;
        b = 9;
        System.out.println("12 | 9 : " + (a | b));
        a = 5;
        System.out.println("5 << 2 : " + (a << 2));

        /**
         * Relation operators
         * < > <= >= == !=
         */
        a = 5;
        b = 10;
        String s = "s";
        System.out.println("a < b : " + (a < b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a = b : " + (a == b));

        /**
         * Logical Operator
         * && || !
         */
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && true);
        System.out.println(!false);
        System.out.println(!true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || true);


        /**
         * Ternary Operator
         */
        int marks = 63;
        int result = marks < 40 ? 0 : 1;
        System.out.println(result);



        /**
         * OPERATOR PRECEDENCE
         */
        System.out.println(10 + 5 * 2);
        // * is having higher priority then +
        // () haves the highest priority

        int x = 5;
        result = -x + 10;
        System.out.println(result);
        // unary operators haves higher priority then arithemetic operators

        a = 5;
        b = 10;
        int c = 15;

        System.out.println(a < b && b < c);
        // < > is having higher precendence then &&

        a = 5;
        b = 10;
        a += b * 2;
        /**
         * a = a + b
         * a += b
         *
         * a = a + b * 2;
         */
        System.out.println(a);


        a = 5;
        b = 10;
        c = 15;
        System.out.println(a < b ? (b < c ? b : c) : a);

        /**
         * NOTE: () have highest precendence
         * Precedence order :
         * post fix ++ --
         * unary + - ~ !
         * multiplicative * / %
         * additive + -
         * shift >> <<
         * relational < > <= >=
         * equality != ==
         * bitwise and &
         * bitwise xor
         * bitwise or
         * logical and &&
         * logical or
         * ternary
         * assigment = += -= etc...
         */

        /**
         * Type conversion
         */

        /**
         * Implicit type conversion
         * Java converts automatically smaller data type converted to
         * larger datatype without any los of information.
         */
        int p = 100;
        double pDouble = p;

        System.out.println("p : " + p);
        System.out.println("pDouble : " + pDouble);

        /**
         * Explict type conversion
         * Manually converting larger data type to a smaller data type.
         * This may cause data loss as well.
         */
        double d = 9.75;
        System.out.println(d);

        p = (int) d;
        System.out.println(p);

        // assignment - bitwise not
        // https://omrajsharma.notion.site/Java-12912d93c0d5802f8b15d03593c6da70?pvs=4
    }
}
