package com.marcel.lavigne.android;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_signup)
public class SignupActivity  extends AppCompatActivity {

    private static final String TAG = "SignupActivity";

    @ViewById EditText inputName;
    @ViewById EditText inputAddress;
    @ViewById EditText inputEmail;
    @ViewById EditText inputMobile;
    @ViewById EditText inputPassword;
    @ViewById EditText inputRePassword;
    @ViewById Button btnSignup;
    @ViewById TextView linkLogin;

    @Click
    public void linkLogin() {
        // Finish the registration screen and return to the Login activity
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }

    @Click
    public void btnSignup() {
        Log.d(TAG, "Signup");

        if (!validate()) {
            onSignupFailed();
            return;
        }

        btnSignup.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SignupActivity.this, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Creating Account...");
        progressDialog.show();

        String name = inputName.getText().toString();
        String address = inputAddress.getText().toString();
        String email = inputEmail.getText().toString();
        String mobile = inputMobile.getText().toString();
        String password = inputPassword.getText().toString();
        String reEnterPassword = inputRePassword.getText().toString();

        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }


    public void onSignupSuccess() {
        btnSignup.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();

        btnSignup.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String name = inputName.getText().toString();
        String address = inputAddress.getText().toString();
        String email = inputEmail.getText().toString();
        String mobile = inputMobile.getText().toString();
        String password = inputPassword.getText().toString();
        String reEnterPassword = inputRePassword.getText().toString();

        if (name.isEmpty() || name.length() < 3) {
            inputName.setError("at least 3 characters");
            valid = false;
        } else {
            inputName.setError(null);
        }

        if (address.isEmpty()) {
            inputAddress.setError("Enter Valid Address");
            valid = false;
        } else {
            inputAddress.setError(null);
        }


        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            inputEmail.setError("enter a valid email address");
            valid = false;
        } else {
            inputEmail.setError(null);
        }

        if (mobile.isEmpty() || mobile.length()!=10) {
            inputMobile.setError("Enter Valid Mobile Number");
            valid = false;
        } else {
            inputMobile.setError(null);
        }

        if (password.isEmpty() || password.length() < 4 || password.length() > 10) {
            inputPassword.setError("between 4 and 10 alphanumeric characters");
            valid = false;
        } else {
            inputPassword.setError(null);
        }

        if (reEnterPassword.isEmpty() || reEnterPassword.length() < 4 || reEnterPassword.length() > 10 || !(reEnterPassword.equals(password))) {
            inputRePassword.setError("Password Do not match");
            valid = false;
        } else {
            inputRePassword.setError(null);
        }

        return valid;
    }
}
