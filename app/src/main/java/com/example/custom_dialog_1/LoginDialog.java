package com.example.custom_dialog_1;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDialog extends Dialog {

    private EditText edtUserame,edtPassword;
    private Button btnLogin;
    private Context context;

    interface OnLoginlistener{
        void onSuccess(LoginDialog loginDialog);
        void  onFail(LoginDialog loginDialog);
    }

    private OnLoginlistener onLoginlistener=null;

    public  void setOnLoginlistener(OnLoginlistener onLoginlistener){
        this.onLoginlistener=onLoginlistener;
    }

    public  LoginDialog(Context context){
        super(context);
        this.context=context;
        initViews();
        btnLogin.setOnClickListener(new BtnLoginClickListener());
    }

    private  class BtnLoginClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (edtUserame.getText().toString().equals("bitcode")&&edtPassword.getText().toString().equals("bitcode")){
                if (onLoginlistener !=null){
                    onLoginlistener.onSuccess(LoginDialog.this);
                }
                else {
                    if (onLoginlistener !=null){
                        onLoginlistener.onFail(LoginDialog.this);
                    }
                }
            }
        }
    }

    private void mt(String text){
        Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
    }

    private void  initViews(){
        setContentView(R.layout.login_dialog);
        edtUserame=findViewById(R.id.edtUsername);
        edtPassword=findViewById(R.id.edtPassword);
        btnLogin=findViewById(R.id.btnLogin);

    }

}
