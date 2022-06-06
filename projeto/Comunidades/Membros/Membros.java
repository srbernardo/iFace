package Comunidades.Membros;

import java.util.ArrayList;
import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Comunidades.Comunidade_Existente.Comunidade_Existente;
import Delete.Usuario_Existente;
import Usuario.Usuario;

public class Membros {
    public void membro(ArrayList<Usuario> usuarios, ArrayList<Comunidade> comunidades) {
        System.out.println("\nParticipe de uma comunidade do iFace!!");
        System.out.print("Digite seu login: ");

        Scanner scan = new Scanner(System.in);
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
