package com.my.first;

import java.util.ArrayList;
import java.util.List;

public class PhraseOMatic {


    public static void main(String[] args) {
        String[] wordListOne = {" 24/7", "multi-Tier", "30,000 foot",};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented"};
        String[] wordListThree = {"process", "tippping-point", "solution", "architecture"};
        int oneLength = wordListOne.length;
       int twoLength = wordListTwo.length;
       int threeLength = wordListThree.length;

       //generating random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //build the phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a "+phrase);
 /*int [] arr = new int [5];
 arr[0] = 5;
 arr[2] = 7;*/

 String [][] arr2 = new String[90][100];

        List <String> abc = new ArrayList<>();
        abc.add("elina");



    }
}
