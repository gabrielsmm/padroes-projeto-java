package com.gabrielsmm.gof.comportamentais.chain.process.service;

import com.gabrielsmm.gof.comportamentais.chain.process.steps.ProcessStep;
import com.gabrielsmm.gof.comportamentais.chain.process.steps.SaveUser;
import com.gabrielsmm.gof.comportamentais.chain.process.steps.ValidateMandatoryField;

public class ServicesCatalog {

    public static ProcessStep saveUserProcess = buildChain(
            new ValidateMandatoryField("name"),
            new ValidateMandatoryField("email"),
            new ValidateMandatoryField("password"),
            new SaveUser()
    );

    private static ProcessStep buildChain(ProcessStep... steps) {
        for (int i = 0; i < steps.length - 1; i++) {
            ProcessStep currentProcess = steps[i];
            currentProcess.setNextStep(steps[i + 1]);
        }
        return steps[0];
    }

}
