package Creat;

import java.util.Scanner;

public class Creat {
  public String login;
  public int senha;
  public String name;
  
  public void create() {
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Crie sua conta");
    System.out.print("Digite um login: ");
    this.login = scan.next();  
  
    System.out.print("Digite uma senha: ");
    this.senha = scan.nextInt();   
  
    System.out.println("Como voce quer ser chamado?");
    this.name = scan.next();
  }  
}