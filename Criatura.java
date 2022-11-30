public class Criatura {
  public String nome;
  protected double poder;
  public static double vida;

  private Personagem personagemAssassino;
  private Personagem personagemAssassinado;

  public void apresentacao() {
    }

  public void setVida() {
    this.vida = vida;
  }

  public static void tirarVida(double vida) {
    Criatura.vida -= vida;
  }
  
  public void vida() {
    System.out.println("vida" + vida);
  }
}
