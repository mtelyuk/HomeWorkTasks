package week_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
 * Luckily guard rooster have some info to identify the guilty fox.
 * Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
 * thief fox had a black coat, a torch and 3 bags.
 * Find the suspect foxes, if a fox is cleared of charges write that also
 */

public class ThiefFox {

    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;
        boolean thiefFoxWearsCoat = true;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;
        boolean thiefFoxHasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";
        String thiefFoxCoatColor = "BLACK";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;
        int thiefBagCount = 3;

        ArrayList<Object> thiefFox = new ArrayList<>();

        thiefFox.addAll(Arrays.asList(thiefBagCount, thiefFoxCoatColor, thiefFoxWearsCoat, thiefFoxHasATorch));



        ArrayList<Object> fox1 = new ArrayList<>();

        fox1.addAll(Arrays.asList(fox1BagCount, fox1CoatColor, fox1WearsCoat, fox1HasATorch));
        if(fox1.equals(thiefFox)){
            System.out.println("Fox1 is a thief");
        }else{
            System.out.println( "Fox1 is not a thief");
        }


        ArrayList<Object> fox2 = new ArrayList<>();

        fox2.addAll(Arrays.asList(fox2BagCount, fox2CoatColor, fox2WearsCoat, fox2HasATorch));
        if(fox2.equals(thiefFox)){
            System.out.println("Fox2 is a thief");
        }else{
            System.out.println( "Fox2 is not a thief");
        }

        ArrayList<Object> fox3 = new ArrayList<>();

        fox3.addAll(Arrays.asList(fox3BagCount, fox3CoatColor, fox3WearsCoat, fox3HasATorch));
        if(fox3.equals(thiefFox)){
            System.out.println("Fox3 is a thief");
        }else{
            System.out.println( "Fox3 is not a thief");
        }

        ArrayList<Object> fox4 = new ArrayList<>();

        fox4.addAll(Arrays.asList(fox4BagCount, fox4CoatColor, fox4WearsCoat, fox4HasATorch));
        if(fox4.equals(thiefFox)){
            System.out.println("Fox4 is a thief");
        }else{
            System.out.println( "Fox4 is not a thief");
        }








    }


}
