package com.radaracciones.model;

public class Accion {

    // Identificación
    private String ticker;
    private String nombre;
    private String pais;
    private String sector;
    private String industria;
    private String moneda;
    private String exchange;
    private String mesesPagoDividendo;
    private String enlace;
    private String fechaUltimaActualizacion;

    // Cotización y técnico
    private double precioActual;
    private double capitalizacionMercado;
    private double maximo52Semanas;
    private double minimo52Semanas;
    private double mediaMovil1000;
    private double margenMediaMovil;
    private double cambioDiario;
    private double cambioDiarioPct;
    private double beta;

    // Dividendo
    private double dividendoAnual;
    private double rentabilidadDividendo;
    private double rentabilidadDividendoMedia5a;
    private double crecimientoDividendo3a;
    private double crecimientoDividendo5a;
    private double crecimientoDividendo10a;
    private double yocEstimado5a;
    private boolean esREIT;

    // Valoración
    private double per;
    private double perMedioSector;
    private double perHistorico5a;
    private double bpa;
    private double fcfPorAccion;
    private double precioLibro;

    // Payout
    private double payoutBpa;
    private double payoutFcf;

    // Deuda y rentabilidad
    private double deudaNeta;
    private double ebitda;
    private double deudaSobreActivosPct;
    private double margenBeneficioNeto;
    private double ingresosNetos;
    private double accionesEnCirculacion;

    // Crecimiento histórico
    private double crecimientoIngresos3a;
    private double crecimientoIngresos5a;
    private double crecimientoBpa3a;
    private double crecimientoBpa5a;
    private double crecimientoMargenBeneficioNeto5a;

    // Resultado
    private String veredicto;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getMesesPagoDividendo() {
        return mesesPagoDividendo;
    }

