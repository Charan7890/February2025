package Folder2.InFolder1;

public class A{
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0; i<s1.length(); i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}