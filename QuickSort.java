import java.util.*;
class QuickSort
  {
public class Main 
{
    public static int partition(int a[], int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;
        while (start < end) {
         while (a[start] <= pivot && start < ub) {
               start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        a[lb] = a[end];
        a[end] = pivot;
        return end;
    }
    public static void quickSort(int a[], int lb, int ub) {
       if (lb < ub) {
            int loc = partition(a, lb, ub);
            quickSort(a, lb, loc - 1);
            quickSort(a, loc + 1, ub);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 15, 1, 2, 9, 16, 11};
        int lb = 0;
       int ub = arr.length - 1;
        quickSort(arr, lb, ub);
        System.out.println("after sorting");
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
     }
  }
}
