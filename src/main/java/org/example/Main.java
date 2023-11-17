package org.example;

import java.util.Scanner;

public class Main {

    public static int[] getAlphbetCount(String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i ++) {
            count[str.charAt(i) - 'A']++;
        }

        return count;

    }

    public static void main(String[] args) {
        //아이디어
        //1. 각 알파벳의 개수를 구한다.
        //2. 그 중 최댓값을 구한다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] count = getAlphbetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';

        for(int i=0; i < 26; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            }
            else if(count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }

        System.out.println(maxAlphabet);

    }
}