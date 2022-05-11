package Feed;

import java.util.ArrayList;
import java.util.Scanner;

import Usuario.Usuario; 
import Delete.Check_U;

public class Feed extends Check_U{
    public ArrayList<String> feed( ArrayList<Usuario> usuarios, ArrayList<String> feed) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nFeed de noticias do iFace!!");
        System.out.print("Digite seu login para publicar alguma noticia no Feed: ");
        String login = scan.next();
        
        int result = check_u(login, usuarios);

        if (result == 0) {
            System.out.println("Usuario não encontrado!!");
        } else {
            System.out.print("Digite sua noticia: ");
            scan.nextLine();
            String noticia = scan.nextLine();
            feed.add(noticia);
        }
        return feed;
    }
}