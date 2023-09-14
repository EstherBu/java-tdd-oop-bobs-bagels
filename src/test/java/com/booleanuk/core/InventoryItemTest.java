package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryItemTest {

    @Test
public void testSKU() {
        InventoryItem inventoryItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");

        Assertions.assertEquals("BGLO",inventoryItem.getSKU());
        inventoryItem.setSKU("BGLP");
        Assertions.assertEquals("BGLP", inventoryItem.getSKU());
    }

    @Test
    public void testPrice() {
        InventoryItem inventoryItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");

        Assertions.assertEquals(0.49, inventoryItem.getPrice());
        inventoryItem.setPrice(1.19);
        Assertions.assertEquals(1.19, inventoryItem.getPrice());
    }

    @Test
    public void testName() {
        InventoryItem inventoryItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");

        Assertions.assertEquals("Bagel", inventoryItem.getName());
        inventoryItem.setName("Coffee");
        Assertions.assertEquals("Coffee", inventoryItem.getName());
    }

    @Test
    public void testVariant() {
        InventoryItem inventoryItem = new InventoryItem("BGLO", 0.49, "Bagel", "Onion");

        Assertions.assertEquals("Onion", inventoryItem.getVariant());
        inventoryItem.setVariant("Plain");
        Assertions.assertEquals("Plain", inventoryItem.getVariant());
    }
}
