package Delete;

import Usuario.Usuario;
import java.util.Scanner;

public class Delete {
    public Usuario[] delete(Usuario[] usuarios) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Remoção de conta");
        System.out.println("------------digite seu login para remover sua conta:");
        String param = scan.next();
        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {
                String[] novosPedidos = new String[1000];
                String[] novasMenssagens = new String[1000];

                usuarios[i].setNome(null);
                usuarios[i].setSobreNome(null);    
                usuarios[i].setLogin(null);
                usuarios[i].setSenha(0);
                usuarios[i].setIdade(0);
                usuarios[i].amigos = 0;

                usuarios[i].pedidos = novosPedidos;
                usuarios[i].menssagens = novasMenssagens;

                System.out.println("usuario deletado!!");
                break;
            } else {
                count++;
            }
        }
        
        if(count == 1000){
            System.out.println("usuario não encontrado!!");
        }
        return usuarios;
    }
}