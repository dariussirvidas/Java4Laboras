package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {
    private String marke;
    private int duruSkaicius;
    private boolean varomasElektra;

    public AutomobilisImpl(boolean variklis, int pagaminimoMetai, String marke,
                           int duruSkaicius, boolean varomasElektra) {
        super("sausumos", variklis, pagaminimoMetai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }

    public AutomobilisImpl(int pagaminimoMetai, String marke, int duruSkaicius, boolean varomasElektra) {
        this(true, pagaminimoMetai, marke, duruSkaicius, varomasElektra);
    }

    public AutomobilisImpl(int pagaminimoMetai, String marke, int duruSkaicius) {
        this(true, pagaminimoMetai, marke, duruSkaicius, false);
    }

    public String getMarke() {
        return marke;
    }

    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }

    public boolean isVaromasElektra() {
        return varomasElektra;
    }

    public void setVaromasElektra(boolean varomasElektra) {
        this.varomasElektra = varomasElektra;
    }

    public String toString() {
        String elektra = varomasElektra ? "elektra" : "iškastiniu kuru";
        return String.format("%s, \"%s\", %d durų, varomas %s", super.toString(), marke, duruSkaicius, elektra);
    }
}
