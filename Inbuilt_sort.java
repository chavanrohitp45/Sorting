import java.util.*;
import java.util.Collections;
public class Inbuilt_sort {
    public static void print_arr(Integer[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {2,1,3,4,5};
        //Arrays.sort(arr,0,3);
        //print_arr(arr);

        Integer arr[] = {2,1,3,4,5};

        Arrays.sort(arr,Collections.reverseOrder());
        print_arr(arr);
    }
}
