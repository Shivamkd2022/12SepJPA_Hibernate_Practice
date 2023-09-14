package org.SepPractice;

import org.SepPractice.Entities.*;
import org.SepPractice.Repositories.*;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaPracticeApplication implements CommandLineRunner
{
	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

@Autowired
	private GstDetailsRepo gstDetailsRepo;
@Autowired
	private PaintCompanyRepo paintCompanyRepo;
@Autowired
	private PaintCompanyBranchesRepo paintCompanyBranchesRepo;

	public static void main(String[] args)
	{
		System.out.println("Good Morning ");
		SpringApplication.run(JpaPracticeApplication.class, args);
	}

	@Override
	public void run(String ...args) throws Exception
	{
//		GstDetails gd1 = new GstDetails("UPSLPCD8392D1Z", "4SLF94EO2", "MUMBAI");
//		GstDetails gd2 = new GstDetails("DLTUOSA12943E9R", "5893FKDLOSD", "DELHI");
//		gstDetailsRepo.save(gd1);
//		gstDetailsRepo.save(gd2);

//		GstDetails gd3 = new GstDetails("VISD4930UO9T", "8930JFJFN7", "INDORE");
//		PaintCompany pc1 = new PaintCompany(59499, 35, "Asian Paints", "Dehradun");
//		gd3.setPaintCompanyDetails(pc1);
//		pc1.setGstDetails(gd3);
//		gstDetailsRepo.save(gd3);
		//manually paintComapnyDetails save by using PaintCompanyDetailsRepository, otherwise use cascade in
		//GstDetails class

//		GstDetails f1 = gstDetailsRepo.findById("VISD4930UO9T").get();
//		System.out.println(f1);
//		System.out.println(f1.getPaintCompanyDetails());



		//one to many
//		GstDetails gd3 = new GstDetails("MHTNXOS1139I2Q", "294YRFGDS2", "KOLKATA");
//		PaintCompany pc2 = new PaintCompany(4839, 11, "Nerolac Paints", "Bengalore");
//		gd3.setPaintCompanyDetails(pc2);
//		pc2.setGstDetails(gd3);
//
//
//
//		PaintComapnyBranches b1 = new PaintComapnyBranches(27, "Kanpur", "Harish Mishra");
//		b1.setPaintCompany(pc2);
//
//
//		PaintComapnyBranches b2 = new PaintComapnyBranches(29, "Chandigarh", "Sukhvinder Ahuja");
//		b2.setPaintCompany(pc2);
//
//		PaintComapnyBranches b3 = new PaintComapnyBranches(31, "Indore", "Pawan Tripathi");
//		b3.setPaintCompany(pc2);
//
//
//		List<PaintComapnyBranches> paintComapnyBranchesList= new ArrayList<>();
//		paintComapnyBranchesList.add(b1);
//		paintComapnyBranchesList.add(b2);
//		paintComapnyBranchesList.add(b3);
//
//		pc2.setPaintComapnyBranchesList(paintComapnyBranchesList);
//
//
//
//		paintCompanyRepo.save(pc2);
//		//gstDetailsRepo.save(gd3);
//		paintCompanyBranchesRepo.save(b1);
//		paintCompanyBranchesRepo.save(b2);
//		paintCompanyBranchesRepo.save(b3);
//



			// Many to Many

//		Product p1 = new Product("p192", "Redmi Note 14 pro Max");
//		Product p2= new Product("r392","Samsung y3 washing machine");
//		Product p3 = new Product("p492", "One plus r234 5G");
//
//
//		Category c1 = new Category("c473", "Electronics");
//		Category c2 = new Category("u382", "Mobiles");
//		Category c3 = new Category("h83", "Washing Machines");
//
//		List<Product> productListC1= new ArrayList<>();
//		productListC1.add(p1);
//		productListC1.add(p2);
//		productListC1.add(p3);
//
//		c1.setProducts(productListC1);
//
//		List<Product> productListC2= new ArrayList<>();
//		productListC2.add(p1);
//		productListC2.add(p3);
//		c2.setProducts(productListC2);
//
//		List<Product>productListC3= new ArrayList<>();
//		productListC3.add(p2);
//		c3.setProducts(productListC3);
//
//		categoryRepo.save(c1);
//		categoryRepo.save(c2);
//		categoryRepo.save(c3);

		Category c473 = categoryRepo.findById("c473").get();
		System.out.println("this category belongs to "+c473.getProducts().size()+" products");

		// please provide fetch= fetchtype.EAGER in Category class otherwise it will not extract products from categories.

		Category u382 = categoryRepo.findById("u382").get();
		System.out.println("this category belongs to "+u382.getProducts().size()+" products[");
		// please provide fetch= fetchtype.EAGER in Product class otherwise it will not extract categories from products.


		Product p192 = productRepo.findById("p192").get();
		System.out.println("this product belongs to "+p192.getCategories().size()+" categories");

	}

}
