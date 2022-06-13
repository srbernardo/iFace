package src;

public class Mensagem_Inicial {
  public void mensagem_inicial(String param) {
    if (param == "update") {
      System.out.println("\nEdição/criação de Perfil");
      System.out.print("Digite seu login para começar a edição/criação: ");

    } else if ( param == "adicao" ){
      System.out.println("\nPedido de amizade");
      System.out.print("Digite seu login: ");

    } else if ( param == "mensagem" ){
      System.out.println("\nEnvie uma menssagen!!");
      System.out.print("Digite seu login: ");

    } else if ( param == "criacao_comunidade" ){
      System.out.println("\nCrie sua comunidade no iFace!!");
        System.out.print("Digite seu login: ");

    } else if ( param == "membros" ){
      System.out.println("\nParticipe de uma comunidade do iFace!!");
        System.out.print("Digite seu login: ");

    } else if ( param == "recuperacao" ){
      System.out.println("\nRecuperção de informações!!");
        System.out.print("Digite seu login: ");

    } else if ( param == "delete" ){
      System.out.println("\nRemoção de conta");
      System.out.print("Digite o login da conta que deseja remover: ");

    } else if ( param == "feed" ){
      System.out.println("\nFeed de noticias do iFace!!");
        System.out.print("Digite seu login para publicar alguma noticia no Feed: ");
        
    } else if ( param == "aceitar" ){
      System.out.println("\nLista de pedidos de amizade");
        System.out.print("Digite seu login: ");
    }
  }

  public Mensagem_Inicial(String param) {
    mensagem_inicial(param);
  }
}
