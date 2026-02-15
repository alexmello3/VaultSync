package br.com.alexmendonca.vaultsync.cofre;

import br.com.alexmendonca.vaultsync.util.Constantes;

public class LinhaCofreFirefox implements ILinhaCofre {
    private String url;
    private String username;
    private String password;
    private String httpRealm;
    private String formActionOrigin;
    private String guid;
    private String timeCreated;
    private String timeLastUsed;
    private String timePasswordChanged;

    public LinhaCofreFirefox(String url, String username, String password, String httpRealm, String formActionOrigin, String guid, String timeCreated, String timeLastUsed, String timePasswordChanged) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.httpRealm = httpRealm;
        this.formActionOrigin = formActionOrigin;
        this.guid = guid;
        this.timeCreated = timeCreated;
        this.timeLastUsed = timeLastUsed;
        this.timePasswordChanged = timePasswordChanged;
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

    public String getHttpRealm() {
        return httpRealm;
    }

    public String getFormActionOrigin() {
        return formActionOrigin;
    }

    public String getGuid() {
        return guid;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public String getTimeLastUsed() {
        return timeLastUsed;
    }

    public String getTimePasswordChanged() {
        return timePasswordChanged;
    }

    @Override
    public String getTipoCofre() {
        return Constantes.TIPO_COFRE_FIREFOX;
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
