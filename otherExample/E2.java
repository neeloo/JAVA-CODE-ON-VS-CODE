package otherExample;

public class E2 {
    public static void main(String[] args) {
        int arr[]={2,5,1,4,8,0,8,1,3,8};
       System.out.println(countnum(arr)); 
    }

    private static int countnum(int[] arr) {

        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                count++;
            }
        }
        return n-count;
       
    }

    
}
