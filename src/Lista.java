import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> feminino = new ArrayList<>();
    	List<String> masculino = new ArrayList<>();
        
        System.out.println("Deseja adicionar um aluno na lista? (Digite 'S' para Sim ou 'N' para Não)");
        String resposta = s.next();
        
        while(resposta.equals("S")) {
        	System.out.println("Digite o sexo do aluno: (Digite 'M' para Masculino ou 'F' para Feminino)");
        	String sexo = s.next();
        	System.out.println("Digite o nome do aluno:");
        	String nome = s.next();
        	
        	if (sexo.equals("M")) {
        		masculino.add(nome);
        	} else {
        		feminino.add(nome);
        	}
        	
        	System.out.println("Deseja adicionar mais um aluno na lista? (Digite 'S' para Sim ou 'N' para Não)");
        	resposta = s.next();
        }
        
        System.out.println("******* Lista dos alunos ******");
        System.out.println("Sexo feminino: " + feminino);
        System.out.println("Sexo masculino: " + masculino);
        System.out.println("Obrigado!!!");
        
        s.close();
	}
}
