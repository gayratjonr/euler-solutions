
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem49 {
    public static void main(String[] args) {
        List<Integer> primeList = getPrime();
        boolean[] primes = primeList();
        for (int i = 0; i < primeList.size(); i++) {
            for (int j = i + 1; j < primeList.size(); j++) {
                if (findNumber(primeList.get(i) + "", primeList.get(j) + "")) {
                    int result = primeList.get(j) - primeList.get(i);
                    result = primeList.get(j) + result;
                    if (result < 10000
                            && primes[result]
                            && findNumber(primeList.get(i) + "", result +"")){
                        System.out.println(""+ primeList.get(i) + primeList.get(j) + result);
                    }
                }
            }
        }
    }

    private static List<Integer> getPrime() {
        boolean[] primes = primeList();
        List<Integer> integers = new ArrayList<>();
        for (int i = 1000; i < primes.length; i++) {
            if (primes[i]) {
                integers.add(i);
            }
        }
        return integers;
    }

    private static boolean[] primeList(){
        boolean[] primes = new boolean[10000];
        Arrays.fill(primes, true);
        for (int i = 2; i < primes.length; i++) {
            for (int j = i + i; j < primes.length; j += i) {
                primes[j] = false;
            }
        }
        return primes;
    }

    private static boolean findNumber(String number, String lastNumber) {
        char[] one = number.toCharArray();
        char[] two = lastNumber.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        String oneStr = new String(one);
        String twoStr = new String(two);
        return oneStr.equals(twoStr);
    }
}
