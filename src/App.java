import java.util.Scanner;
public class App 

{
    public static void main(String[] args) throws Exception {
        

        Scanner tb = new Scanner(System.in);
        System.out.println("Skriv Text");
        String text = tb.nextLine();

        int antal_bokstäver = text.length();

        System.out.println("Skriv en bosktav: ");
        String bokstav = tb.nextLine();
        
        int plats = text.indexOf(bokstav);

        System.out.println("\""+text+"\" har " +antal_bokstäver+ " bokstäver");

        System.out.println("bokstaven " +bokstav+ " är på platsen " + (plats+1));


        System.out.println("skriv ett nummer");
        int start = tb.nextInt();
        System.out.println("Skriv ett till nummer");
        int steg_fram = tb.nextInt();

        String del_sträng = text.substring(start, steg_fram);
        System.out.println(del_sträng);

    }
}
