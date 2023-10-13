package Controller;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import DB.DataTable;
import Model.Pacientes;

public class pacientesDAO {

    private SQLiteDatabase db;
    private DataTable table;

    public pacientesDAO(Context context) {

        table = new DataTable(context);
    }

    //Abrir
    public void Abrir() {
        db = table.getReadableDatabase();
    }

    //Fechar
    public void Fechar() {
        db.close();
    }

    //Inserir
    public Long Inserir(Pacientes pacientes) {
        ContentValues dados = new ContentValues();
        dados.put("Nome", pacientes.getNome());
        dados.put("Sexo", pacientes.getSexo());
        dados.put("Altura", pacientes.getAltura());
        dados.put("Peso", pacientes.getPeso());

        Long sqlid = db.insert(DataTable.tblPacientes, null, dados);

        return sqlid;
    }

    public List<Pacientes> Listar() {
        List<Pacientes> lista = new ArrayList<Pacientes>();

        //Campos da tabela
        String campos[] = new String[]{"Nome", "Sexo", "Altura", "Peso"};

        Cursor resultado = db.query(DataTable.tblPacientes, campos, null, null, null, null, "Nome");

        resultado.moveToNext();

        //Percorre a tabela e adiciona os valores na lista
        while (!resultado.isAfterLast()) {
            Pacientes pacientes = new Pacientes(resultado.getString(0),
                    resultado.getString(1),
                    resultado.getString(2),
                    resultado.getString(3));

            lista.add(pacientes);
            resultado.moveToNext();
        }
        resultado.close();

        return lista;
    }

}
