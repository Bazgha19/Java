//Problem Statement: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,1,3};
        System.out.println(groupThePeople(arr));
    }
    static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = groupSizes.length;

        for(int i = 0; i < n; i++){
            int curr = groupSizes[i];
            List<Integer> temp = new ArrayList<>();
            if(map.containsKey(curr)) temp = map.get(curr);
            temp.add(i);
            map.put(curr, temp);
            if(temp.size() == curr){
                res.add(temp);
                map.remove(curr);
            }
        }

        return res;
    }
}
