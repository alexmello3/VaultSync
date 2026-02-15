package org.vaultsync.vault;

public interface IVaultEntry {
        public String getUrl();
        public String getUsername();
        public String getPassword();
        public String getVaultType();
        public int hashCode();
        public boolean equals(Object obj);
}
