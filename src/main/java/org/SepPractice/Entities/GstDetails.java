package org.SepPractice.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="GST_Details")
public class GstDetails
{
    @Id
    private String gstNo;
    private String tan;
    private String region;
    @OneToOne(mappedBy = "gstDetails",cascade = CascadeType.ALL)

    private PaintCompany paintCompanyDetails;


    public GstDetails() {
    }

    public GstDetails(String gstNo, String tan, String region) {
        this.gstNo = gstNo;
        this.tan = tan;
        this.region = region;
    }

    public String getGstNo() {
        return gstNo;
    }

    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }

    public String getTan() {
        return tan;
    }

    public void setTan(String tan) {
        this.tan = tan;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PaintCompany getPaintCompanyDetails() {
        return paintCompanyDetails;
    }

    public void setPaintCompanyDetails(PaintCompany paintCompanyDetails) {
        this.paintCompanyDetails = paintCompanyDetails;
    }

    @Override
    public String toString() {
        return "GstDetails{" +
                "gstNo='" + gstNo + '\'' +
                ", tan='" + tan + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
