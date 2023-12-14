public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {6,2,1,7,3,5};

    int i;
    int j;
    int key;


    for(i=1;i<arr.length;i++){
        j=i-1;
        key = arr[i];
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j-1;
        }
        arr[j+1] = key;
    }

    for(i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
