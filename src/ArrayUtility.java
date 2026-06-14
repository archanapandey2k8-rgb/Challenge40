import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of array ");
        int size = input.nextInt();
        int[] nums = new int[size];  // jo user ne size diya uska array daal dijiye//
        int i = 0;
        while (i < size) {
            System.out.println("please enter element number " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
       return nums;
    }
}