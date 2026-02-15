package org.vaultsync;

import java.util.ArrayList;
import java.util.List;
import org.vaultsync.vault.IVault;
import org.vaultsync.vault.VaultFactory;

public class Main {

    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        List<IVault> vaults = new ArrayList<>();

        for (String file : files) {
            try {
                IVault vault = VaultFactory.createVault(file);
                vaults.add(vault);
            } catch (IllegalArgumentException e) {
                System.out.println("Error creating vault for file " + file + ": " + e.getMessage());
            }
        }

        // Here you can add logic to compare vaults and synchronize passwords
        // For example, you can iterate over vaults and compare entries, or use a data structure to store passwords and facilitate comparison
        // First need to decouple vault types by leaving attributes in the IVault interface, then create a comparison class that receives vaults and performs
        // comparison between them, generating a report of differences or similarities between vaults and exporting new vaults with updates from both to both files.



        System.out.println("Processing completed. Vaults created: " + vaults.size());

    }

}
