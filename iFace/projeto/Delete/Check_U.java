package Delete;

import java.util.ArrayList;

import Interfaces.Check_Usuario.Check_Usuario;
import Usuario.Usuario;

public class Check_U implements Check_Usuario{
  
    @Override
    public int check_u(String login, ArrayList<Usuario> usuarios) {
      int count = 0;
      int result = 0;

      for (int i = 0; i < usuarios.size(); i++) {
        if (login.equals(usuarios.get(i).getLogin())) {
          result = 1;
          break;
        } else {
          count++;
        }
      }
      if (count == usuarios.size()) {
        result = 0;
      }
      return result;  
    }
}
