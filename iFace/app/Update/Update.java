package app.Update;

import java.util.ArrayList;
import java.util.Scanner;

import src.Mensagem_Inicial;
import src.Implements.Usuario_Existente;
import app.Usuario.Usuario;

public class Update extends Usuario_Existente {
    public ArrayList<Usuario> update(ArrayList<Usuario> usuarios) throws Exception {
        Scanner scan = new Scanner(System.in);        
        Mensagem_Inicial mens = new Mensagem_Inicial("update");        
        String login = scan.next();
        
        int usuario_existente = checar_existencia(login, usuarios);

        if (usuario_existente == -1) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            System.out.println("\nVoce quer editar seu login ?");
            sim_ou_nao();
            int respLogin = scan.nextInt();

            if (respLogin == 1) {
                System.out.print("Digite seu novo Login:");
                usuarios.get(usuario_existente).setLogin(scan.next());
            }

            System.out.println("\nVoce quer editar sua Senha ?");
            sim_ou_nao();
            int respSenha = scan.nextInt();

            if (respSenha == 1) {
                System.out.print("Digite sua nova Senha:");
                usuarios.get(usuario_existente).setSenha(scan.nextInt());
            }

            System.out.println("\nVoce quer editar seu Nome ?");
            sim_ou_nao();
            int respNome = scan.nextInt();

            if (respNome == 1) {
                System.out.print("Digite seu novo Nome: ");
                usuarios.get(usuario_existente).setNome(scan.next());
            }

            System.out.println("\nVoce quer editar seu Sobrenome ?");
            sim_ou_nao();
            int respSobre = scan.nextInt();

            if (respSobre == 1) {
                System.out.print("Digite seu novo Sobrenome: ");
                usuarios.get(usuario_existente).setSobreNome(scan.next());
            }

            System.out.println("\nVoce quer editar sua Idade ?");
            sim_ou_nao();
            int respIdade = scan.nextInt();

            if (respIdade == 1) {
                System.out.print("Digite seu nova Idade: ");
                usuarios.get(usuario_existente).setIdade(scan.nextInt());
            }
            System.out.println("\nUsuario Editado com sucesso!!");
        }
        return usuarios;
    }

    private void sim_ou_nao() {
        System.out.print("Digite '1' para 'SIM' ou '0' para 'NÃO': ");
    }
}
