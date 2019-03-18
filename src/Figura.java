public abstract class Figura {

    protected String tipoFigura;

    protected Figura(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }


    abstract void pintar();
}
