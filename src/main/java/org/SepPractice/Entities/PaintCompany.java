package org.SepPractice.Entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Paint_Company")
public class PaintCompany
{
    @Id
    private int id;
    private int branches;
    private String name;
    private String address;
    @OneToOne
    @JoinColumn(name = "GST_NO.")
    private GstDetails gstDetails;
    @OneToMany(mappedBy = "paintCompany",cascade = CascadeType.ALL)
    private List<PaintComapnyBranches> paintComapnyBranchesList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranches() {
        return branches;
    }

    public void setBranches(int branches) {
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<PaintComapnyBranches> getPaintComapnyBranchesList() {
        return paintComapnyBranchesList;
    }

    public void setPaintComapnyBranchesList(List<PaintComapnyBranches> paintComapnyBranchesList) {
        this.paintComapnyBranchesList = paintComapnyBranchesList;
    }

    public PaintCompany(int id, int branches, String name, String address) {
        this.id = id;
        this.branches = branches;
        this.name = name;
        this.address = address;
    }

    public GstDetails getGstDetails() {
        return gstDetails;
    }

    public void setGstDetails(GstDetails gstDetails) {
        this.gstDetails = gstDetails;
    }

    public PaintCompany() {
    }

    @Override
    public String toString() {
        return "PaintCompany{" +
                "id=" + id +
                ", branches=" + branches +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gstDetails=" + gstDetails +
                ", paintComapnyBranchesList=" + paintComapnyBranchesList +
                '}';
    }
}
