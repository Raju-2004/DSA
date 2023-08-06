import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {2,4,1,7,5,3,9};
		MergeSort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	static void MergeSort(int arr[],int s,int e)
	{
	    if(e-s<=1)
	    {
	        return;
	    }
	    int mid = (e+s)/2;
	    MergeSort(arr,0,mid);
	    MergeSort(arr,mid,e);
	    MergeInplace(arr,s,mid,e);
	}
    static void MergeInplace(int arr[], int s, int mid, int e) {
        int mix[] = new int[arr.length];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < k; l++) {
            arr[s + l] = mix[l];
        }
    }

}
