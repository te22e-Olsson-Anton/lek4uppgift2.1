import java.util.Scanner;
public class App 

{
    public static void main(String[] args) throws Exception {
        

        Scanner tb = new Scanner(System.in);
        System.out.println("Skriv Text");
        String text = tb.nextLine();

        int antal_bokstäver = text.length();

        System.out.println("\""+text+"\" har " +antal_bokstäver+ " bokstäver");
    }
}
