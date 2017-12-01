// Copyright (C) 2017 Nick Ivanov
// Do what you want!

package sequence2017;

import java.util.ArrayList;
import java.util.Arrays;

public class Sequence2017 {
    
    private static double getExpression(ArrayList<Double> a, int n) {
        // MODIFY POINT 2
        return a.get(n-1) * (1.0+0.08) - 3000.0;
    }

    public static void main(String[] args) {
        // OPTIONAL MODIFY POINT
        final int N = 80;
        ArrayList<Double> a = new ArrayList<>(N);
        
        // MODIFY POINT 1
        ArrayList<Double> init = new ArrayList(Arrays.asList(30000.0));
        
        int i = 0;
        for(i = 0; i < init.size(); i++) {
            a.add(i, init.get(i));
        }
                
        for(i = init.size(); i < N; i++) {
            a.add(i, getExpression(a, i));
            if(getExpression(a, i) <= 0) {
                break;
            }
        }
        
        System.out.println(i);
        
        System.out.println(a.toString());
    }
    
}
