package com.radaracciones.model;

public class Main {
    public static void main(String[] args) {

        Accion iberdrola = new Accion();
        iberdrola.setTicker("IBE");
        iberdrola.setNombre("Iberdrola");
        iberdrola.setPrecioActual(11.5);
        iberdrola.setMediaMovil1000(12.0);
        iberdrola.setRentabilidadDividendo(4.2);
        iberdrola.setRentabilidadDividendoMedia5a(3.8);
        iberdrola.setPayoutBpa(55);
        iberdrola.setPayoutFcf(58);
        iberdrola.setCrecimientoDividendo5a(6.5);
        iberdrola.setCrecimientoBpa5a(4.0);
        iberdrola.setDeudaNeta(45000);
        iberdrola.setEbitda(18000);
        iberdrola.setEsREIT(false);

        iberdrola.evaluarChecklist();

        System.out.println("Ticker: " + iberdrola.getTicker());
        System.out.println("Veredicto: " + iberdrola.getVeredicto());
    }
}
