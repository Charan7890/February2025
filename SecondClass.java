import Folder1.*;
import java.util.Scanner;;
class SecondClass{
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().strip();
        FirstClass fc = new FirstClass();
        fc.callMe(name);                
    }
}