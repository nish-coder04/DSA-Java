//Two Sum
/*public class Arrays4 {
    static void getTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("indices of two number :" + i + " " + j);
                }
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7 };
        getTwoSum(arr, 1);
    }
}*/

/*public class Arrays4 {
    static void getTwoSum(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("indices of two number :" + i + " " + j);
            }
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 9 };
        getTwoSum(arr, 8);
    }
}*/

/*import java.util.HashMap;

public class Arrays4 {
    static HashMap<Integer, Integer> ans = new HashMap<>();
    static void getTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (ans.containsKey(complement)) {
                System.out.println(ans.get(complement) + " " + i);
            }
            ans.put(arr[i], i);
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 6, 2, 9 };
        getTwoSum(arr, 8);
    }
}*/

//Three sum problem
/*public class Arrays4 {
    static void getThreeSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("indices of three number :" + i + " " + j + " " + k);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 5, 4, 1, 6 };
        getThreeSum(arr, 9);
    }
}*/

/*import java.util.List;
import java.util.Arrays;

public class Arrays4 {
    static void threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        threeSum(nums, 0);
    }
}*/

//remove duplicates
/*public class Arrays4 {
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);
        for (int a : nums) {
            System.out.print(a + " ");
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7 };
        removeDuplicates(nums);
    }
}*/

//Find first repeating element in the array
/*import java.util.HashMap;

public class Arrays4 {
    static int repeatingElement(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i : arr) {
            if (freq.get(i) > 1) {
                System.out.print(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6 };
        repeatingElement(arr);
    }
}*/

// find pivot index
/*public class Arrays4 {
    static int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = nums[0];
        rightSum[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i] + leftSum[i - 1];
        }
        for (int j = nums.length - 2; j >= 0; j--) {
            rightSum[j] = rightSum[j + 1] + nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        int output = pivotIndex(nums);
        System.out.println(output);
    }
}*/