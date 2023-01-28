import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Informatica extends Produto{
    private String modelo;
    private boolean isImportado;
    private boolean isSoftware;
}
