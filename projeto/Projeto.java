import Amizade.Aceitar.Aceitar;
import Amizade.Adicao.Adicao;
import Amizade.Menssagens.Menssagen;
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
        Comunidade[] comunidades = new Comunidade[1000];
        Usuario[] usuarios = new Usuario[1000];        
        String[] feedNoticias = new String[1000];
        
        Usuario objUsuario = new Usuario();
        for(int i = 0; i < usuarios.length; i++) {
            usuarios[i] = objUsuario;
        }
        
        Comunidade objComunidade = new Comunidade();
        for(int i = 0; i < comunidades.length; i++) {
            comunidades[i] = objComunidade;
        }
        
        Creat usuario = new Creat();
        usuarios[0] = usuario.create();
        usuarios[1] = usuario.create();
        
        Delete delete = new Delete();
        usuarios = delete.delete(usuarios);
        
        Update update = new Update();
        usuarios = update.update(usuarios);
        
        Adicao adicao = new Adicao();
        adicao.adicao(usuarios);
        
        Aceitar aceitar = new Aceitar();
        aceitar.aceitar(usuarios);
        
        Menssagen menssagen = new Menssagen();
        menssagen.menssagen(usuarios);        
        
        Feed feed = new Feed();
        feedNoticias = feed.feed(usuarios, feedNoticias);
        
        CriacaoComunidade comunidade = new CriacaoComunidade();
        comunidades[0] = comunidade.criacao(usuarios);
        
        Membros membros = new Membros();
        membros.membro(usuarios, comunidades);
        
        Recuperacao recuperacao = new Recuperacao();
        recuperacao.recuperacao(usuarios, comunidades);
    }
}