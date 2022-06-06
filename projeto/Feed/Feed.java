package Feed;

import java.util.ArrayList;
import java.util.Scanner;

import Usuario.Usuario; 
import Delete.Usuario_Existente;

public class Feed extends Usuario_Existente{
    public ArrayList<String> feed( ArrayList<Usuario> usuarios, ArrayList<String> feed) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nFeed de noticias do iFace!!");
        System.out.print("Digite seu login para publicar alguma noticia no Feed: ");
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
