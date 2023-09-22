package src.aparelho;

import src.interfaces.AparelhoTelefonico;
import src.interfaces.Navegador;
import src.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

  @Override
  public void tocar() {
    System.out.println("Tocando musica");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando musica");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando musica");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando para contato");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo contato");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo pagina");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando Pagina");
  }
}
