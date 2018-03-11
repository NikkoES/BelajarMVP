package com.example.nikkoekasaputra.belajarmvp.KalkulatorMVP;

/**
 * Created by gits on VIP.
 * Present for process
 */
public class KalkulatorActivityPresent implements KalkulatorActivityInput {

    public KalkulatorActivityOutput output;

    @Override
    public void doPenjumlahan(int varA, int varB) {
        int hasil = varA + varB;
        output.displayHasil(String.valueOf(hasil));
    }

}