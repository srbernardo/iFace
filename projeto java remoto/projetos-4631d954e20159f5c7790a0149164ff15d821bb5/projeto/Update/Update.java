package Update;
import java.util.Scanner;

import Usuario.Usuario;

public class Update {
    public Usuario[] update(Usuario[] usuarios){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Edição de conta");
        System.out.println("------------digite seu login para começar a edição:");
        String param = scan.next();

        int count = 0;

        for (int i = 0; i < usuarios.length; i++) {
            if (param.equals(usuarios[i].getLogin())) {
                System.out.println("Voce quer editar seu login ?");
                System.out.println("Digite '1' para 'SIM' ou '0' para 'NÃO':");
                int respLogin = scan.nextInt();

                if(respLogin == 1){
                    System.out.println("Digite seu novo login:");
                    usuarios[i].setLogin(scan.next()) ;
                }

                System.out.println("Voce quer editar sua Senha ?");
                System.out.println("Digite '1' para 'SIM' ou '0' para 'NÃO':");
                int respSenha = scan.nextInt();

                if(respSenha == 1){
                    System.out.println("Digite sua nova Senha:");
                    usuarios[i].setSenha(scan.nextInt()) ;
                }

                System.out.println("Voce quer editar seu Nome ?");
                System.out.println("Digite '1' para 'SIM' ou '0' para 'NÃO':");
                int respNome = scan.nextInt();

                if(respNome == 1){
                    System.out.println("Digite seu novo Nome:");
                    usuarios[i].setNome(scan.next()) ;
                }

                System.out.println("Voce quer editar seu Sobrenome ?");
                System.out.println("Digite '1' para 'SIM' ou '0' para 'NÃO':");
                int respSobre = scan.nextInt();

                if(respSobre == 1){
                    System.out.println("Digite seu novo Sobrenome:");
                    usuarios[i].setSobreNome(scan.next()) ;
                }

                System.out.println("Voce quer editar sua Idade ?");
                System.out.println("Digite '1' para 'SIM' ou '0' para 'NÃO':");
                int respIdade = scan.nextInt();

                if(respIdade == 1){
                    System.out.println("Digite seu nova Idade:");
                    usuarios[i].setIdade(scan.nextInt()) ;
                }


                System.out.println("usuario Editado com sucesso!!");
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
