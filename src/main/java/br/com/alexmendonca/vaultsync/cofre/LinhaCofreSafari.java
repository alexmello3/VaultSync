package br.com.alexmendonca.vaultsync.cofre;

import br.com.alexmendonca.vaultsync.util.Constantes;

public class LinhaCofreSafari implements ILinhaCofre {
    private String title;
    private String url;
    private String username;
    private String password;
    private String notes;
    private String otpAuth;

    public LinhaCofreSafari(String title, String url, String username, String password, String notes, String otpAuth) {
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
    public String getTipoCofre() {
        return Constantes.TIPO_COFRE_SAFARI;
    }

    @Override
    public int hashCode() {
        return url.hashCode() + username.hashCode() + password.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // Considera duas linhas iguais se tiverem a mesma URL e username, ignorando o password
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ILinhaCofre other = (ILinhaCofre) obj;
        return url.equals(other.getUrl()) && username.equals(other.getUsername());
    }
}
