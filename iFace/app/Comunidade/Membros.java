package app.Comunidade;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Comunidade_Existente;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;

public class Membros {
    public void membro(ArrayList<Usuario> usuarios, ArrayList<Comunidade> comunidades) {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("membros");
        String login = scan.next();

        Usuario_Existente check_usuario_existente = new Usuario_Existente();

        if (check_usuario_existente.checar_existencia(login, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite o nome da comunidade que você quer fazer parte: ");
            scan.nextLine();
            String nome = scan.nextLine();

            Comunidade_Existente check_comunidade_existente = new Comunidade_Existente();
            int result = check_comunidade_existente.checar_existencia(nome, comunidades);

            if (result == -1) {
                System.out.println("\nComunidade não existe!!");
            } else {
                System.out.println("Agora você faz parta da comunidade --> " + nome);
                comunidades.get(result).membros.add(login);
            }
        }
    }
}
