package com.gabrielsmm.gof.comportamentais.observer.party.subject;

public class Doorman extends Subject {

    private boolean status = false;

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean newStatus) {
        if (this.status != newStatus) {
            this.status = newStatus;
            notifyObservers(newStatus);
        }
    }

}
