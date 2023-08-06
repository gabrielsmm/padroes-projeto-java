package com.gabrielsmm.gof.comportamentais.template.persist;

import com.gabrielsmm.gof.comportamentais.template.persist.models.UserModel;

public class Client {

    public static void main(String[] args) {
        UserModel user = new UserModel("user", "passwd");
        user.save();
        user.update();
        user.delete();

        System.out.println("----------");

        UserModel invalidUser = new UserModel("teste", null);
        invalidUser.save();
    }

}
