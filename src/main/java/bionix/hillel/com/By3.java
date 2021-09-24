package bionix.hillel.com;

import java.util.Arrays;

public class By3 {
    public static void main(String[] args) {

        System.out.println(by3WithoutResidual("31"));
        System.out.println(Arrays.toString(by3WithoutResidualArray(new String[]{"123", "8409", "100853","33333333","7"})));
    }
    public static boolean by3WithoutResidual(String num){
        int x = Integer.parseInt(num);
        int result = x%3;
     return result==0;
    }
    public static Boolean[] by3WithoutResidualArray(String [] num){

        int count = 0;
        Boolean[] booleans = new Boolean[num.length];
        for (String s : num) {
            int x = Integer.parseInt(s);
            int y = 3;
             booleans[count]=(x%y ==0);
             count++;
        }
        return booleans;
    }
}