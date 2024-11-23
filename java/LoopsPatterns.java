public class LoopsPatterns {
    public static void main(String[] args) {
        System.out.println("### PATTERN PROBLEMS ###");

        int n;

        /* PROBLEM 1
         ****
         ****
         ****
         ****
         */
//        n = 4;
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();





        /*
            ****
            *  *
            *  *
            ****
        */
//        n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();

        /*
               1
              2 2
             3 3 3
            4 4 4 4
        */
//        n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(' ');
//            }
//            for (int k = 1; k <= i ; k++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }


        /*
            1 2 3 4
            1 2 3
            1 2
            1
        */
        n = 5;
        for (int row = 1; row <= n; row++) {
            for (int num = 1; num <= n - row + 1 ; num ++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
            1
            0 1
            1 0 1
            0 1 0 1
        */
        n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j ) % 2) + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        /*
               1
              212
             32123
            4321234
        */
        n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        /*
         ****
          ****
           ****
            ****
         */
        n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        /*
            *
           * *
          * * *
         * * * *
        * * * * *
       * * * * * *
           | |
           | |
         */

        int num=6;
        for(int i=1;i<=num;i++){
            for(int j=num-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int stem=num/2;
        for(int i=1;i<=stem;i++){
            for(int j=1;j<=stem;j++){
                System.out.print(" ");
            }
            for(int j=1;j<stem;j++){
                System.out.print(" |");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        /*
            *
            * *
            * * *
            * *
            *
        */

        n = 11;
        for (int i = 1; i <= n ; i++) {
            if (i <= (n/2 + 1)) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int k = (n-i+1); k >= 1; k--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        /**
         a
         ab
         abc
         abcd
         abcde
         */
        System.out.println((char) 97);

        /**
         * a - 97
         * A - 65
         */
        n = 5;
        char c;
        int charASCII = 97;
        for (int i = 1; i <= n; i++) {
//            for (c = 'a'; c < 'a' + i; c++) {
//                System.out.print(c);
//            }
            for (int j = charASCII; j < charASCII + i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }


        /**


         1 2 3 4
          2 3 4
           3 4
            4
           3 4
          2 3 4
         1 2 3 4

         */

        n = 7;
        for (int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }


        /**


         1 2 3 4
          2   4
           3 4
            4
           3 4
          2   4
         1 2 3 4

         */

        n = 7;
        for (int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                if (k == i || i == 1 || k == n) {
                    System.out.print(k + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /**
            4
           3 4
          2   4
         1 2 3 4
          2   4
           3 4
            4
         */

        n = 7;
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                if (k == i || i == 1 || k == n) {
                    System.out.print(k + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }




        /**

         PASCAL'S TRIANGLE

            1
           1 1
          1 2 1
         1 3 3 1

         */



        System.out.println();


    }


}
