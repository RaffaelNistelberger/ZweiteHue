/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.raffa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raffa
 */
public class NumberTester {

    String fileName;

    private NumberTest oddEvenTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTest) {
        this.oddEvenTester = oddTest;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(this.fileName));
            String line = br.readLine();
            while (line != null) {

                String[] tmp = line.split(" ");
                switch (Integer.parseInt(tmp[0])) {
                    case 1:
                        if (oddEvenTester.testNumber(Integer.parseInt(tmp[1])) == true) {
                            System.out.println("EVEN");
                        } else {
                            System.out.println("ODD");
                        }
                        break;
                    case 2:
                        if (primeTester.testNumber(Integer.parseInt(tmp[1])) == true) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if (palindromeTester.testNumber(Integer.parseInt(tmp[1])) == true) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                    default:
                        System.out.println("Fehler!");
                        break;
                }

                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
