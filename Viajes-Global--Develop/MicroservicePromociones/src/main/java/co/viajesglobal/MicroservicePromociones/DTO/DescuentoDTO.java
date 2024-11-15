package co.viajesglobal.MicroservicePromociones.DTO;

public class DescuentoDTO {
    private String cupon;
    private double porcentajeDescuento;
    private boolean activo;
    private String descripcion;

    public DescuentoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getCupon() {
		return cupon;
	}

	public void setCupon(String cupon) {
		this.cupon = cupon;
	}

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public DescuentoDTO(String cupon, double porcentajeDescuento, boolean activo, String descripcion) {
		super();
		this.cupon = cupon;
		this.porcentajeDescuento = porcentajeDescuento;
		this.activo = activo;
		descripcion = descripcion;
	}

}
