package com.example.user.bookaholic;

import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import com.facebook.CallbackManager;
        import com.facebook.FacebookCallback;
        import com.facebook.FacebookException;
        import com.facebook.FacebookSdk;
        import com.facebook.login.LoginResult;
        import com.facebook.login.widget.LoginButton;

public class login extends AppCompatActivity {

    LoginButton loginButton;
    TextView textView;
    CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.setApplicationId("1502211453201955");


        FacebookSdk.sdkInitialize(this);

        setContentView(R.layout.activity_login);


        loginButton = (LoginButton)findViewById(R.id.fb_login_button);
        textView = (TextView) findViewById(R.id.text);
        callbackManager = CallbackManager.Factory.create();

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                textView.setText("Logged in as " + loginResult.getAccessToken().getUserId()
                        + "\n" + loginResult.getAccessToken().getToken() );
            }

            @Override
            public void onCancel() {

                textView.setText("Login Canceled");
            }

            @Override
            public void onError(FacebookException error) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode,resultCode,data);
    }
}
