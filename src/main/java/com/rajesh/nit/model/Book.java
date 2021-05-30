package com.rajesh.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booktab001")
public class Book {
	
@Id	
private Integer bid;
private String bname;
private String bcode;
@Lob
private byte[] bimage;
@Lob
private char[] bdata;

}
