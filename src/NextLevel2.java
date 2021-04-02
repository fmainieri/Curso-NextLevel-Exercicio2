import java.util.Scanner;
public class NextLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int aluno = 0;
		int TotalAprovados = 0;
		int TotalReprovados = 0;
		int TotalAF = 0;
		double Prova, Projeto, Exercicio, Media;
		double MediaTurma = 0;
		double MaiorNota = 0;
		double MenorNota = 10;
		int continua = 1;
		
		System.out.println("Bem Vindo a Universidade do Bruno");
		while (continua == 1) {
			aluno = aluno + 1;
			//Entrada da informações
			do {
				System.out.print("Digite a nota da Prova do Aluno " + aluno + " : ");
				Prova = sc.nextDouble();	
			}while (Prova < 0 || Prova > 10);
			
			do {
				System.out.print("Digite a nota da Projeto do Aluno " + aluno +" : ");
				Projeto = sc.nextDouble();
			}while (Projeto < 0 || Projeto > 10);
			
			do {
				System.out.print("Digite a nota da Lista de Exercicios do Aluno " + aluno +" : ");
				Exercicio = sc.nextDouble();	
			}while (Exercicio < 0 || Exercicio > 10);

			
			// Calculo da Media do Aluno
			Media = ((Prova * 5)+(Projeto * 3)+(Exercicio * 2))/(5+3+2);
			
			// Apresenta o Resultado do Aluno
			if (Media >=8){
				System.out.println("Aluno Aprovado com Média = " + Media);
				TotalAprovados = TotalAprovados + 1;
			} else if (Media < 5 ) {
				System.out.println("Aluno Reprovado com Média = " + Media);
				TotalReprovados = TotalReprovados + 1;
			} else {
				System.out.println("Aluno em Avaliação Final com Média = " + Media);
				TotalAF = TotalAF + 1;
			}
			
			// Calcula a Nota total da turma
			MediaTurma = MediaTurma + Media;
			
			//Verifica de a Media desse aluno é a Maior que a Anterior
			if (Media > MaiorNota) {
				MaiorNota = Media;
			}
			
			//Verifica se a Media desse aluno é Menor que a anterior
			if (Media < MenorNota) {
				MenorNota = Media;
			}
			
			// Verifica se possiu mais alunos na turma
			do {
				System.out.print("Deseja informar mais alunos? (1 - Sim / 2 - Não) ");
				continua = sc.nextInt();	
			}while (continua < 1 || continua > 2);
			
			
		}	
		
		System.out.println("Total de Alunos na Turma = " + aluno);
		System.out.println("Total de Alunos Aprovados = " + TotalAprovados);
		System.out.println("Total de Alunos Reprovados = " + TotalReprovados);
		System.out.println("Total de Alunos Avaliação Final = " + TotalAF);
		
		MediaTurma = MediaTurma / aluno;
		System.out.println("Nota Media da Turma = " + MediaTurma);
		System.out.println("Maior Nota = " + MaiorNota);
		System.out.println("Menor Nota = " + MenorNota);
		
		sc.close();
	}

}
