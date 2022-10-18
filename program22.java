import java.util.Scanner;
public class program22 {
	public static void isort(String arr[]) {
		int n = arr.length;
		for(int i = 1;i<n;i++){
			String cur =arr[i];
			int j= i-1;
			while(j>=0 && cur.compareTo(arr[j])<0){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=cur;
		}
	}
	public static int bsearch(String arr[],String key){
	
		int lb=0;
		int ub =arr.length - 1;
		while(lb<=ub){
			int mid = (lb+ub)/2;
			if(arr[mid].equals(key)){
				return mid;
			}
			else if(key.compareTo(arr[mid])<0){
				ub=mid-1;
			}
			else{
				lb=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to be inserted--> ");
		int n = sc.nextInt();
		System.out.println("Enter the strings.... ");
		String arr[] = new String[n];
		for(int i = 0;i<n;i++){
			arr[i] = sc.next();
		}
		isort(arr);
		System.out.println("Enter the key value to be searched--> ");
		String key = sc.next();
		int pos = bsearch(arr,key);
		if(pos == -1){
			System.out.println("element not found...");
		}
		else{
			System.out.println("Element found at index : "+pos);
		}
		for(String i : arr){
			System.out.print(i+" ");
		}
		sc.close();
	}
}