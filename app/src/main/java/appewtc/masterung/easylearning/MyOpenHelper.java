package appewtc.masterung.easylearning;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 11/25/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    //Explicit
    private static final String DATABASE_NAME = "learn.db";
    private static final int DATABASE_VERSION = 1;

    private static final String CREATE_USER_TABLE = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text, " +
            "Name text, " +
            "LastDate text, " +
            "Score text);";

    private static final String CREATE_CONTENT_TABLE = "create table contentTABLE (" +
            "_id integer primary key, " +
            "Video text, " +
            "PathVideo text, " +
            "IconVideo text);";

    private static final String CREATE_EXERCISE_TABLE = "create table exerciseTABLE (" +
            "_id integer primary key, " +
            "Question text, " +
            "Choice1 text, " +
            "Choice2 text, " +
            "Choice3 text, " +
            "Choice4 text);";


    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_CONTENT_TABLE);
        db.execSQL(CREATE_EXERCISE_TABLE);

        //For userTABlE
        String[] strUser = new String[10];
        strUser[0] = "insert into userTABLE values(null, 'user1', '12345', 'มาสเตอร์ อึ่ง', 'n/a', 'n/a');";
        strUser[1] = "insert into userTABLE values(null, 'user2', '12345', 'มาสเตอร์ อึ่ง2', 'n/a', 'n/a');";
        strUser[2] = "insert into userTABLE values(null, 'user3', '12345', 'มาสเตอร์ อึ่ง3', 'n/a', 'n/a');";
        strUser[3] = "insert into userTABLE values(null, 'user4', '12345', 'มาสเตอร์ อึ่ง4', 'n/a', 'n/a');";
        strUser[4] = "insert into userTABLE values(null, 'user5', '12345', 'มาสเตอร์ อึ่ง5', 'n/a', 'n/a');";
        strUser[5] = "insert into userTABLE values(null, 'user6', '12345', 'มาสเตอร์ อึ่ง6', 'n/a', 'n/a');";
        strUser[6] = "insert into userTABLE values(null, 'user7', '12345', 'มาสเตอร์ อึ่ง7', 'n/a', 'n/a');";
        strUser[7] = "insert into userTABLE values(null, 'user8', '12345', 'มาสเตอร์ อึ่ง8', 'n/a', 'n/a');";
        strUser[8] = "insert into userTABLE values(null, 'user9', '12345', 'มาสเตอร์ อึ่ง9', 'n/a', 'n/a');";
        strUser[9] = "insert into userTABLE values(null, 'user10', '12345', 'มาสเตอร์ อึ่ง10', 'n/a', 'n/a');";

        for (int i = 0; i < strUser.length; i++) {
            db.execSQL(strUser[i]);
        }   //for

        //For contentTABLE
        String[] strContent = new String[10];
        strContent[0] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 1', '1', '1');";
        strContent[1] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 2', '2', '2');";
        strContent[2] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 3', '3', '3');";
        strContent[3] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 4', '4', '4');";
        strContent[4] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 5', '5', '5');";
        strContent[5] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 6', '6', '6');";
        strContent[6] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 7', '7', '7');";
        strContent[7] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 8', '8', '8');";
        strContent[8] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 9', '9', '9');";
        strContent[9] = "insert into contentTABLE values(null, 'ชื่อของวีดีโอที่ 10', '10', '10');";

        for (int i = 0; i < strContent.length; i++) {
            db.execSQL(strContent[i]);
        }   //for

        //For exerciseTABLE
        String[] strExercise = new String[10];
        strExercise[0] = "insert into exerciseTABLE values(null, '1. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[1] = "insert into exerciseTABLE values(null, '2. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[2] = "insert into exerciseTABLE values(null, '3. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[3] = "insert into exerciseTABLE values(null, '4. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[4] = "insert into exerciseTABLE values(null, '5. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[5] = "insert into exerciseTABLE values(null, '6. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[6] = "insert into exerciseTABLE values(null, '7. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[7] = "insert into exerciseTABLE values(null, '8. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[8] = "insert into exerciseTABLE values(null, '9. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";
        strExercise[9] = "insert into exerciseTABLE values(null, '10. นี่คืออะไร ?', 'ช้อยเลือกที่ 1', 'ช้อยเลือกที่ 2', 'ช้อยเลือกที่ 3', 'ช้อยเลือกที่ 4');";

        for (int i = 0; i < strExercise.length; i++) {
            db.execSQL(strExercise[i]);
        }   //for

    }   // onCreate

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
