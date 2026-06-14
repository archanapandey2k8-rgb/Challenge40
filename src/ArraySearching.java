import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        int[] s = {9,8,6,5,4,3,2};
        System.out.println("welcome to Array Searching");
        System.out.println("enter the number you want to search : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isFound = isFound(s , num);
        if(isFound){
            System.out.println("no is found");
        }else {
            System.out.println("not found");
        }
    }
    public static boolean isFound(int[] s, int num){
        int index = 0;
        while (index < s.length){
            if(s[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
