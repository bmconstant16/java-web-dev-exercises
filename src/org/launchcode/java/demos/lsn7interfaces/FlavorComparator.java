package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {


    @Override
    public int compare(Flavor o1, Flavor o2) {
        //always returning zero results in no sorting
        //return 0;
        //returns an integer- negative, positive, or zero depending on whether flavor
        //object o1 or o2 comes first, alphabetically -- how does it now alphabetically that a is
        //less than b?
        //return o1.getName().compareTo(o2.getName());
       if (o1.getAllergens().size() > o2.getAllergens().size()){
           return -1;
        } else if (o1.getAllergens().size() < o2.getAllergens().size()) {
           return 1;
       } else {
           return 0;
       }
    }
}
