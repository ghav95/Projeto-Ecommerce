package services.pagamento;

import java.util.List;

public class ExibidorDeFormaDePagamentos {

    public void exibirMeiosDePagamento(List<IFormaDePagamento> pagamentos) {
        for (IFormaDePagamento pagamento : pagamentos) {
            System.out.println(pagamento.getClass().getSimpleName());
        }
    }

}
