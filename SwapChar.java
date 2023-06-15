import java.util.Scanner;
public class SwapChar {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        char b=a.charAt(0);
        char c=a.charAt(a.length()-1);
        System.out.println(a.replace(b,c));
    }
    
}
