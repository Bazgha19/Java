import java.util.Arrays;

public class Overloading {
    //Function Overloading
    //Functions having same name but different arguments or number of arguments should be different
    public static void main(String[] args) {
        func("name");
        func(10);
        func("Hello");
        func(1,2,3,4,5);

    }
    static void func(String s){
        System.out.println(s);
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
