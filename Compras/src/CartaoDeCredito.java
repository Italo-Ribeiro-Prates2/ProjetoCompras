
import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(compra compra) {
        if (compra.getValor() > saldo) {
            return false;
        }
        saldo -= compra.getValor();
        compras.add(compra);
        return true;
    }

    public double getLimite() {
        return limite;
    }



    public double getSaldo() {
        return saldo;
    }

    public List<compra> getCompras() {
        return compras;
    }
}
