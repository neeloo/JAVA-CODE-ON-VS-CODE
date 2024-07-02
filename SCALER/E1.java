public class E1 {
    public static void main(String[] args) {
         int arr[] ={1,2,34,3,4,5,7,23,12};
        System.out.println( threeConsecutiveOdds(arr));

    }
    public static boolean threeConsecutiveOdds(int[] arr) {

        StringBuilder binaryString = new StringBuilder();
          for (int num : arr) {
            binaryString.append(num % 2);
        }
        return binaryString.toString().contains("111");
    }
    
}
