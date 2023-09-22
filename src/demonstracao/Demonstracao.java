package src.demonstracao;

import src.aparelho.Iphone;

public class Demonstracao {
  public static void main(String[] args) {

    Iphone iphone = new Iphone();

    //Aparelho Telefonico
    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();

    //Reprodutor Musical
    iphone.selecionarMusica();
    iphone.tocar();
    iphone.pausar();

    //Navegador de Internet
    iphone.exibirPagina();
    iphone.atualizarPagina();
    iphone.adicionarNovaAba();

  }
}
