package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static com.company.Clientes.novoCliente;
//import static com.company.Clientes.produto;

public class Service {
    static List<Clientes> clientList = new ArrayList<>();
    Clientes clientes = new Clientes();
    Produtos prds = new Produtos();
    void adiciona(){

        enquanto:
        while (true) {

            //Produtos produtos = new Produtos();
            prds.nomeProduto = "Café";
            prds.precoIndividual = 15.90;
            Scanner leia = new Scanner(System.in);
            System.out.println("Seja bem vindo ao mercado!!");
            System.out.println("Digite seu nome: ");
            String nome = leia.next();
            clientes.nome = nome;
            System.out.println("Digite seu CPF: ");
            String cpf = leia.next();
            clientes.cpf = cpf;
            System.out.println("Digite o nome do produto: Café 15,90" + "\n" +
                    "Trigo: 20,00" + "\n" + "Açucar: 5,99" + "\n"+"Cereal: 9,98");
            String escolha = leia.next();
            if (escolha.equals("Trigo")) {
                prds.nomeProduto = escolha;
                prds.precoIndividual = 20.00;
                System.out.println("Digite a quantidade: ");
                Scanner preco = new Scanner(System.in);
                Integer quant = preco.nextInt();
                prds.quantidade = quant;
                prds.precoTotal = quant * prds.precoIndividual;
                clientes.totalCompra = prds.precoTotal;


            } else if (escolha.equals("Café")) {
                prds.nomeProduto = escolha;
                prds.precoIndividual = 5.99;
                System.out.println("Digite a quantidade: ");
                Scanner preco = new Scanner(System.in);
                Integer quant = preco.nextInt();
                prds.quantidade = quant;
                prds.precoTotal = quant * prds.precoIndividual;
                clientes.totalCompra = prds.precoTotal;
            }
            else if (escolha.equals("Cereal")) {
                prds.nomeProduto = escolha;
                prds.precoIndividual = 9.98;
                System.out.println("Digite a quantidade: ");
                Scanner preco = new Scanner(System.in);
                Integer quant = preco.nextInt();
                prds.quantidade = quant;
                prds.precoTotal = quant * prds.precoIndividual;
                clientes.totalCompra = prds.precoTotal;
            }
            else if (escolha.equals("Açucar")) {
                prds.nomeProduto = escolha;
                prds.precoIndividual = 15.90;
                System.out.println("Digite a quantidade: ");
                Scanner preco = new Scanner(System.in);
                Integer quant = preco.nextInt();
                prds.quantidade = quant;
                prds.precoTotal = quant * prds.precoIndividual;
                clientes.totalCompra = prds.precoTotal;
            }
            System.out.println("Para adicionar mais um Cliente digite(1): " + "\n" + "Para encerrar digite(0): ");
            int s = leia.nextInt();
            if (s==0){

                break enquanto;

            }


        }

        System.out.println("Cliente: "+clientes.nome);
        System.out.println("Produtos: "+prds.nomeProduto);
        System.out.println("Total da compra: "+clientes.totalCompra);


    }
}
