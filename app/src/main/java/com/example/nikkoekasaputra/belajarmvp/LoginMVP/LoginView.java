package com.example.nikkoekasaputra.belajarmvp.LoginMVP;

/**
 * Created by Nikko Eka Saputra on 11/03/2018.
 */

public interface LoginView {

    /**
     * Menampilkan toast validation error.
     */
    void showValidationError();
    /**
     * Login success.
     */
    void loginSuccess();
    /**
     * Menampilkan toast login error.
     */
    void loginError();

}
