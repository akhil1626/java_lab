// merge sort
import java.util.Scanner;
public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the element into the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        divide(arr, 0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();

    }
    public static void divide(int arr[],int low,int high){
        if(low<high)
        {

            int mid=low+(high-low)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int arr[],int low,int mid,int high){
        int merged[]=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&&idx2<=high){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }

        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        
        while(idx2<=high){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=low;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
}
