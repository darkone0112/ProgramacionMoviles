package com.example.architectureexample;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = Note.class, version = 1,exportSchema = false)
public abstract class NoteDataBase extends RoomDatabase {
    private static NoteDataBase instance;
    //Accede al Dao
    public abstract NoteDao noteDao();

    public static synchronized NoteDataBase getInstance(Context context){
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    NoteDataBase.class, "note_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallBack)
                    .build();
        }
        return instance;
    }
    private static RoomDatabase.Callback roomCallBack = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };
    private static class PopulateDbAsyncTask extends AsyncTask<Void,Void,Void>{
        private  NoteDao noteDao;

         private PopulateDbAsyncTask(NoteDataBase db){
             noteDao = db.noteDao();
         }

        @Override
        protected Void doInBackground(Void... voids) {
             noteDao.insert(new Note(1,"mi primera base","descripcion",1));
            return null;
        }
    }
}
