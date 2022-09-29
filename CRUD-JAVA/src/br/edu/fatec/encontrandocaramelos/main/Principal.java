package br.edu.fatec.encontrandocaramelos.main;

import br.edu.fatec.encontrandocaramelos.adotante.Adotante;
import br.edu.fatec.encontrandocaramelos.ong.Ong;
import br.edu.fatec.encontrandocaramelos.ong.pet.Pet;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Ong ong = new Ong();
        Pet pet;
        Adotante adotante = new Adotante();
        Scanner input = new Scanner(System.in);
        int escolha,opcoesAdotante,opcoesOng;

        System.out.println("1-Adotante| 2-Ong");
        escolha=input.nextInt();

        switch (escolha) {
            case 1:

                System.out.println("CADASTRE-SE");
                System.out.println("Nome: ");
                adotante.setNome(input.next());

                System.out.println("Email: ");
                adotante.setEmail(input.next());

                System.out.println("Telefone: ");
                adotante.setTelefone(input.nextInt());

                System.out.println("Endereço: ");
                adotante.setEndereco(input.next());

                System.out.println("CADASTRADO COM SUCESSO!!");
                adotante.imprimirDados();

                System.out.println("1-Exibir pets | 2-Sair");

                break;

            case 2:
                break;
            default:
                System.out.println("Opção inválida!");
        }
//        System.out.println("Cadastre um pet na sua ong");
//        System.out.println("nome do pet");



//       pet.setNome(input.next());
//       System.out.println("Idade do pet");
//        pet.setIdade(input.nextInt());
//        System.out.println("Sexo do pet");
//        pet.setSexo(input.next());
//        ong.addPet(pet);
//        ong.showPet();

    }


}
