package Recuperacao;

import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Usuario.Usuario;

public class Recuperacao {
    public void recuperacao(Usuario[] usuarios, Comunidade[] comunidades) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Recuperção de informações!!");
        System.out.println("------------digite seu login:");
        String param = scan.next();

        int count = 0;
        int quantMenss = 0;
        int quant_De_Comunidades = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {                
                System.out.println();
                System.out.println("Segue a baixo as informações do usuario " + param + ":");
                System.out.println("Nome: " + usuarios[i].getNome());
                System.out.println("Sobrenome: " + usuarios[i].getSobreNome());
                System.out.println("Idade: " + usuarios[i].getIdade());

                for(int j = 0; j < comunidades.length; j++) {
                    if(param.equals(comunidades[j].getDono())) {
                        quant_De_Comunidades++;
                    }                        
                }
                System.out.println("Quantidade de comunidades que você é dono: " + quant_De_Comunidades);

                System.out.println("Quantidade de amigos: " + usuarios[i].amigos);

                for(int j = 0; j < usuarios[i].menssagens.length; j++) {
                    if(usuarios[i].menssagens[j] != null) {
                        quantMenss++;
                    }
                }
                System.out.println("Quantidade de mensagens: " + quantMenss);
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
