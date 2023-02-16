package services;

import services.validadores.ValidarCNPJ;
import services.validadores.ValidarCPF;

import java.util.Scanner;

public class CadastrarCPFCNPJValido {
    public static String getCPFValido()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o cpf: ");
        String cpf = sc.next();
        while (!ValidarCPF.isValido(cpf))
        {
            System.out.print("\033[1;31mCPF inválido!\033[m Digite novamente: ");
            cpf = sc.next();
        }
        return cpf;
    }

    public static String getCPNJValido()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o cnpj: ");
        String cnpj = sc.next();
        while (!ValidarCNPJ.isValido(cnpj))
        {
            System.out.print("\033[1;31mCNPJ inválido!\033[m Digite novamente: ");
            cnpj = sc.next();
        }
        return cnpj;
    }
}
