public class compra implements Comparable<compra> {
    private String Descricao;
    private double valor;

    public compra(String descricao, double valor) {
        this.Descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "compra{" +
                "descricao='" + Descricao + '\'' +
                ", valor=" + valor +
                '}';
    }


    @Override
    public int compareTo(compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
