// Find the average of array elements
/*public class Arrays1 {
    static double getAverage(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        double average = (double) sum / arr.length;
        return average;

    }

    public static void main(String[] args) {
        int arr[] = { 45, 68, 12, 6 };
        System.out.println("Average = " + getAverage(arr));
    }
}*/

//multiply each element of array by 10
/*public class Arrays1 {
    static void multiplyBy10(int[] arr) {
        double product = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 * arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        multiplyBy10(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}*/

//search for an element in an array{Linear search}
/*import java.util.Scanner;

public class Arrays1 {
    static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your target : ");
        int target = sc.nextInt();
        int[] arr = { 2, 5, 3, 1, 7 };
        boolean ans = findTarget(arr, target);
        System.out.println(ans);
    }
}*/

//find the max element in an array
/*public class Arrays1 {
    static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 8, 9, 3, 4, 7 };
        int maxElement = findMaxElement(arr);
        System.out.println(maxElement);
    }
}*/

//Return sum of +ve and -ve numbers
/*public class Arrays1 {
    static int positiveSum(int[] arr) {
        int sumP = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumP = sumP + arr[i];
            }
        }
        System.out.println("Sum of positive numbers : " + sumP);
        return sumP;
    }

    static int negativeSum(int[] arr) {
        int sumN = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sumN = sumN + arr[i];
            }
        }
        System.out.println("Sum of negative numbers : " + sumN);
        return sumN;
    }

    public static void main(String[] args) {
        int[] arr = { 4, -9, 7, 6, -5, -4, 3, -1, 3, 2, 5 };
        positiveSum(arr);
        negativeSum(arr);

    }
}*/

//Count the number of 0's and 1's
/*public class Arrays1 {
    static int[] count0And1(int[] arr) {
        int count0 = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0 = count0 + 1;
            } else {
                count1 = count1 + 1;
            }
        }
        return new int[] { count0, count1 };
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 01, 0, 1, 0, 1, 0, 0, 0, 1, 1 };
        int[] result = count0And1(arr);
        System.out.println("Zeros: " + result[0]);
        System.out.println("Ones: " + result[1]);
    }
}*/

//Find the first unsorted element in an array
/*public class Arrays1 {
    static int getUnsortedElement(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 4, 9 };
        int result = getUnsortedElement(arr);
        System.out.println("Unsorted element : " + result);
    }
}*/

//Swap Alternate Elements in an Array
/*public class Arrays1 {
    static int[] swapAltEle(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] newarr = swapAltEle(arr);
        for (int i : newarr) {
            System.out.print(i + " ");
        }

    }
}*/

//Print Array Intersection element
/*import java.util.ArrayList;

public class Arrays1 {
    static void getIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 4, 5, 6, 7, 8, 9 };
        getIntersection(arr1, arr2);
    }
}*/

// Print Alternate Extreme Elements
/*import java.util.ArrayList;

public class Arrays1 {
    static void printAltExtEle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            result.add(arr[i]);
            result.add(arr[j]);
            i++;
            j--;
        }
        System.out.print(result);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        printAltExtEle(arr);
    }
}*/