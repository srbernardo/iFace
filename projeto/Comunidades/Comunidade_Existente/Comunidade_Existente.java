package Comunidades.Comunidade_Existente;

import java.util.ArrayList;

import Comunidades.Comunidade.Comunidade;
import Interfaces.Checar_Existencia.Checar_Existencia;

public class Comunidade_Existente implements Checar_Existencia {

  @Override
  public <E> int checar_existencia(String nome, ArrayList<E> comunidades)  {
    int count = 0;
    int result = 0;

    for (int i = 0; i < comunidades.size(); i++) {
      if (nome.equals(((Comunidade) comunidades.get(i)).getNome())) {
        result = i;
        break;
      } else {
        count++;
      }
    }
    if (count == comunidades.size()) {
      result = -1;
    }
    return result;
  }  
}
// -------A função retorna a posição da comunidade na lista de comunidades , caso não exista ela retorna -1

