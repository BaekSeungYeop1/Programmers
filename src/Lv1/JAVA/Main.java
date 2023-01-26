package Lv1.JAVA;

import Lv2.JAVA.최댓값과최솟값.Solution;

public class Main {
    public static void main(String args[]){


    }

    public int solution(int price) {
        int answer = 0;

        if(price>=100000){

            if(price>=300000){

                if(price>=500000){
                    return (int) Math.round(price*0.8);
                }
                return (int) Math.round(price*0.9);
            }
            return (int) Math.round(price*0.95);
        }

        return answer;
    }
}

