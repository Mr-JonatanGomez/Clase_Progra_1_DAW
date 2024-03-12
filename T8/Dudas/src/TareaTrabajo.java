public class TareaTrabajo extends Tarea {
    private int presupuesto;


    public TareaTrabajo() {}

    public TareaTrabajo(String titulo, String descripcion, boolean completada, int presupuesto) {
        super(titulo, descripcion, completada);
        this.presupuesto = presupuesto;
    }
}