    public void setMesesPagoDividendo(String mesesPagoDividendo) {
        this.mesesPagoDividendo = mesesPagoDividendo;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(String fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public double getCapitalizacionMercado() {
        return capitalizacionMercado;
    }

    public void setCapitalizacionMercado(double capitalizacionMercado) {
        this.capitalizacionMercado = capitalizacionMercado;
    }

    public double getMaximo52Semanas() {
        return maximo52Semanas;
    }

    public void setMaximo52Semanas(double maximo52Semanas) {
        this.maximo52Semanas = maximo52Semanas;
    }

    public double getMinimo52Semanas() {
        return minimo52Semanas;
    }

    public void setMinimo52Semanas(double minimo52Semanas) {
        this.minimo52Semanas = minimo52Semanas;
    }

    public double getMediaMovil1000() {
        return mediaMovil1000;
    }

    public void setMediaMovil1000(double mediaMovil1000) {
        this.mediaMovil1000 = mediaMovil1000;
    }

    public double getMargenMediaMovil() {
        return margenMediaMovil;
    }

    public void setMargenMediaMovil(double margenMediaMovil) {
        this.margenMediaMovil = margenMediaMovil;
    }

    public double getCambioDiario() {
        return cambioDiario;
    }

    public void setCambioDiario(double cambioDiario) {
        this.cambioDiario = cambioDiario;
    }

    public double getCambioDiarioPct() {
        return cambioDiarioPct;
    }

    public void setCambioDiarioPct(double cambioDiarioPct) {
        this.cambioDiarioPct = cambioDiarioPct;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getDividendoAnual() {
        return dividendoAnual;
    }

    public void setDividendoAnual(double dividendoAnual) {
        this.dividendoAnual = dividendoAnual;
    }

    public double getRentabilidadDividendo() {
        return rentabilidadDividendo;
    }

    public void setRentabilidadDividendo(double rentabilidadDividendo) {
        this.rentabilidadDividendo = rentabilidadDividendo;
    }

    public double getRentabilidadDividendoMedia5a() {
        return rentabilidadDividendoMedia5a;
    }

    public void setRentabilidadDividendoMedia5a(double rentabilidadDividendoMedia5a) {
        this.rentabilidadDividendoMedia5a = rentabilidadDividendoMedia5a;
    }

    public double getCrecimientoDividendo3a() {
        return crecimientoDividendo3a;
    }

    public void setCrecimientoDividendo3a(double crecimientoDividendo3a) {
        this.crecimientoDividendo3a = crecimientoDividendo3a;
    }

    public double getCrecimientoDividendo5a() {
        return crecimientoDividendo5a;
    }

    public void setCrecimientoDividendo5a(double crecimientoDividendo5a) {
        this.crecimientoDividendo5a = crecimientoDividendo5a;
    }

    public double getCrecimientoDividendo10a() {
        return crecimientoDividendo10a;
    }

    public void setCrecimientoDividendo10a(double crecimientoDividendo10a) {
        this.crecimientoDividendo10a = crecimientoDividendo10a;
    }

    public double getYocEstimado5a() {
        return yocEstimado5a;
    }

    public void setYocEstimado5a(double yocEstimado5a) {
        this.yocEstimado5a = yocEstimado5a;
    }

    public boolean isEsREIT() {
        return esREIT;
    }

    public void setEsREIT(boolean esREIT) {
        this.esREIT = esREIT;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public double getPerMedioSector() {
        return perMedioSector;
    }

    public void setPerMedioSector(double perMedioSector) {
        this.perMedioSector = perMedioSector;
    }

    public double getPerHistorico5a() {
        return perHistorico5a;
    }

    public void setPerHistorico5a(double perHistorico5a) {
        this.perHistorico5a = perHistorico5a;
    }

    public double getBpa() {
        return bpa;
    }

    public void setBpa(double bpa) {
        this.bpa = bpa;
    }

    public double getFcfPorAccion() {
        return fcfPorAccion;
    }

    public void setFcfPorAccion(double fcfPorAccion) {
        this.fcfPorAccion = fcfPorAccion;
    }

    public double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        this.precioLibro = precioLibro;
    }

    public double getPayoutBpa() {
        return payoutBpa;
    }

    public void setPayoutBpa(double payoutBpa) {
        this.payoutBpa = payoutBpa;
    }

    public double getPayoutFcf() {
        return payoutFcf;
    }

    public void setPayoutFcf(double payoutFcf) {
        this.payoutFcf = payoutFcf;
    }

    public double getDeudaNeta() {
        return deudaNeta;
    }

    public void setDeudaNeta(double deudaNeta) {
        this.deudaNeta = deudaNeta;
    }

    public double getEbitda() {
        return ebitda;
    }

    public void setEbitda(double ebitda) {
        this.ebitda = ebitda;
    }

    public double getDeudaSobreActivosPct() {
        return deudaSobreActivosPct;
    }

    public void setDeudaSobreActivosPct(double deudaSobreActivosPct) {
        this.deudaSobreActivosPct = deudaSobreActivosPct;
    }

    public double getMargenBeneficioNeto() {
        return margenBeneficioNeto;
    }

    public void setMargenBeneficioNeto(double margenBeneficioNeto) {
        this.margenBeneficioNeto = margenBeneficioNeto;
    }

    public double getIngresosNetos() {
        return ingresosNetos;
    }

    public void setIngresosNetos(double ingresosNetos) {
        this.ingresosNetos = ingresosNetos;
    }

    public double getAccionesEnCirculacion() {
        return accionesEnCirculacion;
    }

    public void setAccionesEnCirculacion(double accionesEnCirculacion) {
        this.accionesEnCirculacion = accionesEnCirculacion;
    }

    public double getCrecimientoIngresos3a() {
        return crecimientoIngresos3a;
    }

    public void setCrecimientoIngresos3a(double crecimientoIngresos3a) {
        this.crecimientoIngresos3a = crecimientoIngresos3a;
    }

    public double getCrecimientoIngresos5a() {
        return crecimientoIngresos5a;
    }

    public void setCrecimientoIngresos5a(double crecimientoIngresos5a) {
        this.crecimientoIngresos5a = crecimientoIngresos5a;
    }

    public double getCrecimientoBpa3a() {
        return crecimientoBpa3a;
    }

    public void setCrecimientoBpa3a(double crecimientoBpa3a) {
        this.crecimientoBpa3a = crecimientoBpa3a;
    }

    public double getCrecimientoBpa5a() {
        return crecimientoBpa5a;
    }

    public void setCrecimientoBpa5a(double crecimientoBpa5a) {
        this.crecimientoBpa5a = crecimientoBpa5a;
    }

    public double getCrecimientoMargenBeneficioNeto5a() {
        return crecimientoMargenBeneficioNeto5a;
    }

    public void setCrecimientoMargenBeneficioNeto5a(double crecimientoMargenBeneficioNeto5a) {
        this.crecimientoMargenBeneficioNeto5a = crecimientoMargenBeneficioNeto5a;
    }

    public String getVeredicto() {
        return veredicto;
    }

    public void setVeredicto(String veredicto) {
        this.veredicto = veredicto;
    }

    public void evaluarChecklist() {

        // 1. Comprobamos endeudamiento primero (tiene prioridad sobre lo demás)
        double deudaSobreEbitda = ebitda != 0 ? deudaNeta / ebitda : 0;
        if (deudaSobreEbitda > 3.0 && !esREIT) {
            this.veredicto = "ENDEUDADO";
            return;
        }

        // 2. Comprobamos si falla algún fundamental clave
        boolean payoutMal = (!esREIT && payoutBpa > 60) || (!esREIT && payoutFcf > 60);
        boolean crecimientoMal = crecimientoDividendo5a < -10 || crecimientoBpa5a < -10;
        boolean rentabilidadPorDebajoMedia = rentabilidadDividendo < rentabilidadDividendoMedia5a;

        if (payoutMal || crecimientoMal || rentabilidadPorDebajoMedia) {
            this.veredicto = "MAL";
            return;
        }

        // 3. Los fundamentales están bien. Ahora miramos el precio (técnico)
        if (precioActual > mediaMovil1000) {
            this.veredicto = "PENDIENTE";
        } else {
            this.veredicto = "OK";
        }
    }
}