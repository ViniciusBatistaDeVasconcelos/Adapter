import java.text.DecimalFormat;

public class MoedaReal implements IMoeda {

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.##");
        String strValor = df.format(valor);
        return "R$ " + strValor;
    }
}
