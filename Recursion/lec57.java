//Print my name - 10 times
/*public class lec57 {
    static void printName(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Nishtha");
        printName(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printName(n);
    }
}*/

//Print 1 to N
/*public class lec57 {
    static void printNum(int n) {
        if (n == 11) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}*/

//Print array 
/*public class lec57 {
    static void printArray(int index, int[] arr) {
        if (index == arr.length) {
            return;
        }
        System.out.println(arr[index]);
        printArray(index + 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int index = 0;
        printArray(index, arr);
    }
}*/

//Max element
/*public class lec57 {
    static void maxElement(int index, int[] arr, int max) {
        if (index >= arr.length) {
            System.out.println(max);
            return;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        maxElement(index + 1, arr, max);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 3, 5 };
        int index = 0;
        int max = Integer.MIN_VALUE;
        maxElement(index, arr, max);
    }
}*/

//Min element
/*public class lec57 {
    static void minElement(int index, int[] arr, int min) {
        if (index >= arr.length) {
            System.out.println(min);
            return;
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        minElement(index + 1, arr, min);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 1, 5, 6, 7, 9 };
        int index = 0;
        int min = Integer.MAX_VALUE;
        minElement(index, arr, min);
    }
}*/

//Search element in an array
/*public class lec57 {
    static void findTarget(int target, int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        if (arr[index] == target) {
            System.out.println(index + " , " + arr[index]);
        }
        findTarget(target, arr, index + 1);
    }

    public static void main(String[] args) {
        int target = 5;
        int[] arr = { 1, 6, 4, 5, 2, 3, 8, 9, 7 };
        int index = 0;
        findTarget(target, arr, index);
    }
}*/

//Count occurence of element in array
/*public class lec57 {
    static void findCount(int count, int target, int index, int[] arr) {
        if (index >= arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[index] == target) {
            count++;
        }
        findCount(count, target, index + 1, arr);
    }

    public static void main(String[] args) {
        int count = 0;
        int target = 10;
        int index = 0;
        int[] arr = { 10, 20, 10, 10, 40, 50, 10 };
        findCount(count, target, index, arr);
    }
}*/

//Print digits 
public class lec57 {
    static void printDigits(int num, int digits) {
        if (num == 0) {
            return;
        }
        digits = num % 10;
        printDigits(num / 10, digits);
        System.out.println(digits);
    }

    public static void main(String[] args) {
        int num = 137;
        int digits = 0;
        printDigits(num, digits);
    }
}