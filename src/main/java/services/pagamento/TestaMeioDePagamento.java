package services.pagamento;


import java.lang.reflect.InvocationTargetException;

public class TestaMeioDePagamento {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ExibidorDeFormaDePagamentos exibidorDeFormaDePagamentos = new ExibidorDeFormaDePagamentos();
        SeletorDeFormaDePagamento seletorDeFormaDePagamento = new SeletorDeFormaDePagamento();

        IGerenciadoDeFormasDePagamento gerenciadorDeFormasDePagamento = new GerenciadorDeFormasDePagamento();

        IGatewayDePagamento gatewayDePagamento = new SistemaDePagamentos(seletorDeFormaDePagamento, gerenciadorDeFormasDePagamento);

        gatewayDePagamento.pagar(2000.00);

        System.out.println();

        exibidorDeFormaDePagamentos.exibirMeiosDePagamento(gerenciadorDeFormasDePagamento.getFormasDePagamento());

    }


}
