class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min calculator");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max of the Array is: " + max);
        System.out.println("Min of the Array is: " + min);
    }
    public static int max(int[] myArr){
        if (myArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = myArr[0]; /// hum isse max bs maan lenge//
        int i = 1;
        while (i < myArr.length){
            if(max < myArr[i]){
                max = myArr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] myArr){   // jo max value h usse min le lete h
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < myArr.length){
            if (min > myArr[i]){
                min = myArr[i];
            }
            i++;
        }
        return min;
    }
}
