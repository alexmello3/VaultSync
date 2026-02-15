package org.vaultsync.vault;

import org.vaultsync.util.Constants;

public class SafariVaultEntry implements IVaultEntry {
    private String title;
    private String url;
    private String username;
    private String password;
    private String notes;
    private String otpAuth;

    public SafariVaultEntry(String title, String url, String username, String password, String notes, String otpAuth) {
        this.title = title;
        this.url = url;
        this.username = username;
        this.password = password;
        this.notes = notes;
        this.otpAuth = otpAuth;
    }

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getNotes() {
        return notes;
    }
    public String getOtpAuth() {
        return otpAuth;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setOtpAuth(String otpAuth) {
        this.otpAuth = otpAuth;
    }

    @Override
    public String getVaultType() {
        return Constants.VAULT_TYPE_SAFARI;
    }

    @Override
    public int hashCode() {
        return url.hashCode() + username.hashCode() + password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // Consider two entries equal if they have the same URL and username, ignoring password
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IVaultEntry other = (IVaultEntry) obj;
        return url.equals(other.getUrl()) && username.equals(other.getUsername());
    }
}
