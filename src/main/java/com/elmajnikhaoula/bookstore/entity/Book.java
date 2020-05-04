package com.elmajnikhaoula.bookstore.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_book")
@Setter
@Getter
@ToString

public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;

	@Column(name="sku")
	private String SKU;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="description")
	private String description ;
	
	@Column(name="unit_price")
	private  BigDecimal unitPrice ;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="active")
	private boolean Active;
	
	@Column(name="units_in_stock")
	private int unitsInStock;
	
	@Column(name="date_created")
	private Date createdOn;
	
	@Column(name="last_updated")
	private Date updatedOn ;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private BookCategory category;


	

}
