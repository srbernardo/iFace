package app.Amizade;

import java.util.ArrayList;
import java.util.Scanner;

import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;
import src.Mensagem_Inicial;

public class Adicao extends Usuario_Existente {
    public void adicao(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("adicao");
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
                usuarios.get(result).pedidos_de_amizade.add(login_pedindo_amizade);
                System.out.println("\nPedido de amizade enviado com sucesso!!");
            }
        }
    }
}