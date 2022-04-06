package Comunidades.Membros;

import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Usuario.Usuario;

public class Membros {
    public void membro(Usuario[] usuarios, Comunidade[] comunidade) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Participe de uma comunidade do iFace!!");
        System.out.println("------------digite seu login:");
        String param = scan.next();

        int count = 0;
        int cont = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {                
                System.out.println("Digite o nome da comunidade que você quer fazer parte: ");
                String nome = scan.next();

                for (int j = 0; j < comunidade.length; j++) {
                    if (nome.equals(comunidade[j].getNome())){
                        System.out.println("Agora você faz parta da comunidade --> " + nome);

                        for (int k = 0; k < comunidade[j].membros.length; k++) {
                            if ( comunidade[j].membros[k] == null){
                                comunidade[j].membros[k] = param;
                                break;
                            }
                        }
                        break;
                    } else {
                        cont++;
                    }
                    if(cont == 1000) {
                        System.out.println("Comunidade não encontrada!!");
                    } 
                }
                break;
            } else {
                count++;
            }
            if(count == 1000) {
                System.out.println("usuario não encontrado!!");
            }
        }    
    }
}
