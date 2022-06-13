package app.Amizade;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;

public class Aceitar extends Usuario_Existente {
    public void aceitar(ArrayList<Usuario> usuarios) throws Exception {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("aceitar");
        String login = scan.next();

        int quant_pedidos_amizade = 0;
        int usuario_existente = checar_existencia(login, usuarios);

        if (usuario_existente == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            quant_pedidos_amizade = usuarios.get(usuario_existente).pedidos_de_amizade.size();

            if (quant_pedidos_amizade == 0) {
                System.out.println("Voce tem '0' pedidos de amizade");
            } else {
                System.out.println("\nVoce tem " + quant_pedidos_amizade + " pedidos de amizade!!");
                System.out.print("Digete '1' para aceitar ou '0' para recusar: ");
                int resp = scan.nextInt();

                if (resp == 0) {
                    usuarios.get(usuario_existente).pedidos_de_amizade.clear();
                    System.out.println("Agora você tem '0' pedidos de amizade");                    
                } else {
                    System.out.println("\n" + "Agora você tem " + quant_pedidos_amizade + " novos amigos");
                    usuarios.get(usuario_existente).setAmigos(quant_pedidos_amizade);
                    adicona_amizade_na_conta_solicitante(usuarios, quant_pedidos_amizade, usuario_existente);
                }
            }
        }
    }

    private void adicona_amizade_na_conta_solicitante(ArrayList<Usuario> usuarios, int quant_pedidos_amizade, int usuario_existente) {
        for (int i = 0; i < quant_pedidos_amizade ; i++) {
            for (int j = 0; j < usuarios.size() ;j++) {                            
                String login_solicitante_da_amizade = usuarios.get(usuario_existente).pedidos_de_amizade.get(i);                            
                if (login_solicitante_da_amizade.equals(usuarios.get(j).getLogin())) {
                    usuarios.get(j).setAmigos(1);
                }
            }
        }
    }
}