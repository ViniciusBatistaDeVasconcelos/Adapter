public class Dinheiro {
    private IMoeda moeda;
    private MoedaAdapter persistencia;

    public Dinheiro() {
        moeda = new MoedaReal();
        persistencia = new MoedaAdapter(moeda);
    }

    public void setMoedaReal(float valor) {
        moeda.setValor(valor);
        persistencia.salvarMoeda();
    }

    public float getMoedaReal() {
        return persistencia.recuperarMoeda();
    }

    public float getMoedaDolarAmericano() {
        return persistencia.getValor();
    }

    @Override
    public String toString() {
        return moeda.toString() + " = " + persistencia.toString();
    }
}
