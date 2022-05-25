package Amizade.Aceitar;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Check_U;
import Usuario.Usuario;

public class Aceitar extends Check_U {
    public void aceitar(ArrayList<Usuario> usuarios) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nLista de pedidos de amizade");
        System.out.print("Digite seu login: ");
        String login = scan.next();

        int pedidosAmizade = 0;
        int idUsuarios = 0;
        int result = check_u(login, usuarios);

        if (result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (login.equals(usuarios.get(i).getLogin())) {
                    pedidosAmizade = usuarios.get(i).pedidos.size();
                    idUsuarios = i;
                    break;
                }
            }
        }
        if (pedidosAmizade != 0) {
            System.out.println("\nVoce tem " + pedidosAmizade + " pedidos de amizade!!");
            System.out.print("Digete '1' para aceitar ou '0' para recusar: ");
            int resp = scan.nextInt();

            if (resp == 1) {
                for (int j = 0; j < usuarios.get(idUsuarios).pedidos.size(); j++) {
                    System.out.println("\n" + usuarios.get(idUsuarios).pedidos.get(j) + " agora é seu amigo");

                    for (int i = 0; i < usuarios.size(); i++) {
                        if( usuarios.get(idUsuarios).pedidos.get(j).equals(usuarios.get(i).getLogin()) ) {
                            usuarios.get(i).setAmigos();
                        }                        
                    }
                    usuarios.get(idUsuarios).setAmigos();
                }
            } else {
                usuarios.get(idUsuarios).pedidos.clear();
                System.out.println("Voce tem '0' pedidos de amizade");
            }
        } else {
            System.out.println("Voce tem '0' pedidos de amizade");
        }
    }
}