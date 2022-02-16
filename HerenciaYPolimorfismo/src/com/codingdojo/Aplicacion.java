package com.codingdojo;

public class Aplicacion {
	public static void main( String args[] ) {
		CuentaBancaria cuentaAlex = new CuentaBancaria( 0.0, "Alex Martinez", 12345 );
		CuentaCredito cuentaMartha = new CuentaCredito( 0.0, "Martha Sanchez", 28374, 10000.0, 0.08 );
		
		cuentaAlex.depositar( 1000.0 );
		System.out.println( cuentaAlex.toString() );
		cuentaMartha.retirar( 5000.0 );
		cuentaMartha.retirar( 3000.0 );
		cuentaMartha.retirar( 4000.0 );
		System.out.println( cuentaMartha.toString() );
		
	}
}
