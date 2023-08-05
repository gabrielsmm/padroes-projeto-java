package com.gabrielsmm.gof.comportamentais.state.headphone;

public class Client {

    public static void main(String[] args) {
        HeadPhone headPhone = new HeadPhone();
        headPhone.onClick();
        headPhone.onLongClick();
        headPhone.onClick();
        headPhone.onClick();
        headPhone.onClick();
        headPhone.onLongClick();
        headPhone.onClick();
    }

}
