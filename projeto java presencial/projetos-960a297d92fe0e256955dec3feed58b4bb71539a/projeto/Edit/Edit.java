package Edit;

import java.util.Scanner;

public class Edit {
  public String nome;
  public String sobrenome ;
  public int idade;
  
  public void edite() {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Crie/Edite seu perfil");
    System.out.print("Digite seu nome: ");
    this.nome = scan.next();  
  
    System.out.println("Digite seu sobrenome");
    this.sobrenome = scan.next();
  
    System.out.print("Digite sua idade: ");
    this.idade = scan.nextInt();
  } 
}
