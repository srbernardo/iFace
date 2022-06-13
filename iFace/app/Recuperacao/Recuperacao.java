package app.Recuperacao;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;
import app.Comunidade.Comunidade;

public class Recuperacao extends Usuario_Existente {
    public void recuperacao(ArrayList<Usuario> usuarios, ArrayList<Comunidade> comunidades) {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("recuperacao");        
        String login = scan.next();

        int usuario_existente = checar_existencia(login, usuarios);
        int quant_De_Comunidades = 0;

        if (usuario_existente == -1) {
            System.out.println("Usuario não encontrado!!");
        } else {
            System.out.println("\nSegue a baixo as informações do usuario >>" + login + "<<\n");
            System.out.println("Nome: " + usuarios.get(usuario_existente).getNome());
            System.out.println("Sobrenome: " + usuarios.get(usuario_existente).getSobreNome());
            System.out.println("Idade: " + usuarios.get(usuario_existente).getIdade());

            for (int j = 0; j < comunidades.size(); j++) {
                if (login.equals(comunidades.get(j).getDono())) {
                    quant_De_Comunidades++;
                }
            }
            System.out.println("Quantidade de comunidades que você é dono: " + quant_De_Comunidades);
            System.out.println("Quantidade de amigos: " + usuarios.get(usuario_existente).getAmigos());
            System.out.println("Quantidade de mensagens: " + usuarios.get(usuario_existente).mensagens.size());
        }
    }
}
