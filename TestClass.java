import Folder2.linkedlist.*;
import java.util.Scanner;
public class TestClass{
    public static int[] convertToInteger(String nums[]){
        int integers[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            integers[i] = Integer.parseInt(nums[i]);
        }
        return integers;
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements that you want to insert in linkedlist:");
        Scanner sc = new Scanner(System.in);
        String numbers[] = sc.nextLine().split(" ");
        int[] nums = convertToInteger(numbers);

        // for (int i : nums) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        SLL sll = new SLL();
        for (int i : nums) {
            sll.insert(i);
        }
        sll.display();
        sll.delete();
        sll.display();
        sll.delete();
        sll.display();
        sll.delete();
        sll.display();
        sll.delete();
        sll.display();
        sll.delete();
        sll.display();
    }
}