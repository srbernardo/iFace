package Comunidades.CriacaoComunidade;

import java.util.ArrayList;
import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Delete.Check_U;
import Usuario.Usuario;

public class CriacaoComunidade {
    public Comunidade criacao(ArrayList<Usuario> usuarios) {
        Comunidade comunidade = new Comunidade();
        Scanner scan = new Scanner(System.in);

        System.out.println("\nCrie sua comunidade no iFace!!");
        System.out.print("Digite seu login: ");
        String login = scan.next();


        Check_U check_u = new Check_U();
        int result = check_u.check_u(login, usuarios);

        if (result == 0) {
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