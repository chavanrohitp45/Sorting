public class Bubble_sort{
    public static void bubble(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<=n-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void print_arr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,1};
        bubble(arr);
        print_arr(arr);
    }
}