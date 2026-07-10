
//EKO SPOJ
import java.util.Arrays;

public class lec44 {
    static boolean isValidHeight(int[] trees, int m, int mid) {
        int wood = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] >= mid) {
                int currentWood = trees[i] - mid;
                wood = wood + currentWood;
            }
        }
        if (wood >= m) {
            return true;
        } else {
            return false;
        }
    }

    static int maxSawHeight(int[] trees, int m) {
        Arrays.sort(trees);
        int s = 0;
        int e = trees[trees.length - 1];
        int height = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidHeight(trees, m, mid)) {
                height = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        int trees[] = { 20, 15, 10, 17 };
        int m = 7;
        int finalAnswer = maxSawHeight(trees, m);
        System.out.println(finalAnswer);
    }
}
