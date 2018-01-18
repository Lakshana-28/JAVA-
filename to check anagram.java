import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        if(a.replaceAll(" ","").length()==b.replaceAll(" ","").length())
        {
            char[] c=a.toCharArray();
            char[] d=b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            if(Arrays.equals(c,d))
            {
                System.out.println("anagram");
               
            }
            else{
                System.out.println("not anagram");
            }
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}
