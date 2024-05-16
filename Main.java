import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the value of n to find the nth smallest element: ");
        int n = s.nextInt();

        for(int i = 0 ; i < size ; i++){
            for (int j = i + 1; j < size ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The "+ n + "nd smallest element is: "+ arr[n-1]);
    }
}