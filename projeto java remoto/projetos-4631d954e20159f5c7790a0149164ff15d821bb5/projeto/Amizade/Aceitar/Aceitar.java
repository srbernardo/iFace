package Amizade.Aceitar;

import java.util.Scanner;
import Usuario.Usuario;

public class Aceitar {
    public void aceitar(Usuario[] usuarios) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Lista de pedidos de amizade");
        System.out.println("------------digite seu login:");
        String param = scan.next();        

        int count = 0;
        int pedidosAmizade = 0;

        for(int i = 0; i < usuarios.length; i++) {
            if(param.equals(usuarios[i].getLogin())) {                
                for(int j = 0; j < usuarios[i].pedidos.length; j++) {
                    if(usuarios[i].pedidos[j] != null) {
                        pedidosAmizade++;
                    }
                }
                break;
            } else {
                count++;
            }
        }        
        if(count == 1000) {
            System.out.println("usuario não encontrado!!");
        }
        if(pedidosAmizade != 0) {
            System.out.println("Voce tem " + pedidosAmizade + " pedidos de amizade!!");
            System.out.println("Digete '1' para aceitar ou '0' para recusar");
            int resp = scan.nextInt(); 
            
            if(resp == 1) {
                for(int i = 0; i < usuarios.length; i++) {
                    if(param.equals(usuarios[i].getLogin())) {                
                        for(int j = 0; j < usuarios[i].pedidos.length; j++) {
                            if(usuarios[i].pedidos[j] != null){
                                System.out.println( usuarios[i].pedidos[j] + " agora é seu amigo");
                                usuarios[i].amigos++;
                            }
                        }
                        break;                    
                    }       
                }
            } else {
                for(int i = 0; i < usuarios.length; i++) {
                    if(param.equals(usuarios[i].getLogin())) {                
                        for(int j = 0; j < usuarios[i].pedidos.length; j++) {
                            if(usuarios[i].pedidos[j] != null){
                                usuarios[i].pedidos[j] = null;
                            }
                        }
                        break;                    
                    }       
                }
                System.out.println("Voce tem '0' pedidos de amizade");
            }
        } else {
            System.out.println("Voce tem '0' pedidos de amizade");
        }
    }       
}
