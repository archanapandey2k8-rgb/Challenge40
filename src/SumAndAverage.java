import java.util.Scanner;

class SumAndAverage {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
long sum = sum(numArray);
int average = average(numArray);
        System.out.println("sum of the no. is " + sum);
        System.out.println("average of the no. is " + average);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while ( i < numArray.length){

            sum+= numArray[i];
            i++;
        }
          return sum;
    }
    public static int average(int[] numArray){
        long sum =  sum (numArray);
       return (int) (sum/ numArray.length);
    }
}