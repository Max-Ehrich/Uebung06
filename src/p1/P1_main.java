package p1;

public class P1_main {
    public static void main(String[] args) {
        int a=-5;
        int b = squared(a);
        System.out.println(b);

    }
    public static int squared(int a){
        a=(a+1)*(a+1);
        return a;
    }
}
