package br.edu.fatec.encontrandocaramelos.adotante;

public class Adotante {

    //ATRIBUTOS
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    //GETTERS E SETTERS NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //GETTERS E SETTERS ENDEREÇO
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //GETTERS E SETTERS TELEFONE
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //GETTERS E SETTERS EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //MÉTODO IMPRIMIR DADOS
    public void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Endereço: " + getEndereco() + "\n");
    }


}
