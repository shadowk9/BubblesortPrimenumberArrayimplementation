import java.util.Scanner;

 class BubbleSort {
    public static void main(String[] args) {
        int size, i, k;
        Scanner sc = new Scanner(System.in);
        //size of array
        System.out.println("Enter size of array");
        size = sc.nextInt();
        int[] arr = new int[size];
        //enter elements in array
        System.out.println("Enter elements");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        for (i = 0; i < (size - 1); i++) {
            for (k = 0; k < (size -i-1); k++) {
                if (arr[k] > arr[k + 1]) {
                    //swapping
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        System.out.println("array after sorting");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}