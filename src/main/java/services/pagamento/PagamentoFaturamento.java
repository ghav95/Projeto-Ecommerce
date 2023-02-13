package services.pagamento;

public class PagamentoFaturamento implements IFormaDePagamento{
    @Override
    public void pagar(Double valorPagamento) {
        if(analisarFraude(valorPagamento)) System.out.println("Pagamento via Faturamento");
    }

    @Override
    public boolean analisarFraude(Double valorPagamento) {
        return true;
    }
}
