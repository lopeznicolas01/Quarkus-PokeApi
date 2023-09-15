package cl.forum.arq.bts.util;

public class GlobalParams {
    private String canal;
    private int device;
    private int requerimiento;
    private String usuario;
    private String token;
    private double instancia;
    private final String canalInstancia = "FINEX";

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getDevice() {
        return device;
    }

    public void setDevice(int device) {
        this.device = device;
    }

    public int getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(int requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getInstancia() {
        return instancia;
    }

    public void setInstancia(double instancia) {
        this.instancia = instancia;
    }

    public String getCanalInstancia() {
        return canalInstancia;
    }
}