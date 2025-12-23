import java.util.*;

public class StringCheck{
    public static boolean StrPalindrome(){
        String str = new String("matfdam");
        for(int i = 0 ;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float Directions(){
        String str1 = "WNEENESENNN";
        int x = 0;
        int y = 0;
        //float x1 = 0;
        //float y1 = 0;
        for(int i = 0 ; i<str1.length();i++){
            if(str1.charAt(i) == 'E'){
                x+=1;
            }else if(str1.charAt(i) == 'W'){
                x-=1;
            }else if(str1.charAt(i) == 'N'){
                y+=1;
            }else{
                y-=1;
            }
        }
        int X_2 = x*x;
        int Y_2 = y*y;
        return (float)Math.sqrt(X_2+Y_2);
    }
    public static void FindLargest(){
        String fruits[] = {"apple","mango","banana"};
        String largeFruit = fruits[0];
        //System.out.print(largeFruit);
        for(int i = 1;i < fruits.length;i++){
            if(largeFruit.compareTo(fruits[i])<0){
                largeFruit = fruits[i];
            }
        }
        System.out.print(largeFruit);
    }
    public static void StringUpperCase(){
        String strs = "hey, i am going to work!  ";
        StringBuilder str = new  StringBuilder("");
        str.append(Character.toUpperCase(strs.charAt(0)));
        for(int i=1;i<strs.length();i++){
            if(strs.charAt(i) == ' ' && i<strs.length()-1){
                str.append(strs.charAt(i));
                i+=1;
                str.append(Character.toUpperCase(strs.charAt(i)));
            }else{
                str.append(strs.charAt(i));
            }
        }
        System.out.print(str);
        str.toString();
        //System.out.print(str);
    }
    public static boolean sortString(String s,String t){
        char ss[] = s.toCharArray();
        System.out.println(ss);
        Arrays.sort(ss);
        System.out.println(ss);
        String str = new String(ss);
        char ts[] = t.toCharArray();
        //System.out.println(ts);
        Arrays.sort(ts);
        System.out.println(ts);
        String str1 = new String(ts);
        //System.out.print(str+"\n"+str1);
        return str.equals(str1);
    }
    public static int compress(char[] chars) {
        StringBuilder s = new StringBuilder("");
        for(int i =0;i<chars.length-1;i++){
            int count = 1;
            //char FirstEle = chars[i];
            while(i<chars.length-1 && chars[i] == chars[i+1]){
                count+=1;
                i+=1;
            }
            s.append(chars[i]);
            if(count>1){
                s.append(count);
            }
        }
        // s = ;
        char[] c = s.toString().toCharArray();
        for(int i = 0;i<c.length;i++){
            chars[i] = c[i];
        }
        for(int i = 0;i<c.length;i++){
            System.out.print(chars[i]);
        }
        return chars.length;
    }
    public static void main(String args[]){
        //check wheater a string is palindrome or not
        // boolean str1 = StrPalindrome();
        // if(str1==false){
        //     System.out.print("The given string is not palindrome");
        // }else{
        //     System.out.print("The given string is palindrome");
        // }
        //float Wl=Directions();
        //System.out.print(Wl);
        //FindLargest();
        //StringUpperCase();
        //int lens = compress(new char[]{'a','b','b','b','b','b','b'});
        //System.out.print(lens);
        String ssr = "anagram";
        String tsr = "nagaram";
        boolean s = sortString(ssr,tsr);
        System.out.print(s);
    }
}