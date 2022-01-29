import java.util.Arrays;

public class VarArgs {
    //Variable length arguments
    //Create a method that takes variable length of argument
    //When we don't know how many arguments we are giving
    public static void main(String[] args) {
        func(2,3,4,22,0,1,7,8345,566,7443,6,67,5);
        func2("abc","def","hij","klm");
        multiple(10,5, "abc", "def", "ghi");
    }
    static void multiple(int a, int b, String ...v){
        //variable length argument are always written in the end because if we write in the first or in the middle then we don't know that after how many variable we have to add the next variable or the last variable
        //Example multiple(int a, String ...v, int b) : we can't write like this because this will give error because we don't have any idea that how many Strings are taken so we don't have any idea about that when b will be shown
        System.out.println(Arrays.toString(v));
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void func2(String ...a){
        System.out.println(Arrays.toString(a));
    }
}
