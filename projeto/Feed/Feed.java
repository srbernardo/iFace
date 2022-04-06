package Feed;

import Usuario.Usuario;
import java.util.Scanner;

public class Feed {
    public String[] feed(Usuario[] usuarios, String[] feed) {
        String noticia = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Feed de noticias do iFace!!");
        System.out.println("------------digite seu login para publicar alguma noticia no Feed:");
        String param = scan.next();

        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {
                System.out.println("---------------Digite sua noticia:");
                noticia = scan.next();

                for(int j = 0; j < feed.length; j++) {
                    if (feed[j] == null) {
                        feed[j] = noticia + "\n--------- Mensagen de " + param;
                        break;
                    }
                }
                break;
            } else {
                count++;
            }
        }
        if (count == 1000) {
            System.out.println("usuario não encontrado!!");
        }
        return feed;
    }
}
