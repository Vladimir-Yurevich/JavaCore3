package lesson1.fruit;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <T> {
    T[] obj;
    Box(T... bool){
        obj = bool;
        new ArrayList(Arrays.asList(obj));
    }
   int getWeight(int[]x){
        int y = 0;
        return y;
   }
}
