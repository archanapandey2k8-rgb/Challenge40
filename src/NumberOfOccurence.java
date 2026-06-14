import java.util.Scanner;

class NumberOfOccurence {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurences");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find: ");
        int num = input.nextInt();
        int occurences = occurence(numArr,num);
        System.out.println("your element is found " + occurences + " times");
    }
    public static int occurence( int[] numArr , int num){
        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if(numArr[i]== num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
