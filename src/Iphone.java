import java.util.Scanner;

import apps.Musica;
import apps.Navegador;
import apps.Telefone;

public class Iphone {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("=================I-PHONE LIGADO=================");
        System.out.println("O que vc vai utilizar");
        System.out.println("Múisica   - M");
        System.out.println("Navegador - N");
        System.out.println("Telefone  - T");

        Musica mu = new Musica();
        int opcoes  = 0;
        int escolha = 1;
        String app  = "";
        app = scan.next().toUpperCase();
        System.out.println("Agora esolha o que fazer 1, 2 ou 3");
        escolha = scan.nextInt();

        if(escolha == 1 && app.equals("M")){
            mu.tocar();}
        else if(escolha == 2 && app.equals("M")){
            mu.pausar();}
        else if(escolha == 3 && app.equals("M")){
            mu.pausar();}

        Navegador nave = new Navegador();
        if(escolha== 1 && app.equals("N")){
            nave.exibirPagina();}
        else if(escolha == 2 && app.equals("N")){
            nave.adicionarAba();}
        else if(escolha == 3 && app.equals("N")){
            nave.atualizarPagina();}
    

            Telefone tel = new Telefone();
        if(escolha== 1 && app.equals("T")){
            tel.ligar();}
        else if(escolha == 2 && app.equals("T")){
            tel.atender();}
        else if(escolha == 3 && app.equals("T")){
            tel.iniciarCorreioVoz();}
    
    }

}
