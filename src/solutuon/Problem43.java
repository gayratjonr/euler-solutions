package solutuon;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem43 {
    static ArrayList<String> numbers = new ArrayList<>();

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
       permutations("0123456789", "");
        System.out.println(sum);
        for(String x : numbers)
        {
            if(x.length() == 10)
            {   if(Integer.parseInt(x.substring(1,4)) % 2 == 0 )
                if(Integer.parseInt(x.substring(2,5)) % 3 == 0 )
                    if(Integer.parseInt(x.substring(3,6)) % 5 == 0 )
                        if(Integer.parseInt(x.substring(4,7)) % 7 == 0 )
                            if(Integer.parseInt(x.substring(5,8)) % 11 == 0 )
                                if(Integer.parseInt(x.substring(6,9)) % 13 == 0 )
                                    if(Integer.parseInt(x.substring(7)) % 17 == 0 )
                                    {
                                        sum = sum.add(new BigInteger(x));
                                    }
            }
        }
        System.out.println(sum);
    }

    public static void permutations(String temp, String result) {
        if (temp.length() == 0) {
            numbers.add(result);
            return;
        }

        for (int index = 0; index < temp.length(); index++) {
            char c = temp.charAt(index);
            String sub = temp.substring(0, index) + temp.substring(index + 1);
            permutations(sub, result + c);
        }
    }
}
