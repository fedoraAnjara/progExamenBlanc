package com.finances;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private String nom;
    private double budgetMensuel;
    private List<Depenses> depenses;
    public Utilisateur(String nom, double budgetMensuel, Depenses depenses) {
        this.nom = nom;
        this.budgetMensuel = budgetMensuel;
        this.depenses =  new ArrayList<>();
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

    public List<Depenses> getDepenses() {
        return depenses;
    }

    public Utilisateur setDepenses(List<Depenses> depenses) {
        this.depenses = depenses;
        return this;
    }

    public void addExpense(Depenses depenses) {
        if (depenses.getMontant() > 0) {
            this.depenses.add(depenses);
        } else {
            System.out.println("Le montant de la dépense doit être positif.");
        }
    }

    public List<Depenses> getExpenseByCategory(Categories category) {
        return depenses.stream()
                .filter(depenses -> depenses.getCategorie() == category)
                .toList();
    }

    public double getTotalSpentThisMonth() {
        LocalDate now = LocalDate.now();
        return depenses.stream()
                .filter(depenses -> depenses.getDate().getMonth() == now.getMonth())
                .mapToDouble(Depenses::getMontant)
                .sum();
    }
}
