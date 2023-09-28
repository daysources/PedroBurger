public class Produto {
    double preco;
    String descricao;

    public String getDescricao()
    {return descricao;}
    public void setDescricao(String descricao)
    {this.descricao = descricao;}
    public double getPreco()
    {return preco;}
    public void setPreco(double preco)
    {this.preco = preco;}

    public Produto(double preco, String descricao)
    {this.preco=preco;
    this.descricao=descricao;}
    }

