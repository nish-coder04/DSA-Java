import java.util.List;
import java.util.ArrayList;

public class pascalsTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 1 ; i<=numRows ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 1 ; j<=i;j++){
                if(j == 1 || j==i){
                    row.add(1);
                }else{
                    row.add((answer.get(i-2).get(j-2)) + (answer.get(i-2).get(j-1)));
                }
            }
            answer.add(row);
        }
        return answer;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);

    }
}
