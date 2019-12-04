package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.TransportasImpl;

import java.util.Comparator;

public class AutomobilisImpl extends TransportasImpl implements Automobilis, Comparable {
    private String marke;
    private int rida;
    private int duruSkaicius;
    private boolean varomasElektra;

    public AutomobilisImpl(boolean variklis, int pagaminimoMetai, String marke, int rida,
                           int duruSkaicius, boolean varomasElektra) {
        super("sausumos", variklis, pagaminimoMetai);
        this.marke = marke;
        this.rida = rida;
        this.duruSkaicius = duruSkaicius;
        this.varomasElektra = varomasElektra;
    }

    public AutomobilisImpl(int pagaminimoMetai, String marke, int rida, int duruSkaicius, boolean varomasElektra) {
        this(true, pagaminimoMetai, marke, rida, duruSkaicius, varomasElektra);
    }

    public AutomobilisImpl(int pagaminimoMetai, String marke, int rida, int duruSkaicius) {
        this(true, pagaminimoMetai, marke, rida, duruSkaicius, false);
    }

    public String getMarke() {
        return marke;
    }

    public int getRida() {
        return rida;
    }

    public void setRida(int rida) {
        this.rida = rida;
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
        return String.format("%s, \"%s\", %d durų, varomas %s, rida: %dkm", super.toString(), marke, duruSkaicius, elektra, rida);
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(AutomobilisImpl::getMarke).reversed()
                .thenComparing(AutomobilisImpl::getPagaminimoMetai).reversed()
                .thenComparing(AutomobilisImpl::getDuruSkaicius)
                .compare(this, (AutomobilisImpl) o);
    }
}
