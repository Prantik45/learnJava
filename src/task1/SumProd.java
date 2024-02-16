package task1;

import java.util.*;
class SumProd {

    public static void main(String args[])
    {
        int a, b, sum = 0, prod = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        sum = a + b;
        prod = a * b;
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+prod);
    }
}
