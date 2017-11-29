// Copyright (C) 2017 Nick Ivanov
// Do what you want!

package sequence2017;

import java.util.ArrayList;
import java.util.Arrays;

public class Sequence2017 {
    
    private static int getExpression(ArrayList<Integer> a, int n) {
        // MODIFY POINT 2
        return a.get(n-1) + a.get(n-2);
    }

    public static void main(String[] args) {
        // OPTIONAL MODIFY POINT
        final int N = 20;
        ArrayList<Integer> a = new ArrayList<>(N);
        
        // MODIFY POINT 1
        ArrayList<Integer> init = new ArrayList(Arrays.asList(0, 1));
        
        for(int i = 0; i < init.size(); i++) {
            a.add(i, init.get(i));
        }
                
        for(int i = init.size(); i < N; i++) {
            a.add(i, getExpression(a, i));
        }
        
        System.out.println(a.toString());
    }
    
}
