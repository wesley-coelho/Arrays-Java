package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* EXERCICIO 1 - NEGATIVOS 
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			vect[i] = sc.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}*/
		
		/*EXERCICIO - SOMA VETOR
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0.0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();	
			soma+=vect[i];
		}
		System.out.print("\nVALORES = ");
		for(int j = 0; j < vect.length; j++) {
			System.out.printf("%.2f\t", vect[j]);
		}
		
		System.out.println("\nSOMA = " + soma);
		System.out.println("MÉDIA = " + (soma/vect.length));
		*/
		
		/* EXERCICIO 3
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int 			n = sc.nextInt();
		String[]	 nome = new String[n];
		int[]		idade = new int[n];
		double[]	altura = new double[n];
		
		for(int i = 0 ; i < nome.length; i++) {
			System.out.printf("Digite os dados da %dª pessoas:\n", i+1);
			System.out.printf("Nome: ");
			String s = sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double avgHeight = 0.0;
		double pessoasMenores16anos = 0;
		for(int i = 0; i < altura.length; i++) {
			avgHeight+=altura[i];
			if(idade[i] < 16) {
				pessoasMenores16anos++;
			}
		}
		avgHeight/=nome.length;
		System.out.printf("\nAltura média: %.2f%n", avgHeight);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f",(pessoasMenores16anos/nome.length)*100) + "%");
		for(int i = 0; i < idade.length; i++) {		
			if(idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}*/
		/*EXERCICIO 4
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();			
		}
		System.out.println("\nNÚMEROS PARES: ");
		int qtdPares = 0; 
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d\t", numeros[i]);
				qtdPares+=1;
			}
		}
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdPares);
		*/
		/*EXERCÍCIO 5
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		//calcular o maior numero contido no vetor 'numeros'
		double maior = 0.0;
		int posMaior = 0;
		for(int i = 0; i < numeros.length; i++) {
			if( maior < numeros[i] ) {
				maior = numeros[i];
				posMaior = i;
			}
		}
		System.out.println("\nMAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posMaior);*/
		/*EXERCICIO 6
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		System.out.println("Digite os valor do vetor A:");
		int[] vectA = new int[n];		
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		int[] vectB = new int[n];
		System.out.println("Digite os valor do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		int[] vectC = new int[n];
		System.out.println("Vetor resultante:");
		for(int i = 0; i < vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}*/
		
		/*EXERCICIO 7
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double sumVect = 0.0;
		double avgVect = 0.0;
		double elemAbaixoMedia = 0.0;
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
			sumVect+= numeros[i];
		}
		avgVect = sumVect / numeros.length;		
		System.out.printf("\nMÉDIA DO VETOR = %.3f", avgVect);
		System.out.println("\nELEMENTOS ABAIXO DA MÉDIA:");
		for(int i = 0; i < numeros.length; i++) {
			if( numeros[i] < avgVect ) {
				System.out.println(numeros[i]);
			}
		}*/
		/*EXERCICIO 8 APROVADOS
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		int[] idade = new int[n];
		String[] nome = new String[n];
		int maiorIdade = 0;
		int indexMaiorIdade = 0;
		for(int i = 0; i < nome.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			String s = sc.nextLine();			
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			if( maiorIdade < idade[i]) {
				maiorIdade = idade[i];
				indexMaiorIdade = i;
			}
		}
		System.out.println("Pessoa mais velha: " + nome[indexMaiorIdade]);
		*/
		/*
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		String[] aluno = new String[n];
		for(int i = 0; i < aluno.length; i++) {
			System.out.println("Digite nome, a primeira e a segunda nota do "+(i+1)+"º aluno:");
			String s = sc.nextLine();
			aluno[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("\nAlunos aprovados: ");
		for(int i = 0; i < aluno.length; i++) {
			if( (nota1[i] + nota2[i]) / 2 >= 6.0) {
				System.out.println(aluno[i]);
			}
		}*/
		
		System.out.print("Quantas pessoas deseja digitar?");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		int nHomens = 0;
		for(int i = 0; i < altura.length; i++) {
			System.out.printf("Altura da %dª pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %dª pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		double menorAltura = altura[0];
		double maiorAltura = 0.0;
		double avgWomenHeight = 0.0;
		for(int i = 0; i < altura.length; i++) {
			
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			if( maiorAltura < altura[i] ) {
				maiorAltura = altura[i];
			}
			
			if( genero[i] == 'F' ) {
				avgWomenHeight+=altura[i];
			}else {
				nHomens++;
			}
					
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avgWomenHeight/(n-nHomens));
		System.out.printf("Numero de homens = %d%n", nHomens);
		
	}

}
