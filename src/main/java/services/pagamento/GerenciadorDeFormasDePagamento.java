package services.pagamento;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorDeFormasDePagamento implements IGerenciadoDeFormasDePagamento {

    private final List<IFormaDePagamento> formasDePagamento;

    public GerenciadorDeFormasDePagamento(){

        List<IFormaDePagamento> formasDePagamento = new ArrayList<>();

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        PagamentoCartaoDeCredito pagamentoCartaoDeCredito = new PagamentoCartaoDeCredito();
        PagamentoFaturamento pagamentoFaturamento = new PagamentoFaturamento();
        PagamentoQrCodePix pagamentoQrCodePix = new PagamentoQrCodePix();

        formasDePagamento.add(pagamentoBoleto);
        formasDePagamento.add(pagamentoCartaoDeCredito);
        formasDePagamento.add(pagamentoFaturamento);
        formasDePagamento.add(pagamentoQrCodePix);

        this.formasDePagamento = formasDePagamento;
    }

    public List<IFormaDePagamento> getFormasDePagamento()
    {
        return new ArrayList<>(formasDePagamento);
    }

}
