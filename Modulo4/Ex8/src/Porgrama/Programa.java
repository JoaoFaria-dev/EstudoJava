package Porgrama;

import Entidades.Comentarios;
import Entidades.Poste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Comentários: ");
        String coment1 = scan.nextLine();
        String coment2 = scan.next();

        Comentarios c1 = new Comentarios(coment1);
        Comentarios c2 = new Comentarios(coment2);

        Poste p1 = new Poste(
                sdf.parse("10/09/2025 16:03:00"),
                "Vou viajar para a nova zelândia",
                "Estou muito ansioso para ver a cultura Maori",
                50
        );

        p1.AdicionarComents(c1);
        p1.AdicionarComents(c2);

        System.out.println(p1);

        scan.close();
    }
}
