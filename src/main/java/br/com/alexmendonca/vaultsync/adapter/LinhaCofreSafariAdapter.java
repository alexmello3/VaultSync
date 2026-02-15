package br.com.alexmendonca.vaultsync.adapter;

import br.com.alexmendonca.vaultsync.cofre.ILinhaCofre;

public class LinhaCofreSafariAdapter implements ILinhaCofreAdapter {
    @Override
    public String adapt(ILinhaCofre linha) {
        StringBuilder sb = new StringBuilder();

        // A estrutura de exportação do Safari é similar à do Firefox, mas com algumas diferenças:
        // - httpRealm não é utilizado no Safari, então deixamos vazio
        // - formActionOrigin é igual à url no Safari 
        // Safari: Title,URL,Username,Password,Notes,OTPAuth

        // TODO: Verificar se o Safari utiliza o campo Title e como preenchê-lo. Por enquanto, deixamos igual à URL.
        // TODO: Verificar se o Safari utiliza o campo OTPAuth e como preenchê-lo. Por enquanto, deixamos vazio.
        // TODO: Verificar se o Safari utiliza o campo Notes e como preenchê-lo. Por enquanto, deixamos vazio.
        // TODO: Verificar como o Safari exporta os dados e se é necessário algum tratamento específico para caracteres especiais, como vírgulas, aspas, etc.

        sb
          .append(linha.getUrl()+",")
          .append(linha.getUrl()+",")
          .append(linha.getUsername()+",")
          .append(linha.getPassword()+",")
          .append("") // Notes não é utilizado no Safari, então deixamos vazio
          .append(""); // OTPAuth não é utilizado no Safari, então deixamos vazio
        return sb.toString();
    }
    
}
