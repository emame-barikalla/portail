package com.portail.DemandeAttestation.enumeration;

public enum Statut {
    accepte("accepte"),
    refuse("refuse"),
    en_cours("en cours");
    private final String statut;
    Statut(String statut) {
        this.statut = statut;
    }
    public String getStatut() {
        return this.statut;
    }
}
