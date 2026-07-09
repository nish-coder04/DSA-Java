//Sqrt(x)
public class lec40 {
    static int Sqrt(int x) {
        int s = 1;
        int e = x;
        int answer = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (x == 0) {
                answer = 0;
                return answer;
            }
            if (mid == x / mid) {
                answer = mid;
                return answer;
            }
            if (mid > x / mid) {
                e = mid - 1;
            } else {
                answer = mid;
                s = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 56;
        int squareRoot = Sqrt(x);
        System.out.println(squareRoot);
    }
}

//
