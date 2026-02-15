package org.vaultsync.vault;

import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;

public class ICloudVault implements IVault {
    private String file;
    private List<IVaultEntry> entries;
    private CSVReader reader;

    public ICloudVault(String file) {
        this.file = file;
        this.entries = new ArrayList<>();
        readFile();
    }

    private void readFile() {
        try {
            reader = new CSVReader(new java.io.FileReader(file));
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (line.length >= 6) {
                    SafariVaultEntry entry = new SafariVaultEntry(
                        line[0], // title
                        line[1], // url
                        line[2], // username
                        line[3], // password
                        line[4], // notes
                        line[5]  // otpAuth
                    );
                    entries.add(entry);
                } else {
                    System.out.println("Line ignored for having less than 6 fields: " + java.util.Arrays.toString(line));
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
