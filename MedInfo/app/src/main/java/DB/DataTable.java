package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DataTable extends SQLiteOpenHelper {

    //Nome do banco de dados
    private static final String DataTable = "DataTable";

    // Versão do banco
    private static final int DbVersionn = 1;

    //Nome da tabela de pacientes
    public static final String tblPacientes = "Pacientes";

    //Construtor
    public DataTable(Context context){
        super(context, DataTable, null, DbVersionn);
    }
    @Override
    public void onCreate(SQLiteDatabase Db) {
        //Criando a tabela
        String Sql = "CREATE TABLE " + tblPacientes + "(Codigo integer primary key autoincrement, " +
                     "Nome   text not null, " +
                     "Sexo   text not null, " +
                     "Altura text not null, " +
                     "Peso   text not null)";
        Db.execSQL(Sql);
    }

    //Alteração na tabela caso ela não exista
    @Override
    public void onUpgrade(SQLiteDatabase Db, int DbVersion, int newVersion) {
        //Insere um log na tabela
        Log.w("Atualização do banco", + DbVersion + " Nova versão: " + newVersion);

        //Dropa a tabela caso ela não exista
        String Sql = "DROP TABLE IF EXISTS " + tblPacientes;
        Db.execSQL(Sql);

        //Cria uma nova tabela
        onCreate(Db);
    }
}
