package services.pagamento;

public class PagamentoCartaoDeCredito implements IFormaDePagamento {

    @Override
    public void pagar(Double valorPagamento) {
        if(analisarFraude(valorPagamento)) System.out.println("Pagando via Cartão de Crédito");
        else System.out.println("Pagamento recusado: Valor maior ou igual à R$2.000,00!");
    }

    @Override
    public boolean analisarFraude(Double valorPagamento) {
        return (valorPagamento < 2000.0);
    }
}
