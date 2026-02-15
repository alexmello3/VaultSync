package org.vaultsync.adapter;

import org.vaultsync.vault.IVaultEntry;

public class SafariVaultEntryAdapter implements IVaultEntryAdapter {
    @Override
    public String adapt(IVaultEntry entry) {
        StringBuilder sb = new StringBuilder();

        // Safari export structure is similar to Firefox but with some differences:
        // - httpRealm is not used in Safari, so we leave it empty
        // - formActionOrigin is equal to url in Safari
        // Safari: Title,URL,Username,Password,Notes,OTPAuth

        // TODO: Verify if Safari uses the Title field and how to fill it. For now, we leave it equal to URL.
        // TODO: Verify if Safari uses the OTPAuth field and how to fill it. For now, we leave it empty.
        // TODO: Verify if Safari uses the Notes field and how to fill it. For now, we leave it empty.
        // TODO: Verify how Safari exports data and if any special handling is needed for special characters like commas, quotes, etc.

        sb
          .append(entry.getUrl()+",")
          .append(entry.getUrl()+",")
          .append(entry.getUsername()+",")
          .append(entry.getPassword()+",")
          .append("") // Notes is not used in Safari, so we leave it empty
          .append(""); // OTPAuth is not used in Safari, so we leave it empty
        return sb.toString();
    }

}
