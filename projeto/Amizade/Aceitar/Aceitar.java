package Amizade.Aceitar;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Usuario_Existente;
import Usuario.Usuario;

public class Aceitar extends Usuario_Existente {
    public void aceitar(ArrayList<Usuario> usuarios) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLista de pedidos de amizade");
        System.out.print("Digite seu login: ");
        String login = scan.next();

        int pedidosAmizade = 0;
        int usuario_existente = checar_existencia(login, usuarios);

        if (usuario_existente == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            pedidosAmizade = usuarios.get(usuario_existente).pedidos.size();

            if (pedidosAmizade == 0) {
                System.out.println("Voce tem '0' pedidos de amizade");
            } else {
                System.out.println("\nVoce tem " + pedidosAmizade + " pedidos de amizade!!");
                System.out.print("Digete '1' para aceitar ou '0' para recusar: ");
                int resp = scan.nextInt();

                if (resp == 0) {
                    usuarios.get(usuario_existente).pedidos.clear();
                    System.out.println("Agora você tem '0' pedidos de amizade");                    
                } else {
                    System.out.println("\n" + "Agora você tem " + pedidosAmizade + " novos amigos");
                    usuarios.get(usuario_existente).setAmigos(pedidosAmizade);

                    for (int i = 0; i < pedidosAmizade ; i++) {
                        for (int j = 0; j < usuarios.size() ;j++) {
                            if (usuarios.get(usuario_existente).pedidos.get(i).equals(usuarios.get(j).getLogin())) {
                                usuarios.get(j).setAmigos(1);
                            }
                        }
                    }
                }
            }
        }
    }
}