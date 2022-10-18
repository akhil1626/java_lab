public class program10 {
	public static void m_sort(String arr[],int lb,int ub) {
		if(lb<ub)
		{
			int mid = (lb+ub)/2;
			m_sort(arr, lb, mid);
			m_sort(arr, mid+1,ub);
			merge(arr,lb,mid,ub);
		}
		
	}
	public static void merge(String arr[],int lb,int mid,int ub) {
		int idx1 = lb;
		int idx2 = mid+1;
		String merged[] = new String [ub-lb+1];
		int x=0;
		while(idx1<=mid && idx2<=ub){
			if(arr[idx1].compareTo(arr[idx2])<0){
				merged[x++] = arr[idx1++];
				
			}
			else{
				merged[x++] = arr[idx2++];

			}
		}
			while(idx1<=mid){
				merged[x++] = arr[idx1++];
			}
			while(idx2<=ub){
				merged[x++] = arr[idx2++];
			}
		
		for(int i=0,j=lb;i<merged.length;i++,j++){
			arr[j]=merged[i];
		}
	}
	public static void main(String[] args) 
	{
		String arr[] = {"ravan","akhil","ram","gowtham","penu"};
		m_sort(arr, 0, arr.length - 1);
		for(int i= 0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
	}
}