package services.pagamento;

public interface IGatewayDePagamento {

    void pagar(IFormaDePagamento formaDePagamento, Double valorPagamento);
}
