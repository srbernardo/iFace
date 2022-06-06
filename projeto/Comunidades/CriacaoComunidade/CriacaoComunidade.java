package Comunidades.CriacaoComunidade;

import java.util.ArrayList;
import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Delete.Usuario_Existente;
import Usuario.Usuario;

public class CriacaoComunidade {
    public Comunidade criacao(ArrayList<Usuario> usuarios) {
        Comunidade comunidade = new Comunidade();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nCrie sua comunidade no iFace!!");
        System.out.print("Digite seu login: ");
        String login = scan.next();

        Usuario_Existente check_usuario_existente = new Usuario_Existente();

        if (check_usuario_existente.checar_existencia(login, usuarios) == -1) {
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