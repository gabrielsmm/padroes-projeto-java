package com.gabrielsmm.gof.comportamentais.template.persist.models;

public abstract class ModelPersist {

    public final ModelPersist save() {
        preSave();
        prePersist();
        System.out.println(String.format("Saving %s in database", this.getClass().getSimpleName()));
        postSave();
        return this;
    }

    public final ModelPersist update() {
        preUpdate();
        prePersist();
        System.out.println(String.format("Updating %s in database", this.getClass().getSimpleName()));
        postUpdate();
        return this;
    }

    public final void delete() {
        preDelete();
        System.out.println(String.format("Removing %s in database", this.getClass().getSimpleName()));
        postDelete();
    }

    // Obriga as classes filhas a implementar
    protected abstract void preSave();

    // Implementações opcionais
    protected void prePersist() {
        // Override this method if you want to add a new behavior
    }

    protected void postSave() {
        // Override this method if you want to add a new behavior
    }

    protected void preUpdate() {
        // Override this method if you want to add a new behavior
    }

    protected void postUpdate() {
        // Override this method if you want to add a new behavior
    }

    protected void preDelete() {
        // Override this method if you want to add a new behavior
    }

    protected void postDelete() {
        // Override this method if you want to add a new behavior
    }

}
