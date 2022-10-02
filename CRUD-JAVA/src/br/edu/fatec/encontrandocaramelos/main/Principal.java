package br.edu.fatec.encontrandocaramelos.main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.fatec.encontrandocaramelos.adotante.Adotante;
import br.edu.fatec.encontrandocaramelos.ong.Ong;
import br.edu.fatec.encontrandocaramelos.ong.pet.Pet;

public class Principal {

    public static void main(String[] args) {

        //INSTANCIANDO AS CLASSES
        Ong ong = new Ong();
        Pet pet, petAtualizado;
        Adotante adotante = new Adotante();
        Scanner input = new Scanner(System.in);
        int escolha, opcoesAdotante, opcoesOng, id;

        //DEFININDO OPÇÕES INICIAIS DO PROGRAMA
        JOptionPane.showMessageDialog(null, "Encontrando Caramelos \ud83d\udd0e \ud83d\udc15");
        System.out.println("1-Sou Ong| 2- Sou Adotante | 3-Sair");
        escolha = input.nextInt();
        while (escolha != 3) {
            switch (escolha) {

                //ADOTANTE
                case 2:
                    System.out.println("CADASTRE-SE");
                    input.nextLine();
                    System.out.println("Nome: ");
                    adotante.setNome(input.nextLine());
                    System.out.println("Email: ");
                    adotante.setEmail(input.next());
                    System.out.println("Telefone: ");
                    adotante.setTelefone(input.next());
                    input.nextLine();
                    System.out.println("Endereço: ");
                    adotante.setEndereco(input.nextLine());
                    System.out.println("CADASTRADO COM SUCESSO!!");
                    adotante.imprimirDados();

                    //MENU ADOTANTE
                    System.out.println("1-Exibir pets | 2-Sair");
                    opcoesAdotante = input.nextInt();
                    while (opcoesAdotante != 2) {
                        switch (opcoesAdotante) {
                            case 1 -> ong.showPet();
                            case 2 -> System.out.println("Saindo da aba Adotante!");
                            default -> System.out.println("Opção inválida!");
                        }
                        System.out.println("1-Exibir pets | 2-Sair");
                        opcoesAdotante = input.nextInt();
                    }
                    break;

                //ONG
                case 1:
                    System.out.println("CADASTRE-SE");
                    System.out.println("Nome: ");
                    ong.setNome(input.nextLine());
                    input.nextLine();
                    System.out.println("Responsavel: ");
                    ong.setResponsavel(input.nextLine());
                    System.out.println("Email: ");
                    ong.setEmail(input.next());
                    System.out.println("Telefone: ");
                    ong.setTelefone(input.next());
                    input.nextLine();
                    System.out.println("Endereço: ");
                    ong.setEndereco(input.nextLine());
                    System.out.println("Ajuda(Sim ou Nao): ");
                    ong.setAjuda(ong.verificarResp(input.next()));
                    while(ong.getAjuda().equals("")){
                        System.out.println("Digite(Sim ou Nao): ");
                        ong.setAjuda(ong.verificarResp(input.next()));
                    }
                    System.out.println("\nCADASTRADO COM SUCESSO!!");
                    ong.imprimirDados();

                    //MENU DA ONG
                    System.out.println("1-Cadastar pet | 2-Atualizar pet | 3-Listar pets | 4-Excluir pet | 5-Sair");
                    opcoesOng = input.nextInt();
                    input.nextLine();
                    while (opcoesOng != 5) {
                        switch (opcoesOng) {

                            //CADASTRAR PET
                            case 1:
                                pet = new Pet();
                                // DADOS PET
                                System.out.println("Digite id: ");
                                pet.setId(input.nextInt());
                                input.nextLine();
                                System.out.println("Nome: ");
                                pet.setNome(input.nextLine());
                                System.out.println("Espécie: ");
                                pet.setEspecie(input.next());
                                input.nextLine();
                                System.out.println("Raça: ");
                                pet.setRaca(input.nextLine());
                                System.out.println("Cor: ");
                                pet.setCor(input.next());
                                System.out.println("Sexo: ");
                                pet.setSexo(input.next());
                                System.out.println("Idade: ");
                                pet.setIdade(input.nextInt());
                                System.out.println("Vermifugado(Sim ou Nao): ");
                                pet.setVermifugado(pet.verificarResp(input.next()));
                                while(ong.getAjuda().equals("")){
                                    System.out.println("Digite(Sim ou Nao): ");
                                    ong.setAjuda(ong.verificarResp(input.next()));
                                }
                                System.out.println("Vacinado(Sim ou Nao): ");
                                pet.setVacinado(pet.verificarResp(input.next()));
                                while(ong.getAjuda().equals("")){
                                    System.out.println("Digite(Sim ou Nao): ");
                                    ong.setAjuda(ong.verificarResp(input.next()));
                                }
                                System.out.println("Castrado(Sim ou Nao): ");
                                pet.setCastrado(pet.verificarResp(input.next()));
                                while(ong.getAjuda().equals("")){
                                    System.out.println("Digite(Sim ou Nao): ");
                                    ong.setAjuda(ong.verificarResp(input.next()));
                                }
                                input.nextLine();
                                System.out.println("Historico: ");
                                pet.setHistorico(input.nextLine());

                                // SALVANDO PET NO VETOR
                                ong.addPet(pet);
                                break;

                            //ATUALIZAR PET
                            case 2:
                                ong.showPet();
                                petAtualizado = new Pet();
                                System.out.println("Digite o id do pet que deseja atualizar: ");
                                id = input.nextInt();

                                // CAMPO PARA ATUALIZAR
                                petAtualizado.setId(id);
                                input.nextLine();
                                System.out.println("Nome: ");
                                petAtualizado.setNome(input.nextLine());
                                System.out.println("Cor: ");
                                petAtualizado.setCor(input.next());
                                System.out.println("Idade: ");
                                petAtualizado.setIdade(input.nextInt());
                                input.nextLine();
                                System.out.println("Historico: ");
                                petAtualizado.setHistorico(input.nextLine());

                                //ATUALIZANDO VETOR
                                ong.updatePet(id, petAtualizado);
                                break;

                            //LISTAR PET
                            case 3:
                                ong.showPet();
                                break;

                            //EXCLUIR PET
                            case 4:
                                ong.showPet();
                                System.out.println("Digite o id do pet que deseja excluir: ");
                                id = input.nextInt();
                                ong.removePet(id);
                                break;

                            default:
                                System.out.println("Opção inválida!");
                        }
                        System.out.println("1-Cadastar pet | 2-Atualizar pet | 3-Listar pets | 4-Excluir pet | 5-Sair");
                        opcoesOng = input.nextInt();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("1-Sou Ong| 2- Sou Adotante | 3-Sair");
            escolha = input.nextInt();
        }
        input.close();
    }

}
