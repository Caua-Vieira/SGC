package Modelos;

public class ControleCaixa {
    private double total;
    private double valor;
    private TipoOperacao tipoOperacao;
    private Mensalidades mensalidade;
    
    public enum TipoOperacao {
        Entrada,
        Saida
    }

    public ControleCaixa(double total, double valor, TipoOperacao tipoOperacao) {
        this.total = total + mensalidade.valorMensalidade;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    
    
}
