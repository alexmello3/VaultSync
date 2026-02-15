package br.com.alexmendonca.vaultsync.cofre;

import java.util.List;
import com.opencsv.CSVReader;

public class CofreICloud implements ICofre {
	private String arquivo;
    private List<ILinhaCofre> linhas;
	private CSVReader leitor;
	public CofreICloud(String arquivo) {
		this.arquivo = arquivo;
		lerArquivo();
	}
	private void lerArquivo() {
		try {			
			leitor = new CSVReader(new java.io.FileReader(arquivo));
			String[] line;
			while ((line = leitor.readNext()) != null) {
				if (line.length >= 6) {
					LinhaCofreSafari linha = new LinhaCofreSafari(
						line[0], // title
						line[1], // url
						line[2], // username
						line[3], // password
						line[4], // notes
						line[5]  // otpAuth
					);
					linhas.add(linha);
				} else {
					System.out.println("Linha ignorada por ter menos de 6 campos: " + java.util.Arrays.toString(line));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public List<ILinhaCofre> getLinhas() {
		return linhas;
	}

}