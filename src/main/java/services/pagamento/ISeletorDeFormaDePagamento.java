package services.pagamento;

import java.util.List;

public interface ISeletorDeFormaDePagamento {

    IFormaDePagamento selecionarMeioDePagamento(List<IFormaDePagamento> pagamentos);

}
