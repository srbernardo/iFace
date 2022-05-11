package Interfaces.Check_Usuario;

import java.util.ArrayList;

import Usuario.Usuario;

public interface Check_Usuario {
  int check_u(String login, ArrayList<Usuario> usuarios);
}