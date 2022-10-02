package br.edu.fatec.encontrandocaramelos.ong.pet;

public class Pet {

    //ATRIBUTOS
    private int id;
    private String nome;
    private String especie;
    private String raca;
    private String cor;
    private String sexo;
    private int idade;
    private boolean vermifugado, vacinado, castrado;
    private String historico;



    //GETTERS E SETTERS ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //GETTERS E SETTERS NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //GETTERS E SETTERS ESPECIE
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    //GETTERS E SETTERS RACA
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    //GETTERS E SETTERS COR
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    //GETTERS E SETTERS SEXO
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //GETTERS E SETTERS IDADE
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //GETTERS E SETTERS VERMIFUGADO, VACINADO E CASTRADO
    public boolean isVermifugado() {
        return vermifugado;
    }
    public void setVermifugado(boolean vermifugado) {
        this.vermifugado = vermifugado;
    }
    public boolean isVacinado() {
        return vacinado;
    }
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    public boolean isCastrado() {
        return castrado;
    }
    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    //GETTERS E SETTERS HISTORICO
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }

    //MÉTODO IMPRIMIR DADOS
    public void imprimirDados() {
        System.out.println("Id: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Espécie: "+ getEspecie());
        System.out.println("Raça: " + getRaca());
        System.out.println("Cor: " + getCor());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
        System.out.println("Vermifugado: " + isVermifugado());
        System.out.println("Vacinado: " + isVacinado());
        System.out.println("Castrado: " + isCastrado());
        System.out.println("Histórico: " + getHistorico() + "\n");

    }
}
