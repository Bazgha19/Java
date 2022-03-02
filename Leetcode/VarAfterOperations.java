//Problem Statement: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class VarAfterOperations {
    public static void main(String[] args) {
        String[] arr = {"X++","X++","--X"};
        System.out.println(finalValueAfterOperations(arr));
    }
    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i <= operations.length-1; i++){
            if (operations[i].charAt(1) == '-'){
                x--;
            } else{
                x++;
            }
        }
        return x;
    }
}



//My first solution
//int x = 0;
//        for (int i = 0; i <= operations.length-1; i++){
//                if (operations[i] == "--X"){
//                --x;
//                } else if(operations[i] == "++X"){
//                ++x;
//                } else if (operations[i] == "X--"){
//                x--;
//                } else if (operations[i] == "X++"){
//                x++;
//                }
//                }
//                return x;