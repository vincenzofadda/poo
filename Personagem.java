import javafx.util.converter.DoubleStringConverter;

public class Personagem {
    private Number id;
    protected String nome;
    protected double poder;
    public static double vida;
    static Number mortesPersonagem;
  
    protected Espada[] espadas;
    protected Pocao[] pocoes;
    protected Criatura[] criaturasMortas;
  
    public void apresentar() {
      System.out.println("Olá, meu nome é " + nome);
    }
  
    public void atacar() {
    }
  
    public void curar() {
    }

    public static void tirarVidaHeroi(double vida) {
        Personagem.vida -= vida;
      }

    public double getDano() {
        return poder;
    }

    static void morrer() {
      System.out.println("Você morreu pela " + mortesPersonagem + "... " + "Deseja tentar novamente?");
    }
}
