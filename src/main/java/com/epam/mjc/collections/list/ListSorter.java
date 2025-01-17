package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList,new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x=Integer.compare((int) (5*Math.pow(Integer.parseInt(a),2)+3), (int) (5*Math.pow(Integer.parseInt(b),2)+3));
        return (x!=0?x:a.compareTo(b));
    }
}
