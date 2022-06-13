package app.Feed;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;

public class Feed extends Usuario_Existente{
    public ArrayList<String> feed( ArrayList<Usuario> usuarios, ArrayList<String> feed) {
        Scanner scan = new Scanner(System.in);        
        Mensagem_Inicial mens = new Mensagem_Inicial("feed");
        String login = scan.next();
        
        if (checar_existencia(login, usuarios) == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.print("Digite sua noticia: ");
            scan.nextLine();
            String noticia = scan.nextLine();
            feed.add(noticia);
        }
        return feed;
    }
}
