public class Shadowing {
    static int x = 100; // this will shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //100
        int x = 10; // class variable at line 2 is shadowed by this variable
        System.out.println(x); //10
        fun();
    }
    static void fun(){
        System.out.println(x); //100
    }
}
