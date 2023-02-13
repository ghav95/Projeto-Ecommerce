package services.pagamento;

public interface IFormaDePagamento {
    void pagar(Double valorPagamento);
    boolean analisarFraude(Double valorPagamento);
}
