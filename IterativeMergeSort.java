

public class IterativeMergeSort {
    public static void main(String[] args) {
        int arr[]={8,3,7,4};
        int n=arr.length;
        System.out.println(" SORTED ARRAY :");
        IMergeSort(arr, n);
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void IMergeSort(int arr[],int n) {
        int p,i=0,l,mid,h;
       //passes 
        for(p=2;p<=n;p=p*2){
            for (i= 0;i+p-1<n; i=i+p) {
                l=i;
                h=i+p-1;
                mid=(l+h)/2;
                Merges(arr, l, mid, h);
            }
        }
        //if odd number of elements are there then for 1 extra element 
        if(p/2<n){
            Merges(arr, 0,p/2, n-1);
        }
    }
    public static void Merges(int arr[], int l, int mid, int h) {
        int i, j, k;
        int n=arr.length;
        int  b[]=new int[n+1];
        i=l;
        k=l;
        j=mid+1;
    while(i<=mid && j<=h){
        if(arr[i]<arr[j])
        b[k++]=arr[i++];
        else
        b[k++]=arr[j++];
        }//remianing elements 
        for (; i <=mid; i++) {
            b[k++]=arr[i];
    }
    for( ; j<=h;j++){
        b[k++]=arr[j];
    }//copying elements 
 for (i =l; i <=h; i++) {
    arr[i]=b[i];
     }
      }

}
