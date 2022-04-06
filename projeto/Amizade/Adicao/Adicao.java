package Amizade.Adicao;

import java.util.Scanner;
import Usuario.Usuario;

public class Adicao {
    public void adicao(Usuario[] usuarios) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Pedido de amizade");
        System.out.println("------------digite seu login:");
        String param1 = scan.next();
        System.out.println("------------digite o login da pessoa que vc quer como amigo:");
        String param2 = scan.next();

        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param2.equals(usuarios[i].getLogin())) {                
                for (int j = 0; j < usuarios[i].pedidos.length; j++) {
                    if(usuarios[i].pedidos[j] == null){
                        usuarios[i].pedidos[j] = param1;
                        System.out.println("Pedido de amizade enviado com sucesso!!");
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
