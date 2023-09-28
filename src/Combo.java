public class Combo{
    
    public void CriarCombo(int tipo)
    {
        switch(tipo){
            case 1:
            Burguer hamburguer = new Burguer(22, "X-Tudo", 500);
            Bebida drink = new Bebida(7, "Guaraná Dolly", 500);
            Sobremesas sobremesa = new Sobremesas(12, "Shake Açaí", "grande");
            System.out.println("\nVocê escolheu o Combo Master!");
            System.out.println(hamburguer);
            System.out.println(drink);
            System.out.println(sobremesa);
            break;

            case 2:
            Burguer hamburguer2 = new Burguer(16, "X-Picanha", 480);
            Bebida drink2 = new Bebida(9, "H2OH", 500);
            Sobremesas sobremesa2 = new Sobremesas(8, "Shake Ovomaltine", "médio");
            System.out.println("\nVocê escolheu o Super Combo!");
            System.out.println(hamburguer2);
            System.out.println(drink2);
            System.out.println(sobremesa2);
            break;

            default:
            break;
        }
        
    }
    @Override
   public String toString() {
      return "Espero que tenha gostado do nosso serviço! Volte Sempre!";
   }
}