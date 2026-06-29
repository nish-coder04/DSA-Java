//Sort an array of 0's and 1's
/*public class Arrays3 {
    static void sortAsc(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 0, 1, 1, 0, 1 };
        sortAsc(arr);
    }
}*/

/*public class Arrays3 {
    static void sortAsc(int[] arr) {
        int count0 = 0;
        int count1 = 0;

        for (int i : arr) {
            if (i == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 0, 0, 1, 1, 0, 1 };
        sortAsc(arr);
    }
}*/

//Missing number
/*public class Arrays3 {
    static int getMissingNum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int n = arr.length;
        int sumN = (n * (n + 1)) / 2;
        int missingNum = sumN - sum;
        System.out.println("missing number : " + missingNum);
        return missingNum;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 5, 6, 7 };
        getMissingNum(arr);

    }
}*/

/*public class Arrays3{
    static int getMissingNum(int[] arr){
        int xorSum=0;
        for (int n : arr){
            xorSum=xorSum^n;
        }
        for( int i = 0 ; i<=arr.length;i++){
            xorSum=xorSum^i;
        }
        System.out.println(xorSum);
        return xorSum;

    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 5, 6, 7 };
        getMissingNum(arr);

    }
}*/

//Find the Unique Element
/*public class Arrays3 {
    static int getUnique(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        System.out.println("Unique : " + xor);
        return xor;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        getUnique(arr);

    }
}*/

//Sort an array of 0's, 1's and 2's
/*public class Arrays3 {
    static void sortAsc(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i : arr) {
            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 1, 2, 0, 2, 1, 2, 1 };
        sortAsc(arr);
    }
}*/