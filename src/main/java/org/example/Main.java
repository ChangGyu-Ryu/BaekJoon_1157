package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[26];  // baaa = [ 3, 1, 0 ]
        int maxValue = 0;
        int maxCount = 0;
        int doubleMaxCount = 0;

        for(int i = 0; i < str.length(); i++)
            count[str.toLowerCase().charAt(i) - 'a']++;

        for(int i = 0; i < 26; i++)
            if(count[i] > maxCount) {
                maxValue = i;
                maxCount = count[i];
            } else if( 2 <= count[i] && count[i] <= maxCount) {
                doubleMaxCount = count[i];
            }

        if(0 < doubleMaxCount && doubleMaxCount <= maxCount)
            System.out.println("?");
        else if(maxCount > 0)
            System.out.println((char)(maxValue+65));

    }
}