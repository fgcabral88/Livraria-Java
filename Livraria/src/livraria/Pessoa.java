
package livraria;

public class Pessoa {
    
    // Atributos:
    private String nome;
    private int idade;
    private String sexo;

    // Construtor:
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Gets e Sets:
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //-------------------------------------------------------------------------
    
    // Método feliz aniversário:
    public void felizAniversario(){
        idade = idade + 1;
    }
}
