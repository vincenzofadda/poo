import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) throws InterruptedException {

    Menu menu = new Menu();
    menu.bemVindo();

    Scanner nomeInput = new Scanner(System.in);
    Scanner classeInput = new Scanner(System.in);
    System.out.println("Como você se chama?");
    String nomePersonagem = nomeInput.nextLine();
    menu.line();
    Thread.sleep(1000);

    System.out.println("Ok, " + nomePersonagem + ". Seja bem-vindo a essa jornada!");
    Thread.sleep(1000);

    String classePersonagem;
    
    do {
      menu.line();
      System.out.println("Por favor, escolha uma classe entre guerreiro e mago");
      classePersonagem = classeInput.nextLine();
    }
    while (!classePersonagem.equalsIgnoreCase("guerreiro") && !classePersonagem.equalsIgnoreCase("mago"));

    menu.line();
    System.out.println("Ok, " + classePersonagem.toLowerCase() + " " + nomePersonagem + ". Vamos começar!!");
    Thread.sleep(2000);

    Personagem p = null;
    
    if (classePersonagem.equalsIgnoreCase("guerreiro")) {
      p = new Guerreiro();
    } else if (classePersonagem.equalsIgnoreCase("mago")) {
      p = new Mago();
    }
    p.nome = nomePersonagem;
    menu.line();

    System.out.println("Mas antes, por favor " + classePersonagem.toLowerCase() + " " + nomePersonagem + ", se apresente");
    menu.line();
    Thread.sleep(2000);

    p.apresentar();
    menu.line();
    Thread.sleep(2000);

    Random numRandom = new Random();
    int numMonstro = numRandom.nextInt(2);

    Criatura m = null;
      
    System.out.println("");
    System.out.println("...Andando pelo campo atrás de algum monstro...");
    System.out.println("");
    menu.line();
    Thread.sleep(1000);
    System.out.println("                        .                      ");
    Thread.sleep(1000);
    System.out.println("                        .                      ");
    Thread.sleep(1000);
    System.out.println("                        .                      ");
    Thread.sleep(1000);

    if (numMonstro == 1) {
      System.out.println("Você encontrou um Esqueleto!");
      m = new Esqueleto();
    } else {
      System.out.println("Você encontrou um Zumbi!");
      m = new Zumbi();
    }
    m.apresentacao();
    menu.line();
    Thread.sleep(1000);

    // System.out.println("Que ação você quer tomar? Escolha entre atacar ou curar");
    Scanner escolha = new Scanner(System.in);

    System.out.println(m.vida);
    p.atacar();
    System.out.println(m.vida);
    Thread.sleep(1000);

    System.out.println("personagem " + p.vida);
    p.curar();
    System.out.println("personagem " + p.vida);





    // do {

    // System.out.println("Que ação você quer tomar? Escolha entre atacar ou curar");
    // Scanner escolha = new Scanner(System.in);
    // if (escolha.equalsIgnoreCase("atacar"))
      
    // }
    // while (p.vida > 0 && m.vida > 0);
    
    
  }
}