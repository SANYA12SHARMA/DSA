package Arrays.Easy;
import java.util.Scanner;
public class Largest{
    public static int findLargest(int[] array,int arr_size){
        int largest_element = array[0];
        for(int i=1;i<arr_size;i++){
            if(array[i]>largest_element){
                largest_element=array[i];
            }
        }
        return largest_element;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int array[] = new int[arr_size];
        for(int i=0;i<arr_size;i++){
            array[i] = sc.nextInt();
        }
        int largest_element = findLargest(array,arr_size);
        System.out.println("Largest Element in an array "+largest_element);
    }
}
//Time Complexity : O(N)
//Space Complexity : O(1)