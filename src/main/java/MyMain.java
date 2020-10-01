import java.util.Arrays;
import java.util.Scanner;
public class MyMain {

    // Reverses an array
    public static String reverse(int[] arr) {
    //int temp = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i + (arr.length - (i * 2))];
    }
    //arr[0] = temp;
    //int[] arr11 = new int[5];
    return (Arrays.toString(arr));
    //return arr[1];
    //return 4;
    }
   // } //figure out how to correctly print arrays

    // Finds the second largest number in an array
    public static String secondLargest(int[] arr, String hello) {
        int max = -200000;
        int secondmax = -2000000;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
      if (hello == "no") {
      arr[3] = 0;
    }
      }
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] > secondmax) {
        secondmax = arr[j];
        } 
    }
}

  return Arrays.toString(arr);
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int j = 0;
        for (int i = 0; i > arr.length - 2; i++) {
            //int i = 0;
            if (arr[i] / arr[i + 1] != arr[i + 1] / arr[i + 2]) {
               boolean c = false;
               break;
            }
            else {
                boolean c =  true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[] arr6 = {2, 4, 6, 8, 1};
        //int[] arr7 = {1, 2, 4, 8, 16};
        System.out.println(reverse(arr6));
        System.out.println("Is your highest value" + 8 + " ?");
        String hello = scan.next();
        System.out.println(secondLargest(arr6, hello));

        System.out.println(isGeometric(arr6));
    }
}
