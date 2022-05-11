package Comunidades.CriacaoComunidade;

import java.util.Scanner;

import Comunidades.Comunidade.Comunidade;
import Usuario.Usuario;

public class CriacaoComunidade {
    public Comunidade criacao(Usuario[] usuarios) {
        Comunidade comunidade = new Comunidade();

        Scanner scan = new Scanner(System.in); 
        System.out.println("Crie sua comunidade no iFace!!");
        System.out.println("------------digite seu login:");
        String param = scan.next();

        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {                
                System.out.println("Digite o nome da sua comunidade:");
                String nome = scan.next();
                
                System.out.println("Digite a descrição da sua comunidade: ");
                String descricao = scan.next();

                comunidade.setDescricao(descricao);
                comunidade.setDono(param);
                comunidade.setNome(nome);

                break;
            } else {
                count++;
            }
            if(count == 1000) {
                System.out.println("Usuario não encontrado!!");
            }
        }    
        return comunidade;
    }
}
