import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
    Scanner sc =new Scanner(System.in);

    
    System.out.println("Nome piatto");
    String piatto = sc.nextLine();

    System.out.println("Descrizione");
    String Descrizione = sc.nextLine();

    System.out.println("Allergeni");
    String allergeni = sc.nextLine();

    System.out.println("Variazioni");
    String Variazioni = sc.nextLine();

    System.out.println("Disponibilità");
    Boolean Disponibilità= sc.nextBoolean();

    System.out.println("Calorie");
    Short Calorie = sc.nextShort();

    System.out.println("Foto");
    String foto = sc.nextLine();
    
    sc.nextByte();


    System.out.println("Tipologia");
    Byte tipologia= sc.nextByte();

    System.out.println("Prezzo");
    Double prezzo= sc.nextDouble();

    sc.close();




  //----------------------------------------------------------------------------------------
   
    System.out.println(" Piatto: " +    piatto);
    
    System.out.println("Descrizione:  " +  Descrizione);

    System.out.println("Allergeni:  " +   allergeni);

    System.out.println("Variazioni:  " +   Variazioni);

    System.out.println("Disponibilità:  " +   Disponibilità);
    
    System.out.println("Calorie:  " +    Calorie);

    System.out.println("Foto:  " +    foto);

    System.out.println("Tipologia:  " +    tipologia);

    System.out.println("Prezzo:    "+   prezzo);

    }
}
