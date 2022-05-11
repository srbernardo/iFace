package Delete;

import Usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {    
    public ArrayList<Usuario> delete(ArrayList<Usuario> usuarios) {  
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("\nRemoção de conta");
        System.out.println("Digite o login da conta que deseja remover: ");
        String param = scan.next();

        Check_U check = new Check_U();
        int result = check.check_u(param, usuarios);

        if(result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            for(int i = 0; i < usuarios.size(); i++) {
                if(param.equals(usuarios.get(i).getLogin())) {
                    usuarios.remove(i);
                    System.out.println("\nUsuario removido!!");
                    break;
                }
            }
        }         
        return usuarios;
    }
}