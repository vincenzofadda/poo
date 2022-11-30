public class Item {
    private String nome;

    public void usarItem() {
      System.out.println("Você usou o item " + nome);
    }
  
    public void descartarItem() {
      System.out.println("Você descartou o item" + nome);
    }
}
