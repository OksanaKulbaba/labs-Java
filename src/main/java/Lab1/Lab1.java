package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = DiferrentAlb("AAAA dddd ffff gsakg hdgt ;aosf");
        for (String s : list){
            System.out.println(s);
        }


    }

    public static  ArrayList<String>  DiferrentAlb (String s) {
      String[] tempMass  = s.split(" ");
      ArrayList<String> massAnswer  = new ArrayList<>();
        for (String temp:tempMass
             ) {
           char [] charTemp1 = temp.toCharArray();
           char [] charTemp2 = charTemp1;
           int count = temp.length();
            for (char t: charTemp2
                 ) {

                for( int i =0; i <charTemp1.length; i++){
                    if (t == charTemp1[i])
                        count--;
                }

            }
            if (count ==0){
                massAnswer.add(temp);
            }

        }

        return massAnswer;
    }





}
