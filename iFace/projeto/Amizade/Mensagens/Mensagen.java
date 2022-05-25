package Amizade.Mensagens;

import java.util.ArrayList;
import java.util.Scanner;

import Delete.Check_U;
import Usuario.Usuario;

public class Mensagen extends Check_U {
    public void mensagen(ArrayList<Usuario> usuarios) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnvie uma menssagen!!");
        System.out.print("Digite seu login: ");
        String login1 = scan.next();

        System.out.print("Digite o login da pessoa que vc quer mandar uma menssagen: ");
        String login2 = scan.next();

        int result = check_u(login1, usuarios);
        int resul = check_u(login2, usuarios);

        if (result == 0) {
            System.out.println("\nUsuario não encontrado!!");
        } else {
            if (resul == 0) {
                System.out.println("\nUsuario não encontrado!!");
            } else {
                for (int i = 0; i < usuarios.size(); i++) {
                    if (login2.equals(usuarios.get(i).getLogin())) {
                        System.out.print("Digite a sua menssagen: ");
                        scan.nextLine();
                        String mens = scan.nextLine();
                        
                        String mes = mens + " || " + login1;
                        usuarios.get(i).mensagens.add(mes);
                        System.out.println("\nMenssagen enviado com sucesso!!");
                        break;
                    }
                }
            }
        }
    }
}