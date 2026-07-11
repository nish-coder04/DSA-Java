
//Roti Paratha
import java.util.Arrays;

public class lec45 {
    static boolean isValidTime(int maxTime, int parathas, int[] cook) {
        int totalParathaCount = 0;
        for (int i = 0; i < cook.length; i++) {
            int currentCook = cook[i];
            int timeTaken = 0;
            int j = 1;
            while (timeTaken <= maxTime) {
                if (timeTaken + j * currentCook <= maxTime) {
                    totalParathaCount++;
                    timeTaken = timeTaken + j * currentCook;
                    j++;
                } else {
                    break;
                }
            }
        }
        if (totalParathaCount >= parathas) {
            return true;
        } else {
            return false;
        }
    }

    static int minTimeToCook(int[] cook, int parathas) {
        Arrays.sort(cook);
        int s = 0;
        int answer = -1;
        int e = cook[cook.length - 1] * ((parathas * (parathas + 1)) / 2);
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidTime(mid, parathas, cook)) {
                answer = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        int cook[] = { 1, 2, 3, 4 };
        int parathas = 10;
        int finalAnswer = minTimeToCook(cook, parathas);
        System.out.println(finalAnswer);
    }
}
