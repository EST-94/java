package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // jpa
@Table(name = "tester")// jpa
@Data// lombok
@AllArgsConstructor// lombok
@NoArgsConstructor// lombok

public class DemoData implements Serializable {

    @Id// jpa
    @Column(name = "NAME", length = 255, nullable = false)// jpa
    private String thisIsName;
	

}
