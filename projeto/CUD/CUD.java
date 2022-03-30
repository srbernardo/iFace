package CUD;

import Creat.Creat;
import Edit.Edit;

import java.util.Scanner;

public class CUD {
    Creat[] arr = new Creat[1000];

    public void criando() {
        Creat usuario1 = new Creat();
        usuario1.create();

        Creat usuario2 = new Creat();
        usuario2.create();

        this.arr[0] = usuario1;
        this.arr[1] = usuario2;
    }

    public void removendo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Remoção de conta");
        System.out.println("digite seu login:");
        String param = scan.next();

        for (int i = 0; i < this.arr.length; i++) {
            if (param == this.arr[i].login) {
                this.arr[i] = null;
                System.out.println("usuario deletado!!");
            } else {
                System.out.println("usuario nao encontrado!!");
            }
        }
    }
    
}