import java.util.Scanner;


public class program2 {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the elements into the array");
        for(int i =0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("before sorting the elements are ");
        for(int i=0;i<size;i++){System.out.print(arr[i]+" ");}System.out.println();
        insertiosort(arr,size);
        System.out.println("after sorting the elements are ");
        for(int i=0;i<size;i++){System.out.print(arr[i]+" ");}System.out.println();
        System.out.println("enter the key value to be search");
        int key=sc.nextInt();
        int index=search(arr,key);
        if(index==-1){
            System.out.println("element not found........! try again");
        }
        else{System.out.println("element found at index "+index);}
        sc.close();

    }
    public static void insertiosort(int arr[],int size)
    {
        for(int i=1;i<size;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

        }
    }
    public static int search(int arr[],int key)
    {
        int lb=0;
        int ub=arr.length-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (key<arr[mid]){
                ub=mid-1;
            }
            else {
                lb=mid+1;
            }
        }
        return -1;
    }
    
}
