package com.gabrielsmm.gof.comportamentais.chain.process.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessContext {

    private Map<String, Object> context;
    private Object processResult;

    public ProcessContext() {
        this.context = new LinkedHashMap<>();
    }

    public Object get(String key) {
        return context.get(key);
    }

    public Object put(String key, Object value) {
        return context.put(key, value);
    }

    public Object remove(String key) {
        return context.remove(key);
    }

    public void reset() {
        this.context = new LinkedHashMap<>();
        processResult = null;
    }

    public void setResult(Object result) {
        this.processResult = result;
    }

    public Object getProcessResult() {
        return this.processResult;
    }

}
