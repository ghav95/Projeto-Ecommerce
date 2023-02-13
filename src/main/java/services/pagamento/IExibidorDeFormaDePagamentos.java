package services.pagamento;

import java.util.List;

public interface IExibidorDeFormaDePagamentos {

    void exibirMeiosDePagamento(List<IFormaDePagamento> pagamentos);

}
