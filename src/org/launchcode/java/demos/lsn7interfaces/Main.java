package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        // to sort the flavors list, create a new FlavorComparator object
        Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        System.out.println("Flavors before sorting: ");
        for (Flavor flavorName : flavors) {
            System.out.println(flavorName.getName());
        }

        flavors.sort(comparator);

        //or
        //flavors.sort(new FlavorComparator());


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        System.out.println("\nCone prices before sorting: ");
        for (Cone coneType : cones) {
            System.out.println(coneType.getCost());
        }

        cones.sort(new ConeComparator());

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        //System.out.println(flavors);

        System.out.println("\nFlavors after sorting: ");
        for (Flavor flavorName : flavors) {
            System.out.println(flavorName.getName());
        }

        System.out.println("\nCost after sorting: ");
        for (Cone coneType : cones) {
            System.out.println(coneType.getCost());
        }

        //print out each flavor by number of allergens
        System.out.println("\nNumber of allergens");
        for (Flavor flavorAllergen : flavors) {
            System.out.println(flavorAllergen.getName() + " has " + flavorAllergen.getAllergens());
        }

        //print the toppings
        System.out.println("\nToppings before sorting: ");
        for (Topping toppingType : toppings) {
            System.out.println(toppingType.getName());
        }

        toppings.sort(new ToppingComparator());

        System.out.println("\nToppings after sorting: ");
        for (Topping toppingType : toppings) {
            System.out.println(toppingType.getName());
        }



    }
}
