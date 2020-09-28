/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgkr.raffa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
        System.out.println("NEW LINE");

        //ForEach() von Interface Liste
        list.forEach((String s) -> System.out.println(s));
        System.out.println("NEW LINE");

        //Consumer Interface
        Consumer<String> consumer = (String s) -> System.out.println(s);
        list.forEach(consumer);
        System.out.println("NEW LINE");

        //LambaExpression mit Methoden-Referenz
        list.forEach(System.out::println);
    }

}
