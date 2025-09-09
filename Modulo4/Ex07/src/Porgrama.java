import Entidades.Departamento;
import Entidades.HoraContrato;
import Entidades.Trabalhador;
import Enum.NivelTrabalhador;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Porgrama {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Diga o departamento que quer entrar: ");
        String departamento = scan.next();
        Departamento dep = new Departamento(departamento);

        System.out.println("Diga suas informações: ");
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Nivel: ");
        String nivel = scan.next().toUpperCase();
        NivelTrabalhador lvl = NivelTrabalhador.valueOf(nivel);
        System.out.print("Base salarial: ");
        Double salario = scan.nextDouble();
        Trabalhador trab = new Trabalhador(nome, salario, lvl, dep);

        System.out.println("Quantos contratos você tem: ");
        int quantidade = scan.nextInt();

        for(int i =0; i< quantidade; i ++){
            System.out.printf("Contrato # %d",  i + 1);
            System.out.print("Data: (DD/MM/YYYY): ");
            Date data = sdf.parse(scan.next());
            System.out.print("Valor por hora: ");
            Double valor = scan.nextDouble();
            System.out.print("Duração em horas: ");
            int duracao = scan.nextInt();

            HoraContrato contrato = new HoraContrato(data, valor, duracao);
            trab.AdicionarContrato(contrato);
        }

        System.out.print("Digite o mes e o ano para calcular a renda (MM/YYYY): ");
        String ano_mes = scan.next();
        int mes = Integer.parseInt(ano_mes.substring(0,2));
        int ano = Integer.parseInt(ano_mes.substring(3));
        System.out.println("Nome: " + trab.getNome());
        System.out.println("Departamento: " + trab.getDepartamento().getNome());
        System.out.printf("Renda no mes e ano %s: %2.f", ano_mes, trab.Valor(ano, mes) );
        scan.close ();
    }
}
