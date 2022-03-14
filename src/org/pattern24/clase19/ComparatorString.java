package org.pattern24.clase19;

import java.util.Comparator;

public class ComparatorString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim());
    }
}
