package Modelos;

public class Membros {
    private String nome;
    private int idade;
    private String tipo;
    private String funcao;
    private Unidades unidade;

    public Membros(String nome, int idade, String funcao, Unidades unidade) {
        this.nome = nome;
        this.idade = idade;
        if(this.idade >= 10 && this.idade <= 15){
            this.tipo = "Desbravador";
        } else {
            this.tipo = "Diretoria";
        }
        this.funcao = funcao;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Unidades getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidades unidade) {
        this.unidade = unidade;
    }
    
    
    
    
}
