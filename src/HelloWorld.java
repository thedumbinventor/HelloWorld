////import java.util.*;
////class HelloWorld
////{
////
////    static int getSum(int sum)
////    {
////       // Scanner sc = new Scanner(System.in);
////        // n = sc.nextInt();
////        if(sum<1)
////        {
////            return(0);
////        }
////        else
////            return(sum+(getSum(--sum)));
////
////    }
////    public static void main(String args[])
////    {
////        System.out.println(getSum(10));
////
////    }
////}
//
//import java.util.*;
//
//class HelloWorld {
//    static int[] arr = {5, 3, 1, 2, 4};
//    static int i = 0;
//    static int max = 0;
//
//    public static int arraySum(int[] array, int n) {
//        if (n == 0)
//            return 0;
//        else {
//            for (int i = 0; i < n - 1; i++) {
//                if (array[i] > array[i + 1]) {
//                    int t = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = t;
//                }
//            }
//
//            return arraySum(array, --n);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        arraySum(arr, arr.length);
//        for (int j : arr) {
//            System.out.println(j);
//        }
//
//    }
//}

import java.util.*;
public class HelloWorld {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float c = n;
        float r=0;
        String s=n+"";
        String k=s.replace('.',' ');
        String z=k;
        String k2=k.substring(k.indexOf(' ')+1);
        String k1= z.substring(0,k.indexOf(' '));
        int var=Integer.parseInt(k1+k2);
        int h=var;
        while (h > 0)
        {
            int d = h % 10;
            r = r * 10 + d;
            h /= 10;

        }
        if(r==var)
            System.out.println("palindrome");
        else System.out.println("Not PALINDROME");

    }
}
