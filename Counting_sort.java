public class Counting_sort {
    public static void counting_sort(int[] arr){
        int n = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        n = max;
        int temp[] = new int[n + 1];
        // System.out.println(n);
        for(int i = 0;i<arr.length;i++){
            temp[arr[i]]++;
        }

        int j = 0;
        for(int i = 0;i<temp.length;i++){
            while(temp[i]>0){
                arr[j] = i;
                j++;
                temp[i]--;
            }
        }
        
    }
    public static void print_arr(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        counting_sort(arr);
        print_arr(arr);
    }
}
