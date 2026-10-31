import java.time.LocalTime;
import java.util.Scanner;

class Entrega_prazo {
	String produto;
    double preco;
    String nome;
    
    public Entrega_prazo() {};
    
    public Entrega_prazo(String produto, double preco, String nome) {
    	this.produto = produto;
        this.preco = preco;
        this.nome = nome;
    }
}

public class Entrega_produto {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String produto = "";
        double preco = 0.0;
        String nome = "";
        
        System.out.print("Escolha um produto: ");
        produto = sc.nextLine();
        
        System.out.print("Qual preço dele?: ");
        preco = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("SEU NOME: ");
        nome = sc.nextLine();
        
        System.out.println("DADOS DE ENTREGA");
        
        System.out.print("Qual o horario escolhe: ");
        LocalTime prazo_entrega = LocalTime.parse(sc.nextLine());
        
        Entrega_prazo ec = new Entrega_prazo(produto, preco, nome);
        
        System.out.print("Qual horario chegou? ");
        LocalTime confirma = LocalTime.parse(sc.nextLine());
        
        if(confirma.isBefore(prazo_entrega)) {
        	System.out.print("Qual horario chegou? ");
            String horario_chegada = sc.nextLine();
            System.out.println("| PRODUTO: " + ec.produto + "| CLIENTE: " + ec.nome + " | ENTREGA FEITA AS: " +  horario_chegada + " | ");
            System.out.println("DEIXE SEU AVAL ! 0 a 3");
            System.out.print("O que Achou? ");
            int aval1 = sc.nextInt();
            if(aval1 == 0) {
            	System.out.print("O que não gostou nele? ");
                String comentario1 = sc.nextLine();
                sc.nextLine();
                System.out.println("OBRIGADO POR SUA SINCERIDADE VAMOS MANDAR PARA NOSSO DEPARTAMENTO PARA NOVOS MELHORAMENTOS ! " + comentario1 + "CLEINTE AVAL: " + aval1 + " | ");
            }
            else if(aval1 == 1) {
            	System.out.print("O que poderiamos melhorar? ");
                String comentario2 = sc.nextLine();
                sc.nextLine();
                System.out.println("OBRIGADO POR SUA SINCERIDADE VAMOS MANDAR PARA NOSSO DEPARTAMENTO PARA NOVOS MELHORAMENTOS ! " + comentario2 + "CLEINTE AVAL: " + aval1 + " | ");
            }
            else if(aval1 == 2) {
            	System.out.print("Que bom que gostou ! Deixe um comentario sobre o que podemos melhorar ! ");
                String comentario3 = sc.nextLine();
                sc.nextLine();
                System.out.println("OBRIGADO POR SUA SINCERIDADE VAMOS MANDAR PARA NOSSO DEPARTAMENTO PARA NOVOS MELHORAMENTOS ! " + comentario3 + "CLEINTE AVAL: " + aval1 + " | ");
            }
            else if(aval1 == 3) {
            System.out.print("Que bom que gostou ! Deixe um comentario sobre o que podemos melhorar ! ");
            	String comentario4 = sc.nextLine();
                sc.nextLine();
                System.out.println("OBRIGADO POR SUA SINCERIDADE VAMOS MANDAR PARA NOSSO DEPARTAMENTO PARA NOVOS MELHORAMENTOS ! " + comentario4 + "CLEINTE AVAL: " + aval1 + " | ");
            }
            else {
            	System.out.println(" TENTE NOVAMENTE! ");
            }
        }
        else {
        	System.out.println("SINTO MUITO, ALGO DEU ERRADO 🥺 TENTE NOVAMENTE MAIS TARDE OU AGUARDE UM INSTANTE ⌛✅");
        }

        
        if(confirma.isAfter(prazo_entrega)) {
        	System.out.print("NOME ENTREGADOR: (opcional) ");
            String opcional = sc.nextLine();
            System.out.println("ENTREGADOR: " + opcional + " | ");
            System.out.println("PRODUTO: " + ec.produto + " | ");
            System.out.println("VALOR PRODUTO: R$ " + ec.preco + " | ");
            System.out.println(" SISTEMA DE REELMBOLSO EM ANDAMENTO...");
            System.out.print("NOVO HORARIO DE ENTREGA: ");
            LocalTime prazo_entrega2 = LocalTime.parse(sc.nextLine());
            System.out.println("REMBOLSO DO VALOR: R$ " + ec.preco + " | CLIENTE: " + ec.nome + "PRODUTO: " + ec.produto + " | NOVO PRAZO (SEM PAGAMENTOS): " + prazo_entrega2 + " | ");
            System.out.println("A EMPRESA PEDE DESCULPAS PELO OCORRIDO PEDIMOS POR GENTILEZA DE NOS AVALIAR DEPOIS DE SAIR DESTA TELA, OBRIGADO ! ");
            
        }
        
        
        
    }
}