package org.vaultsync.adapter;

import org.vaultsync.util.Constantes;

public class LinhaCofreAdapterFactory {
    public static ILinhaCofreAdapter getLinhaCofreAdapter(String tipoCofreSaida) {
        switch (tipoCofreSaida) {
            case Constantes.TIPO_COFRE_FIREFOX:
                return new LinhaCofreFirefoxAdapter();
            case Constantes.TIPO_COFRE_SAFARI:
                return new LinhaCofreSafariAdapter();
            default:
                throw new IllegalArgumentException("Tipo de cofre desconhecido: " + tipoCofreSaida);
        }
    }
}
