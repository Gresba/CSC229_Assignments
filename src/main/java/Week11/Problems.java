/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week11;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author paulk
 */
public class Problems {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 9, 0, 0, 0, 0, 0};
        int[] b = {1, 2, 4, 6, 8};
        System.out.println(Arrays.toString(problem02(a, b)));
        String[] strArray = new String[]{"eat", "abets","ate",  "betas", "tea","baste", "beast", "steam", "beats"}; 
        System.out.println(problem3(109));
        
        problem01(strArray);

        for(String str : strArray){
            System.out.println(str);
        }
    }
    
    /* Time Complexity Is O(NLogn)
       Space Complexity IS O(N*M)
    */
    private static void problem01(String[] strArray) {

        Arrays.sort(strArray, new AnagramComparator());

    }
    
    /*
    Space Analysis: n + 3 -> O(n)
    Time Analysis: O(n)
    */
    public static int[] problem02(int[] a, int[] b)
    {
        //n = a.length
        int j = b.length - 1; //+1 Space and Time
        int i = a.length - j - 2; //+1 Space and Time

        for(int k = a.length - 1; k >= 0; k--) //+1 Space +2n + 1 Time
        {
            if(j < 0 || a[i] > b[j]){  //+n
                a[k] = a[i]; 
                i--;
            }else if(i < 0 || b[j] >= a[i]){ //+n
                a[k] = b[j];
                j--;
            }
        }
        return a; //+1
    }
    
    //Time Complexity: O(rows^2)
    //Space Complexity: O(rows)
    public static int problem3(int rows)
    {
        int counter = 0;
        
        BigInteger temp = new BigInteger("1");
        BigInteger calc = new BigInteger("0");
        BigInteger[] array = new BigInteger[rows];
        for(int i = 1; i <= rows;i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(j == 0 || j == (i - 1))
                {
                    array[j] = new BigInteger("1");
                    counter++;
                }else{
                    calc = temp.add(array[j]);
                    temp = array[j];
                    array[j] = calc;
                    if(!calc.mod(new BigInteger("7")).equals(new BigInteger("0")))
                        counter++;
                }
            }
            System.out.println(Arrays.toString(array));
            //9223372036854775807 -> -9223372036854775808
        }
        return counter;
    }
}

class AnagramComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        //check edge conditions and length
        if( s1 == null || s2 == null)
            return -1;
        if( s1.length() <  s2.length())
            return -1;
        else if ( s1.length() >  s2.length())
            return 1;

        //sort s1 and s2 to compare:
        //System.out.println(s1 + " vs  " + s2);        
        return sort(s1).compareTo(sort(s2));

    }

    private String sort(String s1) {
        char[] cArray = s1.toCharArray();
        Arrays.sort(cArray);        
        //System.out.println(" sorted:  " + new String(cArray));
        return new String(cArray);
    }
}