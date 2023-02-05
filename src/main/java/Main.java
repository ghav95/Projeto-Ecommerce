import models.usuarios.Login;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Login.login();
/*
        List<Produto> produtos = new ArrayList<>() {{
            add(new Produto("Mouse", 150.0, Informatica.Categoria.ACESSORIOS, "Multilaser"));
            add(new Produto("Teclado", 100.0, Informatica.Categoria.ACESSORIOS, "Multilaser"));
            add(new Produto("Monitor", 800.0, Informatica.Categoria.ACESSORIOS, "Multilaser"));
            add(new Produto("Carregador", 30.0, Informatica.Categoria.CELULAR, "Multilaser"));


        }};


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            showMenu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("\033[1;32m-=-=-=-=- Lista de Produtos: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    for (Produto produto : produtos) {
                        System.out.println("- " + produto.getNome());
                    }
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("\033[1;32m-=-=-=-=- Categoria: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    for (Produto produto : produtos) {
                        System.out.println("- " + produto.getCategoria());
                    }
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.println("\033[1;32m-=-=-=-=- Marca: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    for (Produto produto : produtos) {
                        System.out.println("- " + produto.getMarca());
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("\033[1;32m-=-=-=-=- Ordem de Inserção: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("\033[1;32m-=-=-=-=- Ordem de aleatorio: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    Collections.shuffle(produtos);
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 6: {
                    System.out.println("\033[1;32m-=-=-=-=- Comparar Por Preco Crescente: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    produtos.sort(new CompararPorPreco());
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 7: {
                    System.out.println("\033[1;32m-=-=-=-=- Comparar Por Preco Decrescente: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    produtos.sort(new CompararPorPreco());
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 8: {
                    System.out.println("\033[1;32m-=-=-=-=- Comparar Por Nome Crescente: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    produtos.sort(new CompararPorNome());
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 9: {
                    System.out.println("\033[1;32m-=-=-=-=- Comparar Por Nome Decrescente: -=-=-=-=-\033[m");
                    Thread.sleep(3000);
                    Collections.reverse(produtos);
                    for (Produto produto : produtos) {
                        System.out.println(produto);
                    }
                    System.out.println();
                    break;
                }
                case 10: {
                    System.out.println("\033[1;32mSaindo...\033[m");
                    break;
                }
                default: {
                    System.out.println("Opçăo inválida!");
                }
            }
        }
        while (opcao != 10);

        sc.close();*/
    }

    public static void showMenu() {
        System.out.println("---------------------------------------");
        System.out.println("|  #  |     SERVIÇOS DISPONÍVEIS      |");
        System.out.println("---------------------------------------");
        System.out.println("|  1  | Listar Produtos               |");
        System.out.println("|  2  | Mostrar Categoria             |");
        System.out.println("|  3  | Mostrar Marca                 |");
        System.out.println("|  4  | Listar por Ordem de Inserção  |");
        System.out.println("|  5  | Listar por Ordem de aleatoria |");
        System.out.println("|  6  | Listar Preco Crescente        |");
        System.out.println("|  7  | Listar Preco Decrescente      |");
        System.out.println("|  8  | Listar Nome Crescente         |");
        System.out.println("|  9  | Listar Nome Crescente         |");
        System.out.println("| 10  | Sair                          |");
        System.out.println("|_____________________________________|");
        System.out.print("\033[34;7mDigite a opção desejada:\033[m ");
    }
}