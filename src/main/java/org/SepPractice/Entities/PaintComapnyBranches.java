package org.SepPractice.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="paint_company_branches")
public class PaintComapnyBranches
{
    @Id
    private int branchId;
    private String location;
    private String branchManager;
    @ManyToOne
    @JoinColumn(name="paint_company_id")
    private PaintCompany paintCompany;

    public PaintComapnyBranches() {
    }

    public PaintComapnyBranches(int branchId, String location, String branchManager) {
        this.branchId = branchId;
        this.location = location;
        this.branchManager = branchManager;
    }

    public PaintCompany getPaintCompany() {
        return paintCompany;
    }

    public void setPaintCompany(PaintCompany paintCompany) {
        this.paintCompany = paintCompany;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }
}
