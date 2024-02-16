package task1;

public class SwapTwoNums {
    public static void main(String[] args) {

        int a = 10, b = 23, temp;

        System.out.println("Before Swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
