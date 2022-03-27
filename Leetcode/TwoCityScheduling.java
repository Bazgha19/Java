//Problem Statement: https://leetcode.com/problems/two-city-scheduling/
import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public static void main(String[] args) {
        int[][] arr = {{10,20},{30,200},{400,50},{30,20}};
        System.out.println(twoCitySchedCost(arr));
    }
    static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));

        int res = 0;
        for(int i = 0; i < costs.length / 2; i++){
            res += costs[i][0];
        }
        for(int i = costs.length / 2; i < costs.length; i++){
            res += costs[i][1];
        }
        return res;
    }
}
