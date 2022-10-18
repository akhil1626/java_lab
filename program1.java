import java.util.Scanner;
public class program1 
{
    public static void sort(int arr[],int size)
    {
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        // for(int i=0;i<size;i++){System.out.print(arr[i]+" ");}System.out.println();

    }
    public static int search(int arr[], int key){
        int lb=0;
        int ub=arr.length-1;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(arr[mid]==key){
                return mid;
                
                    
            }
            else if(key<arr[mid]){
                ub=mid-1;
            }
            else{lb=mid+1;}
        }
        return -1;
        
    }

    
    public static void main(String[] args) 
    {
        System.out.println("enter the size of the elemetns to be sorted");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("enter the elements into the array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr,size);
        for(int i=0;i<size;i++) System.out.print(arr[i]+" "); 
        System.out.println();
        System.out.println("enter the key for searching in the above list");
        int key=sc.nextInt();
        int idx=search(arr,key);
        if(idx!=-1){
            System.out.println("element found at index  "+idx);
        }
        else{System.out.println("entered key is not found in above list .......try again");}
        sc.close();

    }
    


}
