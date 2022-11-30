public class Zumbi extends Criatura {
    public void apresentacao() {
        this.nome = "Zumbi";
        this.poder = 5.0;
        this.vida = 20.0;
        System.out.println(nome + " tem " + vida + " de vida e " + poder + " de poder, tome cuidado!");
      }
}
