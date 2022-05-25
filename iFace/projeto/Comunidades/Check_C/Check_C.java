package Comunidades.Check_C;

import java.util.ArrayList;

import Comunidades.Comunidade.Comunidade;
import Interfaces.Check_Comunidade.Check_Comunidade;

public class Check_C implements Check_Comunidade {

  @Override
  public int check_c(String nome, ArrayList<Comunidade> comunidades) {
    int count = 0;
    int result = 0;

    for(int i = 0; i < comunidades.size(); i++) {
        if (nome.equals(comunidades.get(i).getNome())) {
          result = 1;  
          break;
        } else {
            count++;
        }
    }    
    if(count == comunidades.size()) {
      result = 0;
    }
    return result;
  }  
}
