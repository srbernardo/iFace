package Delete;

import java.util.ArrayList;

import Usuario.Usuario;
import Interfaces.Checar_Existencia.Checar_Existencia;

public class Usuario_Existente implements Checar_Existencia {
  
  @Override
  public <E> int checar_existencia(String login, ArrayList<E> usuarios) {
    int count = 0;
    int result = 0;

    for (int i = 0; i < usuarios.size(); i++) {
      if (login.equals(((Usuario) usuarios.get(i)).getLogin())) {
        result = i;
        break;
      } else {
        count++;
      }
    }
    if (count == usuarios.size()) {
      result = -1;
    }
    return result;
  }
}
// -------A função retorna a posição do usurario na lista de ususarios, caso não exista ele retorna -1