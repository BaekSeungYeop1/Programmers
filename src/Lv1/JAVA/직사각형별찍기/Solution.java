package Lv1.JAVA.직사각형별찍기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <= b; i++){
            String star = "";
            for(int j= 1; j<= a; j++){
                star += "*";
            }
            System.out.println(star);
        }

    }
}
