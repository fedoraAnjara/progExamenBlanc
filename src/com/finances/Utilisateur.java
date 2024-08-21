package com.finances;

public class Utilisateur {
    private String nom;
    private double budgetMensuel;
    private Depenses depenses;
    public Utilisateur(String nom, double budgetMensuel, Depenses depenses) {
        this.nom = nom;
        this.budgetMensuel = budgetMensuel;
        this.depenses = depenses;
    }

    public String getNom() {
        return nom;
    }

    public Utilisateur setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }

    public Utilisateur setBudgetMensuel(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
        return this;
    }

    public Depenses getDepenses() {
        return depenses;
    }

    public Utilisateur setDepenses(Depenses depenses) {
        this.depenses = depenses;
        return this;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "nom='" + nom + '\'' +
                ", budgetMensuel=" + budgetMensuel +
                ", depenses=" + depenses +
                '}';
    }
}
