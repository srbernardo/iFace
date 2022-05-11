package Recuperacao;

import java.util.ArrayList;
import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Delete.Check_U;
import Usuario.Usuario;

public class Recuperacao extends Check_U {
    public void recuperacao(ArrayList<Usuario> usuarios, ArrayList<Comunidade> comunidades) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nRecuperção de informações!!");
        System.out.print("Digite seu login: ");
        String login = scan.next();

        int reuslt = check_u(login, usuarios);
        int quant_De_Comunidades = 0;

        if (reuslt == 0) {
            System.out.println("Usuario não encontrado!!");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (login.equals(usuarios.get(i).getLogin())) {
                    System.out.println("\nSegue a baixo as informações do usuario >>" + login + "<<\n");
                    System.out.println("Nome: " + usuarios.get(i).getNome());
                    System.out.println("Sobrenome: " + usuarios.get(i).getSobreNome());
                    System.out.println("Idade: " + usuarios.get(i).getIdade());

                    for (int j = 0; j < comunidades.size(); j++) {
                        if (login.equals(comunidades.get(j).getDono())) {
                            quant_De_Comunidades++;
                        }
                    }

                    System.out.println("Quantidade de comunidades que você é dono: " + quant_De_Comunidades);
                    System.out.println("Quantidade de amigos: " + usuarios.get(i).getAmigos());
                    System.out.println("Quantidade de mensagens: " + usuarios.get(i).mensagens.size());
                    break;
                }
            }
        }
    }
}