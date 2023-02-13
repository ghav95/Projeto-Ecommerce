package services.pagamento;

import java.util.Collections;
import java.util.List;

public class SeletorDeFormaDePagamento implements ISeletorDeFormaDePagamento {

    public IFormaDePagamento selecionarMeioDePagamento(List<IFormaDePagamento> pagamentos) {
        Collections.shuffle(pagamentos);
        return pagamentos.get(0);
    }


}
