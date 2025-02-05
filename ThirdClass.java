import Folder2.InFolder1.*;
import java.util.Scanner;

import Folder1.FirstClass;

class ThirdClass{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fact(5));
        System.out.println(a.isAnagram("listen", "silent"));

        FirstClass fc = new FirstClass();
        fc.callMe("John");
    }
}

