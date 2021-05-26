package org.zakharko.ihor.quadratic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quadratic")
public class Quadratic {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	private int a;
	private int b;
	private int c;
	private Double x1;
	private Double x2;
	
	public Quadratic() {}
	
	public Quadratic(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public Double getX1() {
		return x1;
	}

	public void setX1(Double x1) {
		this.x1 = x1;
	}

	public Double getX2() {
		return x2;
	}

	public void setX2(Double x2) {
		this.x2 = x2;
	}

	@Override
	public String toString() {
		return "Quadratic [id=" + id + ", a=" + a + ", b=" + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2 + "]";
	}
	
	
}
