package org.vaultsync;

import java.util.ArrayList;
import java.util.List;
import org.vaultsync.cofre.ICofre;
import org.vaultsync.cofre.CofreFactory;

public class Main {

	public static void main(String[] args) {
		List<String> arquivos = new ArrayList<>();
		List<ICofre> cofres = new ArrayList<>();

		for (String arquivo : arquivos) {
			try {
				ICofre cofre = CofreFactory.criarCofre(arquivo);
				cofres.add(cofre);
			} catch (IllegalArgumentException e) {
				System.out.println("Erro ao criar cofre para o arquivo " + arquivo + ": " + e.getMessage());
			}
		}

		 // Aqui você pode adicionar a lógica para comparar os cofres e sincronizar as senhas
		 // Por exemplo, você pode iterar sobre os cofres e comparar as entradas, ou usar uma estrutura de dados para armazenar as senhas e facilitar a comparação
		// Preciso desacoplar primeiro os tipos de cofre deixando os atributos na interface ICofre, e depois criar uma classe de comparação que recebe os cofres e faz a 
		// comparação entre eles, gerando um relatório de diferenças ou similaridades entre os cofres e exportando cofres novos com as atualizações de ambos em ambos os arquivos.

		

		 
		 System.out.println("Processamento concluído. Cofres criados: " + cofres.size());
		
	}

}
