package appewtc.masterung.easylearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;
    private EditText userEditText, passwordEditText;
    private String userString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Connected Database
        objManageTABLE = new ManageTABLE(this);

    }   // onCreate

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
    }

    public void clickLogin(View view) {

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        if (userString.equals("") || passwordString.equals("")) {

            //Have Space
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "มีช่องว่าง นะคะ", "กรุณากรอก ให้ครบทุกช่อง คะ");

        } else {

            //No Space
            checkUser();


        }

    }   // clickLogin

    private void checkUser() {

        try {

            String[] strMyResult = objManageTABLE.searchUser(userString);
            Log.d("test", "user ==> " + strMyResult[1]);
            //Check Password
            if (passwordString.equals(strMyResult[2])) {

                //Intent to Service


            } else {

                //Password False
                MyAlertDialog objMyAlertDialog = new MyAlertDialog();
                objMyAlertDialog.myDialog(MainActivity.this, "Password False", "Please Try Again Password False");

            }

        } catch (Exception e) {
            //User False
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "No This User", "No " + userString + " in my Database");
        }

    }   // checkUser


}   // Main Class
