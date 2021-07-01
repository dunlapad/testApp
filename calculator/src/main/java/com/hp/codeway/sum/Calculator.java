/*
 * Codeway java maven library quick start
 */
package com.hp.codeway.sum;

public class Calculator {

    private Calculator() {}

    /**
     * Calculates the sum of all the values passed in.
     * @param values
     * @return the sum of the values passed in
     */
    public static int sum(int... values){
        if (values == null)
            throw new IllegalArgumentException("values cannot be null.");

        int sum = 0;
        for (int val : values){
            sum += val;
        }
        return sum;
    }

    public static int sub(int... values){
        if (values == null)
            throw new IllegalArgumentException("values cannot be null.");

        int sub = 0;
        for (int val : values){
            sub -= val;
        }
        return sub;
    }


}
