package Modelos;

import java.time.LocalDate;

public class Mensalidades {
    
    private Membros membro;
    protected double valorMensalidade;
    private LocalDate dataPagamento;

    public Mensalidades(Membros membro, double valorMensalidade, LocalDate dataPagamento) {
        this.membro = membro;
        this.valorMensalidade = valorMensalidade;
        this.dataPagamento = dataPagamento;
    }

    public Membros getMembro() {
        return membro;
    }

    public void setMembro(Membros membro) {
        this.membro = membro;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valor) {
        this.valorMensalidade = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    
}
