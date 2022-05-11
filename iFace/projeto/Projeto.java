import java.util.ArrayList;

import Amizade.Aceitar.Aceitar;
import Amizade.Adicao.Adicao;
import Amizade.Mensagens.Mensagen;
import Comunidades.Comunidade.Comunidade;
import Comunidades.CriacaoComunidade.CriacaoComunidade;
import Comunidades.Membros.Membros;
import Creat.Creat;
import Delete.Delete;
import Feed.Feed;
import Recuperacao.Recuperacao;
import Update.Update;
import Usuario.Usuario;

public class Projeto {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        ArrayList<String> feedNoticias = new ArrayList<String>();
        ArrayList<Comunidade> comunidades = new ArrayList<Comunidade>();

        Creat usuario = new Creat();
        usuarios.add(usuario.create());
        usuarios.add(usuario.create());

        Delete delete = new Delete();
        usuarios = delete.delete(usuarios);

        Update update = new Update();
        usuarios = update.update(usuarios);

        Adicao adicao = new Adicao();
        adicao.adicao(usuarios);

        Aceitar aceitar = new Aceitar();
        aceitar.aceitar(usuarios);

        Mensagen mensagen = new Mensagen();
        mensagen.mensagen(usuarios);

        Feed feed = new Feed();
        feedNoticias = feed.feed(usuarios, feedNoticias);

        CriacaoComunidade comunidade = new CriacaoComunidade();
        comunidades.add(comunidade.criacao(usuarios));

        Membros membros = new Membros();
        membros.membro(usuarios, comunidades);

        Recuperacao recuperacao = new Recuperacao();
        recuperacao.recuperacao(usuarios, comunidades);
    }
}