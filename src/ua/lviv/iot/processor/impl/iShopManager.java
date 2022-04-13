package ua.lviv.iot.processor.impl;

import ua.lviv.iot.model.Product;

public interface iShopManager {
    void addProductToTheList(Product product);

    void deleteProductFromTheList(Product product);

    void sortListBYPrice();

    void sortListByVolume();

    void printListOfProduct();

    void findProductByProductType();
}
