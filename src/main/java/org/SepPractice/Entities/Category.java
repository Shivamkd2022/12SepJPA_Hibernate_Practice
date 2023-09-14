package org.SepPractice.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Category")
public class Category
{
    @Id
    private String cId;
    private String categoryTitle;

    @ManyToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Product> products;

    public Category() {

    }

    public Category(String cId, String categoryTitle) {
        this.cId = cId;
        this.categoryTitle = categoryTitle;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
