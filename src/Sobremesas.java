public class Sobremesas extends Produto {
    String tamanho;

    public Sobremesas(double preco, String descricao, String tamanho)
    {super(preco,descricao);
    this.tamanho=tamanho;}

    @Override
    public String toString()
    {return "\nSua sobremesa é um "+getDescricao()+ "\nTamanho "+tamanho+ "\nE custa: R$"+getPreco();}
}
