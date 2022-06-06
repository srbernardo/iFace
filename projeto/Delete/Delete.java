package Delete;

import Usuario.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
    public ArrayList<Usuario> delete(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nRemoção de conta");
        System.out.print("Digite o login da conta que deseja remover: ");
        String login = scan.next();

        Usuario_Existente check_usuario_existente = new Usuario_Existente();

        if (check_usuario_existente.checar_existencia(login, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            usuarios.remove(check_usuario_existente.checar_existencia(login, usuarios));
            System.out.println("\nUsuario removido com sucesso!");
        }
        return usuarios;
    }
}