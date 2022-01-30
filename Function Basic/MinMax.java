import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();
        System.out.println(min(a,b,c));
        System.out.println(max(a,b,c));
    }

    static String max(int a, int b, int c){
        if (a>b){
            if (a>c){
                return "First number("+a+") is maximum.";
            }
        } else if(b>a){
            if (b>c){
                return "Second number("+b+") is maximum.";
            }
        }
        return "Third number("+c+") is maximum.";
    }

    static String min(int a, int b, int c){
        if (a<b){
            if (a<c){
                return "First number("+a+") is minimum";
            }
        } else if (b<a){
            if(b<c){
                return "Second number("+b+") is minimum";
            }
        }
        return "Third number("+c+") is minimum";
    }

}
