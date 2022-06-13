package app.Delete;

import java.util.ArrayList;
import java.util.Scanner;

import app.Usuario.Usuario;
import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;

public class Delete extends Usuario_Existente {
    public ArrayList<Usuario> delete(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("delete");
        String login = scan.next();

        if (checar_existencia(login, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            usuarios.remove(checar_existencia(login, usuarios));
            System.out.println("\nUsuario removido com sucesso!");
        }
        return usuarios;
    }
}