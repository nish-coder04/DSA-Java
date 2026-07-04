// Bubble Sort
/*public class lec35 {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}*/

//Selection Sort
/*public class lec35 {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIndex];
            arr[lowestIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1, 6 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}*/

//Insertion Sort
/*public class lec35 {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = i;
            int prev = i - 1;
            int currentValue = arr[current];
            while (prev >= 0 && currentValue < arr[prev]) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 5, 2, 3 };
        insertionSort(arr);
        for (int k : arr) {
            System.out.print(k + " ");
        }

    }
}*/