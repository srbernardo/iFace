package app.Amizade;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;

public class Mensagem extends Usuario_Existente {
    public void mensagem(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);
        Mensagem_Inicial mens = new Mensagem_Inicial("mensagem");
        String login_enviado_mensagem = scan.next();

        if (checar_existencia(login_enviado_mensagem, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite o login da pessoa que vc quer mandar uma menssagen: ");
            String login_recebendo_mensagem = scan.next();

            int result = checar_existencia(login_recebendo_mensagem, usuarios);

            if (result == -1) {
                System.out.println("\nUsuario não encontrado!!");
            } else {                
                System.out.print("Digite a sua menssagen: ");
                scan.nextLine();
                String mensagem = scan.nextLine();

                String mensagem_final = mensagem + " || " + login_enviado_mensagem;
                usuarios.get(result).mensagens.add(mensagem_final);
                System.out.println("\nMenssagen enviado com sucesso!!");               
            }
        }       
    }
}
    