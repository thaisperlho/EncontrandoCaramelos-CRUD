package br.edu.fatec.encontrandocaramelos.ong;

import br.edu.fatec.encontrandocaramelos.ong.pet.Pet;

public class Ong {

    //ATRIBUTOS
    private String nome;
    private String responsavel;
    private String endereco;
    private int telefone;
    private String email;
    private Boolean ajuda;

    //VETOR PETS
    private Pet[] pets = new Pet[10];


    public void setPet(Pet[] pets) {
        this.pets = pets;
    }

    //METODO DE ADICIONAR OS PETS NO VETOR
    public void addPet(Pet pet) {
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] == null) {
                this.pets[i] = pet;
                return;
            }
        }

        System.out.println("Pet está cheio! Você não pode cadastrar mais pets!");
    }

    //METODO QUE APRESENTA OS PETS CADASTRADOS
    public void showPet() {
        for (Pet pet : this.pets) {
            if (pet != null) {
                System.out.println("Nome: " + pet.getNome());
                System.out.println("Idade: " + pet.getIdade());
                System.out.println("Sexo: " + pet.getSexo());
            }
        }
    }

    //METODO QUE REMOVE UM PET CADASTRADO
    public void removePet(int id) {
        Pet[] newPet = new Pet[10];
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i].getId() != id) {
                int total = newPet.length;
                newPet[total] = this.pets[i];
            }
        }
        this.pets = newPet;
    }

    //METODO QUE ATUALIZA UM PET CADASTRADO
    public void updatePet(int id, Pet petAtualizado) {
        for (Pet pet : this.pets) {
            if(pet.getId() == id) {
                pet = petAtualizado;
                System.out.println("Seu pet foi atualizado");
            }
        }
        System.out.println("O id do pet não foi encontrado");
    }

    //GETTERS E SETTERS NOME
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //GETTERS E SETTERS RESPONSAVEL
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    //GETTERS E SETTERS ENDERECO
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //GETTERS E SETTERS TELEFONE
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    //GETTERS E SETTERS EMAIL
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //GETTERS E SETTERS AJUDA
    public Boolean getAjuda() {
        return ajuda;
    }

    public void setAjuda(Boolean ajuda) {
        this.ajuda = ajuda;
    }

    public void imprimirDados() {
        System.out.println("Nome da Ong: " + getNome());
        System.out.println("Nome do Responsável: " + getResponsavel());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Ajuda: " + getAjuda() + "\n");
    }
}
