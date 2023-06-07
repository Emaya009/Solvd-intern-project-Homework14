package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Inventory;

import java.util.List;

public class InventoryService {
    private GenericDAOImpl<Inventory> inventoryGenericDAO;

    public InventoryService(GenericDAOImpl<Inventory> inventoryGenericDAO) {
        this.inventoryGenericDAO = inventoryGenericDAO;
    }

    public void createInventory(Inventory inventory) {
        inventoryGenericDAO.create(inventory);
    }

    public Inventory getInventoryById(int id) {
        return inventoryGenericDAO.getById(id);
    }

    public List<Inventory> getAllInventory() {
        return inventoryGenericDAO.getAll();
    }

    public void updateInventory(Inventory inventory) {
        inventoryGenericDAO.update(inventory);
    }

    public void deleteInventory(Inventory inventory) {
        inventoryGenericDAO.delete(inventory);
    }
}
