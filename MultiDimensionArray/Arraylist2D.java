package MultiDimensionArray;

import java.util.ArrayList;

import Array.Arraylist;

public class Arraylist2D {
    public static void main(String[] args) {
        ArrayList <Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList <Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        ArrayList <Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        

        ArrayList < ArrayList <Integer> > arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(new ArrayList<>()); // Adding new arraylist
        arr.get(arr.size()-1).add(9);
        arr.get(arr.size()-1).add(10);
        // System.out.println(arr);
        //for each can also be use
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
                
            }
            System.out.println("");
        }
    }
}