import java.util.ArrayList;
import java.util.Scanner;

import app.Creat.Creat;
import app.Delete.Delete;
import app.Feed.Feed;
import app.Recuperacao.Recuperacao;
import app.Update.Update;
import app.Usuario.Usuario;
import app.Amizade.Aceitar;
import app.Amizade.Adicao;
import app.Amizade.Mensagem;
import app.Comunidade.Comunidade;
import app.Comunidade.CriacaoComunidade;
import app.Comunidade.Membros;

public class Projeto {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<String> feedNoticias = new ArrayList<String>();
        ArrayList<Comunidade> comunidades = new ArrayList<Comunidade>();
        int i = 11;

        System.out.println("iFace");

        while (i != 0) {
            Scanner scan = new Scanner(System.in);
            boolean erro = false;

            do {
                erro = false;
                try {
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("0 para sair do iFace");
                    System.out.println("1 para criar uma conta");
                    System.out.println("2 para criar/editar um perfil ");
                    System.out.println("3 para adicionar um amigo ");
                    System.out.println("4 para enviar uma mensagem ");
                    System.out.println("5 para criar uma comunidade ");
                    System.out.println("6 para se tornar membro de uma comunidade ");
                    System.out.println("7 para recuperar informaçẽs de uma conta ");
                    System.out.println("8 para remover uma conta ");
                    System.out.println("9 para enviar uma mensagem no feed ");
                    System.out.println("10 para ver pedidos de amizade");
                    i = scan.nextInt();
                } catch (Exception e) {
                    erro = erro_na_digitacao(scan);
                }
            } while (erro);

            switch (i) {

                case 0:
                    System.out.println("\nValeu falou!\n");
                    break;

                case 1:
                    do {
                        erro = false;
                        try {
                            Creat usuario = new Creat();
                            usuarios.add(usuario.create());
                        } catch (Exception e) {
                            erro = erro_na_digitacao(scan);
                        }
                    } while (erro);
                    break;

                case 2:
                    do {
                        erro = false;
                        try {
                            Update update = new Update();
                            usuarios = update.update(usuarios);
                        } catch (Exception e) {
                            erro = erro_na_digitacao(scan);
                        }
                    } while (erro);
                    break;

                case 3:
                    Adicao adicao = new Adicao();
                    adicao.adicao(usuarios);
                    break;

                case 4:
                    Mensagem mensagem = new Mensagem();
                    mensagem.mensagem(usuarios);
                    break;

                case 5:
                    CriacaoComunidade comunidade = new CriacaoComunidade();
                    comunidades.add(comunidade.criacao(usuarios));
                    break;

                case 6:
                    Membros membros = new Membros();
                    membros.membro(usuarios, comunidades);
                    break;

                case 7:
                    Recuperacao recuperacao = new Recuperacao();
                    recuperacao.recuperacao(usuarios, comunidades);
                    break;

                case 8:
                    Delete delete = new Delete();
                    usuarios = delete.delete(usuarios);
                    break;

                case 9:
                    Feed feed = new Feed();
                    feedNoticias = feed.feed(usuarios, feedNoticias);
                    break;

                case 10:
                    do {
                        erro = false;
                        try {
                            Aceitar aceitar = new Aceitar();
                            aceitar.aceitar(usuarios);
                        } catch (Exception e) {
                            erro = erro_na_digitacao(scan);
                        }
                    } while (erro);
                    break;

                default:
            }
        }
    }

    private static boolean erro_na_digitacao(Scanner scan) {
        boolean erro;
        System.out.println("\nERRO!: Digite um inteiro apenas !!");
        System.out.println("Tente novamente !!\n");
        erro = true;
        scan.nextLine();
        return erro;
    }
}
