public class MoedaAdapter extends MoedaDolarAmericano {

    private IMoeda moedaReal;

    public MoedaAdapter(IMoeda moedaReal) {
        this.moedaReal = moedaReal;
    }

    public float recuperarMoeda() {
        moedaReal.setValor(this.getValor() * 4.73f);
        return moedaReal.getValor();
    }

    public void salvarMoeda() {
        this.setValor(moedaReal.getValor() * (1 / 4.73f));
    }
}
