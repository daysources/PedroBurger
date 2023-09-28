public class Bebida extends Produto{
    int ml;

    public Bebida(double preco, String descricao, int ml)
    {super(preco, descricao);
    this.ml=ml;}

    @Override
    public String toString()
    {return "\nSua bebida é: "+getDescricao()+"\nCom "+ml+"\nE custa: R$"+getPreco();}
}
