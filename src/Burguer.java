public class Burguer extends Produto {
    int Gramas;
    
    public Burguer(double preco, String descricao, int Gramas)
    {super(preco,descricao);
    this.Gramas=Gramas;}
    @Override
    public String toString()
    {return "O hamburguer incluso é: "+getDescricao()+ "\nQue pesa em gramas: "+Gramas+ "\nE custa: R$"+getPreco();}
}
