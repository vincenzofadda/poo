public class Esqueleto extends Criatura{
    public void apresentacao() {
        this.nome = "Esqueleto";
        this.poder = 4.0;
        this.vida = 15.0;
        System.out.println(nome + " tem " + vida + " de vida e " + poder + " de poder, tome cuidado!");
      }
}
