/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.raffa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raffa
 */
public class HalloJavamitForEach {

    List<String> list = new ArrayList<>();

    public HalloJavamitForEach() {
    }

    public void init() {
        list.add("Foo");
        list.add("Bar");
    }

    public void test() {
        //Normale Ausgabe einer Liste
        for (String s : list) {
            System.out.println(s);
        }
        //ForEach() von Interface Liste
        list.forEach((String s) -> System.out.println(s));
    }

}
