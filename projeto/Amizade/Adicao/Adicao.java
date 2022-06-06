package Amizade.Adicao;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Usuario_Existente;
import Usuario.Usuario;

public class Adicao extends Usuario_Existente {
    public void adicao(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPedido de amizade");
        System.out.print("Digite seu login: ");
        String login_pedindo_amizade = scan.next();

        if (checar_existencia(login_pedindo_amizade, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite o login da pessoa que vc quer como amigo: ");
            String login_recebendo_pedido = scan.next();

            int result = checar_existencia(login_recebendo_pedido, usuarios);

            if (result == -1) {
                System.out.println("\nUsuario não encontrado!!");
            } else {
                usuarios.get(result).pedidos.add(login_pedindo_amizade);
                System.out.println("\nPedido de amizade enviado com sucesso!!");
            }
        }
    }
}