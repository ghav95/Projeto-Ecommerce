package services.pagamento;

public class PagamentoQrCodePix implements IFormaDePagamento {

    @Override
    public void pagar(Double valorPagamento) {
        if(analisarFraude(valorPagamento)) System.out.println("Pagamento via PIX");
        else System.out.println("Pagamento recusado: Valor maior ou igual à R$1.000,00!");
    }

    @Override
    public boolean analisarFraude(Double valorPagamento) {
        return (valorPagamento < 1000.0);
    }
}
