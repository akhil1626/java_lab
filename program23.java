import java.util.Scanner;
public class program23 {
	public static void qsort(String arr[],int lb, int ub) {
		if(lb<ub){
			int pos = partition(arr,lb, ub);
			qsort(arr, lb, pos-1);
			qsort(arr, pos+1, ub);
		}
		
	}
	public static int partition(String arr[],int lb,int ub) {
		int i = lb;
		int j = ub;
		String pivot = arr[lb];
		while(i<j){
			while((arr[i].compareTo(pivot)<=0)&& i<j){
				i++;
			}
			while(arr[j].compareTo(pivot)>0){
				j--;
			}
			if(i<j){
				String temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		arr[lb]=arr[j];
		arr[j]= pivot;
		return j;
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
		qsort(arr,0, arr.length-1);
		for(int i= 0 ; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
}