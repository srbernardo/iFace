package Creat;

import java.util.Scanner;
import Usuario.Usuario;

public class Creat {  
  public Usuario create() {
    Usuario usuario = new Usuario();
    Scanner scan = new Scanner(System.in);
  
    System.out.println("\nCrie sua conta");
    System.out.print("Digite um login: ");
    usuario.setLogin(scan.next());    
  
    System.out.print("Digite uma senha: ");
    usuario.setSenha(scan.nextInt());    
  
    System.out.print("Digite como voce quer ser chamado: ");
    usuario.setNome(scan.next());

    System.out.println("\nUsuario criado com sucesso!!");


    return usuario;
  }  
}