package com.gabrielsmm.gof.comportamentais.chain.process.steps;

import com.gabrielsmm.gof.comportamentais.chain.process.service.ProcessContext;

public abstract class ProcessStep {

    protected ProcessStep nextStep;
    protected Object[] args;

    public ProcessStep(Object... args) {
        this.args = args;
    }

    public void setNextStep(ProcessStep next) {
        this.nextStep = next;
    }

    protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
        context.setResult(actualResult);
        return this.nextStep != null ? this.nextStep.execute(context) : context;
    }

    public abstract ProcessContext execute(ProcessContext context) throws Exception;

}
