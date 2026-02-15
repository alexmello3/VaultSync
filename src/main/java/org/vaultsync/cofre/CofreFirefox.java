package org.vaultsync.cofre;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class CofreFirefox implements ICofre {
    private String arquivo;
    private List<ILinhaCofre> linhas;
        public CofreFirefox(String arquivo) {
            this.arquivo = arquivo;
            lerArquivo();
        }
        private void lerArquivo() {
            try (CSVReader reader = new CSVReader(new FileReader(arquivo))) {
                String[] line;
                while ((line = reader.readNext()) != null) {
                    if (line.length >= 9) {
                        LinhaCofreFirefox linha = new LinhaCofreFirefox(
                            line[0], // url
                            line[1], // username
                            line[2], // password
                            line[3], // httpRealm
                            line[4], // formActionOrigin
                            line[5], // guid
                            line[6], // timeCreated
                            line[7], // timeLastUsed
                            line[8]  // timePasswordChanged
                        );
                        linhas.add(linha);
                    } else {
                        System.out.println("Linha ignorada por ter menos de 9 campos: " + Arrays.toString(line));
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
