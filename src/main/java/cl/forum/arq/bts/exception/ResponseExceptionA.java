package cl.forum.arq.bts.exception;

public class ResponseExceptionA extends Exception {

	private static final long serialVersionUID = 1L;
    protected final StatusResponseEnum statusResponseEnum;
    protected final boolean handled;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * ResponseException Respuesta generica cuando se produce una excepcion
     *
     * @param message
     * @param codigo
     * @return field
     * @autor Arquitectura
     */
    //@Param responseStatusEnum
    public ResponseExceptionA(String message, int codigo) {
        super(message);
        this.statusResponseEnum = StatusResponseEnum.INTERNAL_SERVER_ERROR;
        this.handled = false;
        this.codigo = codigo;

    }

    /**
     * ResponseException Respuesta controlada generica cuando se produce una
     * excepcion
     *
     * @param message
     * @param responseStatusEnum
     * @param handled
     * @return field
     * @autor Arquitectura
     */
    public ResponseExceptionA(String message, StatusResponseEnum responseStatusEnum, boolean handled) {
        super(message);
        this.statusResponseEnum = responseStatusEnum;
        this.handled = handled;
    }

    public StatusResponseEnum getStatusResponseEnum() {
        return statusResponseEnum;
    }

    public boolean isHandled() {
        return handled;
    }

}
