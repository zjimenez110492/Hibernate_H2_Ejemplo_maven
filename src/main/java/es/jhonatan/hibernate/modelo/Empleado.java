package es.jhonatan.hibernate.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")


public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="cod_Empleado",unique=true)
	private long codigo;
	@Column(name="apellido_Empleado")
	private String apellido;
	@Column(name="nombre_Empleado")
	private String nombre;
	@Column(name="Fecha_Nacimiento")
	private Date fechaNacimiento;
	
	public Empleado() {
	}
	public Empleado(long codigo, String apellido, String nombre, Date fechaNacimiento) {
		
		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
}
