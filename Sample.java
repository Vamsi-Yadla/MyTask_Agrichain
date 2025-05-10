import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        // Given a string, find the length of the longest substring without repeating characters.
        /*  Test data :
        1. ",cn.kajbdcjqn,xnajhsdeuhjuereruofdcjh"
        2. "kjksjkl1k2nxlkcmelal"
        3. "VAMSI is a vamsi2 but Venkat1 is not vamsi1.?!&*()^%$#@"
         */

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        List<Character> l = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch = s.charAt(i);
            if(!l.contains(ch)){
                l.add(ch);
            } else if (l.contains(ch)) {
                count.add(l.size());
                l.clear();
                l.add(ch);
            }

        }
        count.add(l.size());
        System.out.println(Collections.max(count));
    }

}

