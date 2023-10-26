package com.bookstoreapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Valid
public class Book {

	@Id
	private int id;

	@NotBlank(message = "Title is required")
	@Size(max = 100, message = "Title should not exceed 100 characters")
	private String title;

	@NotBlank(message = "Author name is required")
	@Size(max = 200, message = "Author name should not exceed 200 characters")
	private String author;

	@Max(9999)
	@Min(1000)
	private int publicationYear;
	
	@Column(unique = true)
	@Min(1000000000l)
	@Max(9999999999999l)
	private long isbn;

	@Positive(message = "The price should be a positive decimal value.")
	@DecimalMin(value = "0.01", message = "Price must be a positive decimal value")
	private double price;

}
