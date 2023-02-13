package services.pagamento;

public class PagamentoBoleto implements IFormaDePagamento {

    @Override
    public void pagar(Double valorPagamento) {
        if(analisarFraude(valorPagamento)) System.out.println("Pagando via Boleto");
    }

    @Override
    public boolean analisarFraude(Double valorPagamento) {
        return true;
    }
}
