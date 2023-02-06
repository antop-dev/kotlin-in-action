package org.antop.java.chapter3;

import java.util.*;

public class CollectionJava {

    public static void main(String[] args) {
        var immutableSet = Set.of(1, 3, 53);
        System.out.println(immutableSet.getClass());

        var mutableSet = new HashSet<>(Set.of(1, 3, 53));
        System.out.println(mutableSet.getClass());

        var hashSet = new LinkedHashSet<>(Set.of(1, 3, 53));
        System.out.println(hashSet.getClass());

        var immutableList = List.of(1, 2, 3);
        System.out.println(immutableList.getClass());

        var mutableList = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(mutableList.getClass());

        var immutableMap = Map.of(1, "one", 2, "two");
        System.out.println(immutableMap.getClass());

        var mutableMap = new HashMap<>(Map.of(1, "one", 2, "two"));
        System.out.println(mutableMap.getClass());
    }

}
