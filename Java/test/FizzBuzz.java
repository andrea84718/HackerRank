/*
Given a number n, for each integer i in the range from 1 to n inclusive, print one value per line as follows:

-If i is a multiple of both 3 and 5, print FizzBuzz.
-If i is a multiple of 3, print Fizz.
-If i is a multiple of 5, print Buzz.
-If i is not a multiple of 3 or 5, print the value i.

Constraints
- 0 < n < 2*10^5
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println("FizzBuzz"); 
            }
            else if(i%3==0){
                System.out.println("Fizz"); 
            }
            else if(i%5==0){
                System.out.println("Buzz"); 
            }
            else System.out.println(i); 
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
