
//Reverse an Array
/*import java.util.ArrayList;

public class Arrays2 {
    static void getReverseArray(int[] arr) {
        ArrayList<Integer> revArr = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr.add(arr[i]);
        }
        System.out.println(revArr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        getReverseArray(arr);
    }
}*/

//OR
/*public class Arrays2 {
    static void getReversedArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        getReversedArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}*/

//Shift array elements by 1 Position
/*public class Arrays2 {
    static void arrShiftBy1(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        arrShiftBy1(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}*/

//Identify elements with Highest and Lowest Frequency
/*import java.util.HashMap;

public class Arrays2 {
    static void getFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE, maxFreqKey = 0;
        int minFreq = Integer.MAX_VALUE, minFreqKey = 0;
        for (int key : freq.keySet()) {
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                maxFreqKey = key;
            }
            if (currentFreq < minFreq) {
                minFreq = currentFreq;
                minFreqKey = key;
            }
        }
        System.out.println("Highest Frequency: " + maxFreqKey + " -> " + maxFreq);
        System.out.println("Lowest Frequency: " + minFreqKey + " -> " + minFreq);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
        getFrequency(arr);
    }
}*/

//Find the mode of an array
/*import java.util.HashMap;
import java.util.Map;

public class Arrays2 {
    static void getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int x : freq.keySet()) {
            System.out.println(x + "-> " + freq.get(x));
        }
        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
        }
        System.out.println(maxFreqKey + ": "+ maxFreq);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5 };
        getMode(arr);
    }
}*/

