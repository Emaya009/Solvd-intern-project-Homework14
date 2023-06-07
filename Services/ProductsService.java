package pharmacy.Services;

import pharmacy.DAOimpl.GenericDAOImpl;
import pharmacy.model.Products;


import java.util.List;

public class ProductsService {
    private GenericDAOImpl<Products> productsGenericDAO;

    public ProductsService(GenericDAOImpl<Products> productsGenericDAO) {
        this.productsGenericDAO = productsGenericDAO;
    }

    public void createProducts(Products products) {
        productsGenericDAO.create(products);
    }

    public Products getProductsById(int id) {
        return productsGenericDAO.getById(id);
    }

    public List<Products> getAllProducts() {
        return productsGenericDAO.getAll();
    }

    public void updateProducts(Products products) {
        productsGenericDAO.update(products);
    }
    public void deleteProducts(Products products) {
        productsGenericDAO.delete(products);
    }
}
