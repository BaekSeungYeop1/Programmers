package Lv1.JAVA.숫자짝궁;


import java.util.Arrays;

/*
 * x = 3403, y = 13203, result = 330
 * x = 5525, y = 1255, result = 552
 * x = 100, y = 203045, result = 0
 * x = 100, y = 2345, result = -1
 *
 *
 */
public class Solution {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer();

        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        int xIdx = 0;
        int yIdx = 0;

        // x,y의 인덱스가 배열의 길이보다 작을때까지 반복
        while (xIdx < xArr.length && yIdx < yArr.length){
            if (xArr[xIdx] == yArr[yIdx]){
                answer.append(xArr[xIdx]);
                xIdx++;
                yIdx++;
            }else if (xArr[xIdx] > yArr[yIdx]){
                yIdx++;
            }else {
                xIdx++;
            }
        }

        // 큰 숫자가 앞으로 오도록 내림차순으로 변환
        answer.reverse();
        if (answer.length()<1){
            return "-1";
        }else if(answer.charAt(0)=='0'){
            return "0";
        }else
            return answer.toString();
    }
}
