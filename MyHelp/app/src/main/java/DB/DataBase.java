package DB;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DataBase {
    public class DbHelper extends SQLiteOpenHelper {

        // Nome do banco de dados
        private static final String DbNome = "ZapDP";

        // Versão do banco
        private static final int DbVersao = 1;

        // Nome da tabela do banco de dados
        public static final String tblContato = "Contatihnos";

        // Construtor
        public DbHelper(Context context) {
            super(context, DbNome, null, DbVersao);
        }

        @Override
        public void onCreate(SQLiteDatabase Db) {
            //comandoSQL
            String Sql = "CREATE TABLE" + tblContato + "Contato integer primary key, " +
                         "Nome text not null, " +
                         "Celular text not null" +
                         "Email text not null)";
            //Executa o comando sql
            Db.execSQL(Sql);
        }
        //Alteração na estrutura de tabela(criando uma nova coluna)
        @Override
        public void onUpgrade(SQLiteDatabase Db, int DbVersion, int newVersion) {
            //Insere um log interno
            Log.w("Atualização do banco", "Versão atual: " + DbVersion + " Nova versão: " + newVersion);

            //Dropa a tabela caso ela exista
            String Sql = "DROP TABLE IF EXISTS" + tblContato;
            Db.execSQL(Sql);

            //Cria a nova tabela
            onCreate(Db);

        }
    }
}