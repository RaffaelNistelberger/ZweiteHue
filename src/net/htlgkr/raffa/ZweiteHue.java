/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.raffa;

/**
 *
 * @author raffa
 */
public class ZweiteHue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        HalloJavamitForEach h = new HalloJavamitForEach();
//        h.init();
//        h.beispiel2();
//

//        nt.testFile();
        NumberTester nt = new NumberTester("test.txt");

        nt.setOddEvenTester((n) -> {

            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }

        });
        nt.setPrimeTester((n) -> {

            for (int i = 2; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    return false;
                }
            }
            return true;

        });
        nt.setPalindromeTester((n) -> {
            int r, sum = 0, temp;

            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                return true;
            } else {
                return false;
            }
        });

        nt.testFile();
    }

}
