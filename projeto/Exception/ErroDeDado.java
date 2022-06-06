package Exception;
import java.util.Scanner;

public class ErroDeDado extends RuntimeException {
  @Override
  public String getMessage() {
    return "Erro de tipo na digitação do campo.";
  }  
}
