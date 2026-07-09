//Sqrt(x)
/*public class lec40 {
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
}*/

//Sqrt(x) with precision
public class lec40 {
    static double Sqrt(int x) {
        int s = 1;
        int e = x;
        double answer = -1;
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
        double factor = 1;
        int totalPrecision = 3;
        for (int round = 1; round <= totalPrecision; round++) {
            factor = factor / 10;
            for (int i = 1; i <= 10; i++) {
                double newAns = answer + factor;
                if (newAns * newAns == x) {
                    answer = newAns;
                    return answer;
                } else if (newAns * newAns < x) {
                    answer = newAns;
                } else {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int x = 56;
        double SquareRoot = Sqrt(x);
        System.out.println(SquareRoot);
    }
}
