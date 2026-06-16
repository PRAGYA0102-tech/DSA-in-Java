package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        System.out.println(arr.get(3));  //arr[3]
        arr.set(2,4); // arr[2] = 3;
        int n = arr.size();
        for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println("");
    arr.add(6); //Add at last
    arr.remove(0);
    arr.set(1,2);
    arr.add(4,5); //a[4] = 5;
    for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println("");
    arr.remove(arr.size()-1); //remove last element
    Collections.reverse(arr); //Reverse array
    for(int ele : arr){
        System.out.print(ele + " ");
    }
    System.out.println("");
    arr.clone();  //Clone the list
    for(int ele : arr){
        System.out.print(ele + " ");
    }

    
    System.out.println("");
    arr.clear(); //Remove all element from list
    for(int ele : arr){
        System.out.print(ele + " ");
    }

    }
    
}
