/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.raffa;

import java.util.Scanner;

/**
 *
 * @author raffa
 */
public class ZweiteHue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
////        HalloJavamitForEach h = new HalloJavamitForEach();
////        h.init();
////        h.beispiel2();
////
//
////        nt.testFile();
//        NumberTester nt = new NumberTester("test.txt");
//
//        nt.setOddEvenTester((n) -> {
//
//            if (n % 2 == 0) {
//                return true;
//            } else {
//                return false;
//            }
//
//        });
//        nt.setPrimeTester((n) -> {
//
//            for (int i = 2; i < n; i++) {
//                int a = n % i;
//                if (a == 0) {
//                    return false;
//                }
//            }
//            return true;
//
//        });
//        nt.setPalindromeTester((n) -> {
//            int r, sum = 0, temp;
//
//            temp = n;
//            while (n > 0) {
//                r = n % 10;
//                sum = (sum * 10) + r;
//                n = n / 10;
//            }
//            if (temp == sum) {
//                return true;
//            } else {
//                return false;
//            }
//        });
//
//        nt.testFile();
//        NumberTester nt = new NumberTester("test.txt");

        RationalCalculator rc = new RationalCalculator((Number x, Number y) -> {
            double erg = x.getB() * y.getB();
            Number n = new Number(x.getA() * y.getB(), erg);
            Number n2 = new Number(y.getA() * x.getB(), erg);
            return new Number(n.getA() + n2.getA(), erg);
        }, (Number x, Number y) -> {
            double erg = x.getB() * y.getB();
            Number n = new Number(x.getA() * y.getB(), erg);
            Number n2 = new Number(y.getA() * x.getB(), erg);
            return new Number(n.getA() - n2.getA(), erg);
        }, (Number x, Number y) -> {
            return new Number(x.getA() * y.getA(), x.getB() * y.getB());
        }, (Number x, Number y) -> {
            return new Number(x.getA() / y.getB(), x.getB() / y.getA());
        });

        VectorCalculator vc = new VectorCalculator((Number x, Number y) -> {
            return new Number(x.getA() + y.getA(), x.getB() + y.getB());
        }, (Number x, Number y) -> {
            return new Number(x.getA() - y.getA(), x.getB() - y.getB());
        }, (Number x, Number y) -> {
            double erg1 = x.getA() * y.getB();
            double erg2 = x.getB() * y.getA();
            return new Number(erg1 - erg2, 0);
        }, (Number x, Number y) -> {
            double erg1 = x.getA() * y.getA();
            double erg2 = x.getB() * y.getB();
            return new Number(erg1 + erg2, 0);
        });
        Scanner scanner = new Scanner(System.in);
        int eing = 0;
        do {
            System.out.println("Choose Calculator:");
            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");

            eing = Integer.parseInt(scanner.nextLine());
            if (eing == 4) {
                break;
            }
            System.out.println("Bruch 1 eingeben:");
            System.out.println("Zahl 1: x  eingeben:");
            double zahl1x = Integer.parseInt(scanner.nextLine());
            System.out.println("Zahl 1: y eingeben:");
            double zahl1y = Integer.parseInt(scanner.nextLine());

            System.out.println("Bruch 2 eingeben:");
            System.out.println("Zahl 2: x  eingeben:");
            double zahl2x = Integer.parseInt(scanner.nextLine());
            System.out.println("Zahl 2: y eingeben:");
            double zahl2y = Integer.parseInt(scanner.nextLine());

            Number a = new Number(zahl1x, zahl1y);
            Number b = new Number(zahl2x, zahl2y);

            switch (eing) {

                case 1:

                    switch (menue()) {
                        case 1:
                            System.out.println(rc.add(a, b).getA());
                            System.out.println(rc.add(a, b).getB());
                            break;
                        case 2:
                            System.out.println(rc.subtract(a, b).getA());
                            System.out.println(rc.subtract(a, b).getB());
                            break;
                        case 3:
                            System.out.println(rc.multiply(a, b).getA());
                            System.out.println(rc.multiply(a, b).getB());
                            break;
                        case 4:
                            System.out.println(rc.divide(a, b).getA());
                            System.out.println(rc.divide(a, b).getB());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 2:
                    switch (menue()) {
                        case 1:
                            System.out.println(vc.add(a, b).getA());
                            System.out.println(vc.add(a, b).getB());
                            break;
                        case 2:
                            System.out.println(vc.subtract(a, b).getA());
                            System.out.println(vc.subtract(a, b).getB());
                            break;
                        case 3:
                            System.out.println(vc.multiply(a, b).getA());
                            break;
                        case 4:
                            System.out.println(vc.divide(a, b).getA());
                            break;
                        case 5:
                            break;
                    }
                    break;
                case 3:
                    switch (menue()) {
                        case 1:
                            System.out.println("Hallo");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                    }
                    break;

            }

        } while (eing <= 3);

    }
//            if (temp == sum) {
//                return true;
//            } else {
//                return false;
//            }
//        });

    public static int menue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter number again");

        return Integer.parseInt(scanner.nextLine());
    }

}
