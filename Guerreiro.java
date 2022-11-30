public class Guerreiro extends Personagem implements IClasses {
  private double poder = 7.0;

    //Polimorfismo [5]
  public void apresentar() {
    this.vida = 20.0;
    System.out.println("Olá! Eu sou o guerreiro " + nome);
    System.out.println("Tenho " + vida + " pontos de vida!");
    System.out.println("Tenho " + poder + " de força!");
  }final 

  public double getDano() {
    return poder;
  }
  
  public void atacar() {
    System.out.println("Atacar!");
    Criatura.tirarVida(poder);
  }


public void curar() {
    System.out.println("Curar!");
    Pocao.usarPocao(5.0);
 }    
}
