package pe.edu.unsch.entities;
// Generated 25/07/2018 02:02:51 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Compra generated by hbm2java
 */
@Entity
@Table(name = "compra", catalog = "artesaniashop")
public class Compra implements java.io.Serializable {

	private int idcompra;
	private Cuenta cuenta;
	private String nombre;
	private String fecha;
	private String estado;
	private Set<Detallecompra> detallecompras = new HashSet<Detallecompra>(0);

	public Compra() {
	}

	public Compra(int idcompra, Cuenta cuenta) {
		this.idcompra = idcompra;
		this.cuenta = cuenta;
	}

	public Compra(int idcompra, Cuenta cuenta, String nombre, String fecha, String estado,
			Set<Detallecompra> detallecompras) {
		this.idcompra = idcompra;
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.fecha = fecha;
		this.estado = estado;
		this.detallecompras = detallecompras;
	}

	@Id
	@Column(name = "idcompra", unique = true, nullable = false)
	public int getIdcompra() {
		return this.idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario", nullable = false)
	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Column(name = "nombre", length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "fecha", length = 45)
	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Column(name = "estado", length = 45)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compra")
	public Set<Detallecompra> getDetallecompras() {
		return this.detallecompras;
	}

	public void setDetallecompras(Set<Detallecompra> detallecompras) {
		this.detallecompras = detallecompras;
	}

}
