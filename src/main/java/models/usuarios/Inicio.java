package models.usuarios;

import java.util.Scanner;

public class Inicio {

    public static void iniciar(){
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while (continuar){
            imprimirMenu();
            continuar = navegacao(sc.nextInt());
        }
    }

    private static void imprimirMenu(){
        System.out.println("-----------------------------------");
        System.out.println("|  #  |    CADASTRO DE PERFIL      |");
        System.out.println("-----------------------------------");
        System.out.println("|  1  | Cliente (Pessoa Física)   |");
        System.out.println("|  2  | Cliente (Pessoa Jurídica) |");
        System.out.println("|  3  | Administrador             |");
        System.out.println("|  4  | Login                     |");
        System.out.println("|  5  | Sair                      |");
        System.out.println("|_________________________________|");
        System.out.print("\033[34;7mDigite o número do seu perfil:\033[m ");
    }

    private static boolean navegacao(int escolhaMenu){
        switch (escolhaMenu) {
            case 1 -> CadastrarClienteFisico.cadastrar();
            case 2 -> CadastrarClienteJuridico.cadastrar();
            case 3 -> CadastrarAdministrador.cadastrar();
            case 4 -> Login.login();
            case 5 -> {
                System.out.println("Finalizando sistema.");
                System.exit(0); return false; }
        }
        return true;
    }

}
