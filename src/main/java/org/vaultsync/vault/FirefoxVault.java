package org.vaultsync.vault;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class FirefoxVault implements IVault {
    private String file;
    private List<IVaultEntry> entries;

    public FirefoxVault(String file) {
        this.file = file;
        this.entries = new ArrayList<>();
        readFile();
    }

    private void readFile() {
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line.length >= 9) {
                    FirefoxVaultEntry entry = new FirefoxVaultEntry(
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
                    entries.add(entry);
                } else {
                    System.out.println("Line ignored for having less than 9 fields: " + Arrays.toString(line));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IVaultEntry> getEntries() {
        return entries;
    }
}
