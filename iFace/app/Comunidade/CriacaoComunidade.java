package app.Comunidade;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;
import app.Comunidade.Comunidade;

public class CriacaoComunidade extends Usuario_Existente {
    public Comunidade criacao(ArrayList<Usuario> usuarios) {
        Comunidade comunidade = new Comunidade();
        
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("criacao_comunidade");
        String login = scan.next();

        if (checar_existencia(login, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite o nome da sua comunidade que deseja criar: ");
            scan.nextLine();
            String nome = scan.nextLine();

            System.out.print("Digite a descrição da sua comunidade: ");
            String descricao = scan.nextLine();

            System.out.println("\nComunidade criada com sucesso!!");

            comunidade.setDescricao(descricao);
            comunidade.setDono(login);
            comunidade.setNome(nome);
        }
        return comunidade;
    }
}