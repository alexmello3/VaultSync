package org.vaultsync.vault;

public class VaultFactory {
    public static IVault createVault(String file) {
        String type = determineVaultType(file);
        return switch (type.toLowerCase()) {
            case "icloud" -> new ICloudVault(file);
            case "firefox" -> new FirefoxVault(file);
            default -> throw new IllegalArgumentException("Unknown vault type: " + type);
        };
    }

    private static String determineVaultType(String file) {
        String typeByContentString = determineVaultTypeByContentString(file);
        if (typeByContentString != null) {
            return typeByContentString;
        }
        if (file.toLowerCase().contains("icloud")) {
            return "icloud";
        } else if (file.toLowerCase().contains("firefox")) {
            return "firefox";
        } else {
            throw new IllegalArgumentException("Unable to determine vault type for file: " + file);
        }
    }

    private static String determineVaultTypeByContentString(String file) {
        String content = getFileHeaderString(file);
        if (content.toLowerCase().contains("otpAuth")) {
            return "icloud";
        } else if (content.toLowerCase().contains("httpRealm")) {
            return "firefox";
        } else {
            return null; // Unknown type
        }
    }

    private static String getFileHeaderString(String file) {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file))) {
            return reader.readLine(); // Read first line of file
        } catch (Exception e) {
            e.printStackTrace();
            return null; // In case of error, return null
        }
    }

}
