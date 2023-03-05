package cuentasBanco;
/**
 * Introduce dos numeros y devuelve el ingreso
 * @author Angel Sanclemente
 * @version 1.0
 * @since 05/03/2023
 **/
public class CuentaBanco {


    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CuentaBanco()
    {
    }

    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**Metodo que devuelve el estado de la cuenta
     * @return Estado de la cuenta
     **/
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa dinero
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * methodo que devuelve el nombre de la persona
	 * @return nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**Modifica el nombre
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**Devuelve la cuenta
	 * @return cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**Modifica la cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**Devuelve el saldo
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}

	/**Modifica el saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**Devuelve el tipo de interes
	 * @return
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**Modifica tipo de interes
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
