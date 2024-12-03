import java.util.Scanner;

public class Ingredienti {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingredienti");
        String Ingredienti = sc.nextLine();

        System.out.println("Descrizione");
        String Descrizione = sc.nextLine();

        System.out.println("Disponibilità");
        Boolean Disponibilità = sc.nextBoolean();

        System.out.println("Allergeni");
        String Allergeni = sc.nextLine();
        sc.nextLine();

        System.out.println("Costo");
        Double Costo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Foto");
        String Foto = sc.nextLine();

        System.out.println("Ingredienti:   "   +  Ingredienti);
        System.out.println("Descrizione:   "   +  Descrizione);
        System.out.println("Disponibilità: "   +  Disponibilità);
        System.out.println("Allergeni:     "   +  Allergeni);
        System.out.println("Costo:         "   + Costo);
        System.out.println("Foto:   "         +  Foto);
}
}
