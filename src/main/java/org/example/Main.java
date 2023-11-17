package org.example;

import java.util.Scanner;

public class Main {

    public static int getAlphbetCount(String str, char alp) {
        int count = 0;
        for(int i = 0; i < str.length(); i ++) {
            if(alp == str.charAt(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //아이디어
        //1. 각 알파벳의 개수를 구한다.
        //2. 그 중 최댓값을 구한다.

        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int maxCount = -1;
        char maxAlphabet = '?';

        for(char alp = 'A'; alp <= 'Z'; alp++) {
            int count = getAlphbetCount(str, alp);
            if(count > maxCount) {
                maxCount = count;
                maxAlphabet = alp;
            }
            else if(count == maxCount) {
                maxAlphabet = '?';
            }
        }

        System.out.println(maxAlphabet);

    }
}