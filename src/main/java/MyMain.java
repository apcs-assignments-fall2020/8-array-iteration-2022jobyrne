import java.util.Arrays;
import java.util.Scanner;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
    //int temp = arr[arr.length-1];
        int[] arr2 = new int[arr.length];
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--)
        {
        arr2[counter] = arr[i];
        counter++;
        }
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int max = -200000;
        int secondmax = -200000;
        int[] arr2 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
        for (int j = 0; j < arr.length; j++)
        {
           if (arr[j] == max)
           {
               arr[j] = -2000000000;
           }
        }
        arr2 = arr;
        for (int k = 0; k < arr2.length; k++)
        {
            if (arr2[k] > secondmax)
            {
                secondmax = arr2[k];
            }
        }
   return secondmax;
    //return Arrays.toString(arr2);
}

    // Checks to see if an array contains a geometric series
    public static Boolean isGeometric(int[] arr) {
        boolean c = true;
        int x = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            double val = arr[i];
            double val2 = arr[i+1];
            double val3 = arr[i+2];
            if (val/val2 == val2/val3)
            {
                    c = true;
            }

            else 
            {
                c =  false;
                break;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] arr6 = {2, 4, 6, 8, 1};
        int[] arr7 = {1, 2, 4, 8, 16};
        System.out.println(secondLargest(arr7));
        System.out.println(3 % 8);
        //System.out.println("Is your highest value" + 8 + " ?");
        //String hello = scan.next();
        // System.out.println(secondLargest(arr6, hello));

        //System.out.println(isGeometric(arr6));
    }
}
