package Update;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Check_U;
import Usuario.Usuario;

public class Update extends Check_U {
    public ArrayList<Usuario> update(ArrayList<Usuario> usuarios) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEdição/criação de Perfil");
        System.out.print("Digite seu login para começar a edição/criação: ");
        String login = scan.next();

        int result = check_u(login, usuarios);

        if (result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                if (login.equals(usuarios.get(i).getLogin())) {
                    System.out.println("\nVoce quer editar seu login ?");
                    System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
                    int respLogin = scan.nextInt();
    
                    if (respLogin == 1) {
                        System.out.print("Digite seu novo login: ");
                        usuarios.get(i).setLogin(scan.next());
                    }
    
                    System.out.println("\nVoce quer editar sua Senha ?");
                    System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
                    int respSenha = scan.nextInt();
    
                    if (respSenha == 1) {
                        System.out.print("Digite sua nova Senha:");
                        usuarios.get(i).setSenha(scan.nextInt());
                    }
    
                    System.out.println("\nVoce quer editar seu Nome ?");
                    System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
                    int respNome = scan.nextInt();
    
                    if (respNome == 1) {
                        System.out.print("Digite seu novo Nome: ");
                        usuarios.get(i).setNome(scan.next());
                    }
    
                    System.out.println("\nVoce quer editar seu Sobrenome ?");
                    System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
                    int respSobre = scan.nextInt();
    
                    if (respSobre == 1) {
                        System.out.print("Digite seu novo Sobrenome: ");
                        usuarios.get(i).setSobreNome(scan.next());
                    }
    
                    System.out.println("\nVoce quer editar sua Idade ?");
                    System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
                    int respIdade = scan.nextInt();
    
                    if (respIdade == 1) {
                        System.out.print("Digite seu nova Idade: ");
                        usuarios.get(i).setIdade(scan.nextInt());
                    }
    
                    System.out.println("\nUsuario Editado com sucesso!!");
                    break;
                } 
            }
        }
        return usuarios;
    }
}