package org.vaultsync.adapter;

import org.vaultsync.util.Constants;

public class VaultEntryAdapterFactory {
    public static IVaultEntryAdapter getVaultEntryAdapter(String outputVaultType) {
        switch (outputVaultType) {
            case Constants.VAULT_TYPE_FIREFOX:
                return new FirefoxVaultEntryAdapter();
            case Constants.VAULT_TYPE_SAFARI:
                return new SafariVaultEntryAdapter();
            default:
                throw new IllegalArgumentException("Unknown vault type: " + outputVaultType);
        }
    }
}
