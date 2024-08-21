package com.finances;

import java.time.LocalDate;

public class Depenses {
    private String description;
    private double montant;
    private Categories categorie;
    private LocalDate date;
    public Depenses(String description, double montant, Categories categorie, LocalDate date) {
        this.description = description;
        this.montant = montant;
        this.categorie = categorie;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public Depenses setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getMontant() {
        return montant;
    }

    public Depenses setMontant(double montant) {
        this.montant = montant;
        return this;
    }

    public Categories getCategorie() {
        return categorie;
    }

    public Depenses setCategorie(Categories categorie) {
        this.categorie = categorie;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public Depenses setDate(LocalDate date) {
        this.date = date;
        return this;
    }
}
