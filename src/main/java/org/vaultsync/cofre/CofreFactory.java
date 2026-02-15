package org.vaultsync.cofre;

public class CofreFactory {
    public static ICofre criarCofre(String arquivo) {
        String tipo = determinarTipoCofre(arquivo);
        return switch (tipo.toLowerCase()) {
            case "icloud" -> new CofreICloud(arquivo);
            case "firefox" -> new CofreFirefox(arquivo);
            default -> throw new IllegalArgumentException("Tipo de cofre desconhecido: " + tipo);
        };
    }

    private static String determinarTipoCofre(String arquivo) {
        String tipoPorConteudoString = determinarTipoCofrePorConteudoString(arquivo);
        if (tipoPorConteudoString != null) {
            return tipoPorConteudoString;
        }   
        if (arquivo.toLowerCase().contains("icloud")) {
            return "icloud";
        } else if (arquivo.toLowerCase().contains("firefox")) {
            return "firefox";
        } else {
            throw new IllegalArgumentException("Não foi possível determinar o tipo de cofre para o arquivo: " + arquivo);
        }
    }

    private static String determinarTipoCofrePorConteudoString(String arquivo) {
        String conteudo = obterHeaderDoArquivoString(arquivo);
        if (conteudo.toLowerCase().contains("otpAuth")) {
            return "icloud";
        } else if (conteudo.toLowerCase().contains("httpRealm")) {
            return "firefox";
        } else {
            return null; // Tipo desconhecido
        }
    }

    private static String obterHeaderDoArquivoString(String arquivo) {
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(arquivo))) {
            return reader.readLine(); // Lê a primeira linha do arquivo
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Em caso de erro, retorna null
        }
    }
    
}
