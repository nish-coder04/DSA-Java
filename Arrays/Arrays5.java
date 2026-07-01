
//Missing Elements from Array of Duplicates
/*import java.util.HashSet;

public class Arrays5 {
    static int findMissing(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 5, 6 };
        int n = arr.length;
        int missing = findMissing(arr, n);
        if (missing != -1) {
            System.out.println("Missing element is: " + missing);
        } else {
            System.out.println("No missing element found.");
        }
    }

}*/

//Maximum Subarray! Kadane's Algorithm 
/*public class Arrays5 {
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int sumSubArray = 0;
        for (int i = 0; i < nums.length; i++) {
            sumSubArray = nums[i]; 
            if (sumSubArray > sum)
                sum = sumSubArray;
            for (int j = i + 1; j < nums.length; j++) {
                sumSubArray += nums[j]; 
                if (sumSubArray > sum)
                    sum = sumSubArray;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
}*/

public class Arrays5 {
    static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}