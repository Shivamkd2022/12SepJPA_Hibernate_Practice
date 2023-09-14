package org.SepPractice.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product
{
    @Id
    private String pId;
    private String ProductName;
    @ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
    private List<Category> categories;

    public Product() {
    }

    public Product(String pId, String productName) {
        this.pId = pId;
        ProductName = productName;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return ProductName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setProductName(String productName) {
        ProductName = productName;

    }
}
