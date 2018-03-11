package com.example.nikkoekasaputra.belajarmvp.LoginMVP;

import android.text.TextUtils;

/**
 * Created by Nikko Eka Saputra on 11/03/2018.
 */

public class LoginPresenterImplement implements LoginPresenter {

    /**
     * The login view.
     */
    private LoginView loginView;

    /**
     * Membuat sebuah login presenter impl baru.
     *
     * @param loginView the login view
     */
    public LoginPresenterImplement(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            loginView.showValidationError();
        } else {
            if (username.equals("admin") && password.equals("admin")) {
                loginView.loginSuccess();
            } else {
                loginView.loginError();
            }
        }
    }

}
