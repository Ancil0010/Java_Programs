public class Reverse  {
    public static void main(String[] args) {
        
            int arr[]={1,2,3,4,5};
            int first =arr[0];
            int last = arr.length;
            for (int i=0;i<arr.length;i++)
            {
                last =first;
                first=arr[i];
                arr[i]=last;
            }
            for (int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }   
    }
}
