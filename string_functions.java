
import java.util.Scanner;
import javax.lang.model.util.SimpleTypeVisitor14;

public class string_functions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        s = "  " + s + "  ";
        System.out.println(s.trim());
        s = s.trim();
        System.out.println(s.startsWith("Vivek Ku"));
        System.out.println(s.endsWith("mar Pandey"));
        String s2 = "Vivek kumar pandey";
        System.out.println(s.equalsIgnoreCase(s2));
        int a = 101;

        String s3 = String.valueOf(a);
        System.out.println(s3);

        String s4 = s.replace("Vivek","Vinay");
        System.out.println(s4);
        System.out.println(s4.contains("Vinay"));
        System.out.println(s4.substring(0,4));
        String aa[] = s.split(" ");
        System.out.println(aa[0]);
        System.out.println(s.isEmpty());
        System.out.println("  ".isBlank());

        


    }
}