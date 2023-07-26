package com.gabrielsmm.gof.comportamentais.chain.process;

import com.gabrielsmm.gof.comportamentais.chain.process.service.GenericService;
import com.gabrielsmm.gof.comportamentais.chain.process.service.ProcessContext;
import com.gabrielsmm.gof.comportamentais.chain.process.service.ServicesCatalog;

public class Client {

    public static void main(String[] args) {
        ProcessContext ctx = new ProcessContext();
        ctx.put("email", "anotherUser@email.com");
        ctx.put("password", "1234");
        Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
        System.out.println(response);

        ctx.reset();
        ctx.put("email", "anotherUser@email.com");
        ctx.put("password", "1234");
        ctx.put("name", "Another User");
        response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
        System.out.println(response);
    }

}
