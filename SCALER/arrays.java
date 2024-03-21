import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int k[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // System.out.println(Arrays.toS);
    System.out.println(Arrays.toString(args));
        
    }

    static void rev(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr[i], arr[j]);
            i++;
            j--;
        }

    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

        
    
    
}