package org.vaultsync.adapter;

import org.vaultsync.vault.IVaultEntry;

public class FirefoxVaultEntryAdapter implements IVaultEntryAdapter {
    @Override
    public String adapt(IVaultEntry entry) {
        StringBuilder sb = new StringBuilder();
        String timeInMilliseconds = String.valueOf(System.currentTimeMillis());
        sb
          .append("\""+entry.getUrl()+"\",")
          .append("\""+entry.getUsername()+"\",")
          .append("\""+entry.getPassword()+"\",")
          .append("\"\"") // httpRealm is not used in Firefox
          .append("\""+entry.getUrl()+"\",") // formActionOrigin is equal to url in Firefox
          .append("\""+generateNewGuid()+"\",") // generates a new guid for each adapted entry
          .append("\""+timeInMilliseconds+"\",")
          .append("\""+timeInMilliseconds+"\",")
          .append("\""+timeInMilliseconds+"\"");
        return sb.toString();
    }

    private String generateNewGuid() {
        return java.util.UUID.randomUUID().toString();
    }
}
