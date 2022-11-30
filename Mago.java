public class Mago extends Personagem implements IClasses {
    private double poder = 10.0;

    //Polimorfismo [5]
    public void apresentar() {
      this.vida = 15.0;
      System.out.println("Olá! Eu sou o mago " + nome);
      System.out.println("Tenho " + vida + " pontos de vida!");
      System.out.println("Tenho " + poder + " de magia!");
    }
  
    public void atacar() {
      System.out.println("Lançando Magia!");
      Criatura.tirarVida(poder);
    }

    public double getDano() {
        return poder;
      }
  
    public void curar() {
      System.out.println("Curar!");
      Pocao.usarPocao(5.0);
   }
}
