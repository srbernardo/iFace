package Comunidades.Membros;

import java.util.ArrayList;
import java.util.Scanner;

import Comunidades.Check_C.Check_C;
import Comunidades.Comunidade.Comunidade;
import Delete.Check_U;
import Usuario.Usuario;

public class Membros {
    public void membro(ArrayList<Usuario> usuarios, ArrayList<Comunidade> comunidades) {
        System.out.println("\nParticipe de uma comunidade do iFace!!");
        System.out.print("Digite seu login: ");

        Scanner scan = new Scanner(System.in);
        String login = scan.next();

        Check_U check_u = new Check_U();
        int result = check_u.check_u(login, usuarios);

        if (result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite o nome da comunidade que você quer fazer parte: ");
            scan.nextLine();
            String nome = scan.nextLine();

            Check_C check_c = new Check_C();
            int resul = check_c.check_c(nome, comunidades);

            if (resul == 0) {
                System.out.println("\nComunidade não encontrada!!");
            } else {
                for (int i = 0; i < comunidades.size(); i++) {
                    if (nome.equals(comunidades.get(i).getNome())) {
                        System.out.println("Agora você faz parta da comunidade --> " + nome);
                        comunidades.get(i).membros.add(login);
                        break;
                    }
                }
            }
        }
    }
}