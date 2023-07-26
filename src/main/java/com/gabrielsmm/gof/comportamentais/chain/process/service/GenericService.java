package com.gabrielsmm.gof.comportamentais.chain.process.service;

import com.gabrielsmm.gof.comportamentais.chain.process.steps.ProcessStep;

public class GenericService {

    public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
        try {
            ProcessContext result = startProcess.execute(initialContext);
            return result.getProcessResult();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

}
