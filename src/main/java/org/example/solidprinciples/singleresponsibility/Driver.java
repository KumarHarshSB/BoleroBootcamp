package org.example.solidprinciples.singleresponsibility;

public class Driver {
    public static void main(String[] args) {
        Baker baker = new Baker();
        baker.bakeBread();
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.manageInventory();
        Seller seller = new Seller();
        seller.sellBread();
    }
}
