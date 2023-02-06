package models.usuarios;

import java.util.Scanner;

public class Login {
    public static void login(){
        Scanner sc = new Scanner(System.in);
        String senha = "";
        int tentativas = 0;
        Pessoa<?> usuario;
        System.out.print("\033[34;7mDigite o seu login:\033[m ");
        usuario = isCadastrado(sc.next());

        if (usuario == null){
            System.out.println("\033[1;31mLogin não cadastrado!\033[m");
               InicioCadastroPerfil.iniciar();
        }
        else
        {
            while (tentativas < 3)
            {
                System.out.print("\033[34;7mDigite sua senha:\033[m ");
                senha = sc.next();

                if (isAdministrador(usuario)) {
                    Administrador admin = (Administrador) usuario;
                    if(admin.getSenha().equals(senha)) {
                        System.out.println("Bem vindo, administrador " + admin.getNome() + ".");
                        InicioAdministrador.iniciar();
                        tentativas = 3;
                        break;
                    }
                }

                if (isCliente(usuario)) {
                    Cliente cliente = (Cliente) usuario;
                    if(cliente.getSenha().equals(senha)) {
                        System.out.println("\033[32mBem vindo, cliente " + cliente.nome + ".\033[m");
                        InicioAdministrador.iniciar();
                        tentativas = 3;
                        break;
                    }
                }
                System.out.println("\033[1;31mSenha inválida!\033[m");
                tentativas++;
            }
            System.out.println("\033[33mSaindo...\033[m");
            System.exit(0);
        }
    }

    public static Pessoa<?> isCadastrado(String login)
    {
        Pessoa<?> p =  new Administrador().getByLogin(login);
        if (p == null){
            p = new Cliente().getByLogin(login);
        }
        return p;
    }

    public static boolean isAdministrador(Pessoa<?> p){
        return p instanceof Administrador;
    }

    public static boolean isCliente(Pessoa<?> p){
        return p instanceof Cliente;
    }

}
