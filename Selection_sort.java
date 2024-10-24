public class Selection_sort {
    public static void selection(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minpos = i;
            for(int j = i+1;j<n;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = temp;
        }
        
    }
    public static void print_arr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        selection(arr);
        print_arr(arr);
    }
}
