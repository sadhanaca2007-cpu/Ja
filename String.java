import java.util.Scanner;

public class ExtractString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();   
        int start = sc.nextInt();    
        int end = sc.nextInt();       
        
        String result = str.substring(start, end);
        System.out.println(result);
    }
}