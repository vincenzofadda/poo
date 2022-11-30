public class Mago extends Personagem implements IClasses {
    private double energiaMagica = 10.0;

    //Polimorfismo [5]
    public void apresentar() {
      this.vida = 15.0;
      System.out.println("Olá! Eu sou o mago " + nome);
      System.out.println("Tenho " + vida + " pontos de vida!");
      System.out.println("Tenho " + energiaMagica + " de magia!");
    }
  
    public void atacar() {
      System.out.println("Lançando Magia!");
      Criatura.tirarVida(energiaMagica);
    }
  
    public void curar() {
      System.out.println("Curar!");
      Pocao.usarPocao(5.0);
   }
}
