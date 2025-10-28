package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Revision {
    private String fecha;
    private String diagnostico;
    private List<Medicamento> listMedicamento;

    public Revision(String fecha, String diagnostico) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.listMedicamento = new ArrayList<Medicamento>();

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Medicamento> getListMedicamento() {
        return listMedicamento;
    }

    public void setListMedicamento(List<Medicamento> listMedicamento) {
        this.listMedicamento = listMedicamento;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "fecha='" + fecha + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", listMedicamento=" + listMedicamento +
                '}';
    }
}
