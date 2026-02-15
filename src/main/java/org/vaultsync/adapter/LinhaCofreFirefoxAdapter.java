package org.vaultsync.adapter;

import org.vaultsync.cofre.ILinhaCofre;

public class LinhaCofreFirefoxAdapter implements ILinhaCofreAdapter {
    @Override
    public String adapt(ILinhaCofre linha) {
        StringBuilder sb = new StringBuilder();
        String tempoEmMilissegundos = String.valueOf(System.currentTimeMillis());
        sb
          .append("\""+linha.getUrl()+"\",")
          .append("\""+linha.getUsername()+"\",")
          .append("\""+linha.getPassword()+"\",")
          .append("\"\"") // httpRealm não é utilizado no Firefox
          .append("\""+linha.getUrl()+"\",") // formActionOrigin é igual à url no Firefox
          .append("\""+generateNewGuid()+"\",") // gera um novo guid para cada linha adaptada
          .append("\""+tempoEmMilissegundos+"\",")
          .append("\""+tempoEmMilissegundos+"\",")
          .append("\""+tempoEmMilissegundos+"\"");
        return sb.toString();
    }

    private String generateNewGuid() {
        return java.util.UUID.randomUUID().toString();
    }
}
