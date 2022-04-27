package Amizade.Adicao;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Check_U;
import Usuario.Usuario;

public class Adicao extends Check_U {
    public void adicao(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPedido de amizade");
        System.out.print("Digite seu login: ");
        String login1 = scan.next();

        System.out.print("Digite o login da pessoa que vc quer como amigo: ");
        String login2 = scan.next();

        int result = check_u(login1, usuarios);
        int resul = check_u(login2, usuarios);

        if (result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            if (resul == 0) {
                System.out.println("\nUsuario não encontrado!!");
            } else {
                for (int i = 0; i < usuarios.size(); i++) {
                    if (login2.equals(usuarios.get(i).getLogin())) {
                        usuarios.get(i).pedidos.add(login1);
                        System.out.println("\nPedido de amizade enviado com sucesso!!");
                        break;
                    }
                }
            }
        }
    }
}
