package com.paveldejimas.bazine;

public class TransportasImpl implements Transportas {
    private String tipas;
    private boolean variklis;
    private int pagaminimoMetai;

    public TransportasImpl(String tipas, boolean variklis, int pagaminimoMetai) {
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public TransportasImpl(String tipas, int pagaminimoMetai) {
        this(tipas, false, pagaminimoMetai);
    }

    public String getTipas() {
        return tipas;
    }

    public boolean isVariklis() {
        return variklis;
    }

    public void setVariklis(boolean variklis) {
        this.variklis = variklis;
    }

    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public String toString() {
        String engine = variklis ? "su varikliu" : "be variklio";
        return String.format("%s transporto priemonė, %s, pagaminta: %d metais", tipas, engine, pagaminimoMetai);
    }
}
