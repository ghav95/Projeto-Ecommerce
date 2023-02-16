package services;

import models.usuarios.Administrador;
import models.usuarios.Cliente;
import models.usuarios.Usuario;

import java.util.Scanner;

public class Login {

    public static void login(){
        Scanner sc = new Scanner(System.in);
        String senha = "";
        int tentativas = 0;
        Usuario usuario;
        System.out.print("\033[34;7mDigite o seu login:\033[m ");
        usuario = isCadastrado(sc.next());

        if (usuario == null){
            System.out.println("Login não cadastrado!");
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
                        System.out.println("Bem vindo, cliente " + cliente.getNome() + ".");
                        InicioAdministrador.iniciar();
                        tentativas = 3;
                        break;
                    }
                }
                System.out.println("Senha inválida!");
                tentativas++;
            }
            System.out.println("Finalizando sistema.");
            System.exit(0);
        }
    }

    public static Usuario isCadastrado(String login)
    {
        Usuario usuario =  Administrador.getByLogin(login);
        if (usuario == null){
            usuario = Cliente.getByLogin(login);
        }
        return usuario;
    }

    public static boolean isAdministrador(Usuario usuario){
        return usuario instanceof Administrador;
    }

    public static boolean isCliente(Usuario usuario){
        return usuario instanceof Cliente;
    }

}
