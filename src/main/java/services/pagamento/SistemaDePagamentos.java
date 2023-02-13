package services.pagamento;

import java.util.List;

public class SistemaDePagamentos implements IGatewayDePagamento {
    private final ISeletorDeFormaDePagamento seletorDeFormaDePagamento;
    private final IGerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento;

    public SistemaDePagamentos(ISeletorDeFormaDePagamento seletorDeFormaDePagamento, IGerenciadoDeFormasDePagamento gerenciadoDeFormasDePagamento) {
        this.seletorDeFormaDePagamento = seletorDeFormaDePagamento;
        this.gerenciadoDeFormasDePagamento = gerenciadoDeFormasDePagamento;
    }

    public void pagar(Double valorPagamento) {
        List<IFormaDePagamento> formasDePagamento = gerenciadoDeFormasDePagamento.getFormasDePagamento();
        IFormaDePagamento formaDePagamento = seletorDeFormaDePagamento.selecionarMeioDePagamento(formasDePagamento);
        formaDePagamento.pagar(valorPagamento);
    }

}