package Amizade.Menssagens;

import java.util.Scanner;
import Usuario.Usuario;

public class Menssagen {
    public void menssagen(Usuario[] usuarios) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Envie uma menssagen!!");
        System.out.println("------------digite seu login:");
        String param1 = scan.next();
        System.out.println("------------digite o login da pessoa que vc quer mandar uma menssagen:");
        String param2 = scan.next();

        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param2.equals(usuarios[i].getLogin())) {                
                for (int j = 0; j < usuarios[i].menssagens.length; j++) {
                    if(usuarios[i].menssagens[j] == null){
                        System.out.println("------------digite a sua menssagen:");
                        String menss = scan.next();
                        usuarios[i].menssagens[j] = menss + " || " + param1;
                        System.out.println("Menssagen enviado com sucesso!!");
                        break;
                    }
                }
                break;                
            } else {
                count++;
            }
        }        
        if(count == 1000){
            System.out.println("usuario não encontrado!!");
        }
    }
}
