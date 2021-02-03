package com.devops.dxc.devops.model;

import java.io.Serializable;

public class Dxc implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2988002029080131424L;

	private int dxc;
	private int saldo;
	private int impuesto;
	private int sueldo;
	private int ahorro;

	public Dxc(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
		this.dxc = Util.getDxc(ahorro, sueldo);
	}

	public Dxc() {
	}

	public int getDxc() {
		return dxc;
	}

	public void setDxc(int dxc) {
		this.dxc = dxc;
	}

	public int getSaldo() {
		return this.getAhorro() - this.getDxc();
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getImpuesto() {
		// referencia
		// https://www.sii.cl/valores_y_fechas/impuesto_2da_categoria/impuesto2020.htm
		// https://www.13.cl/programas/servicios-13/servicios/segundo-retiro-del-10-cuanto-debo-pagar-de-impuesto
		// http://localhost:8080/rest/msdxc/dxc?sueldo=2000000&ahorro=43000000
		double factor = 1;
		if (sueldo <= 1530870) {
			return impuesto;
		} else if (1530870 < sueldo && sueldo <= 2551450) {
			factor = 0.08;
		} else if (2551450 < sueldo && sueldo <= 3572030) {
			factor = 0.135;
		} else if (3572030 < sueldo && sueldo <= 4592610) {
			factor = 0.23;
		} else if (4592610 < sueldo && sueldo <= 6123480) {
			factor = 0.304;
		} else if (6123480 < sueldo && sueldo <= 15818990) {
			factor = 0.35;
		} else if (15818990 < sueldo) {
			factor = 0.4;
		}
		return (int) Math.round(this.dxc * factor);
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAhorro() {
		return ahorro;
	}

	public void setAhorro(int ahorro) {
		this.ahorro = ahorro;
	}
}
