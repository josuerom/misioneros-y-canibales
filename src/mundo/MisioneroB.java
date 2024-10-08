package mundo;

import gfutria.Logic;

public class Misionero extends Logic {
    private int misioneroIzq;
    private int canibalIzq;
    private int misioneroDer;
    private int canibalDer;
    private int barcaDer;
    private int barcaIzq;

    public Misionero() {
        misioneroIzq = canibalIzq = misioneroDer = canibalDer = barcaIzq = barcaDer = 0;
    }
    
    public Misionero(int misioneroIzq, int canibalIzq, int misioneroDer, int canibalDer, int barcaIzq, int barcaDer) {
        this.misioneroIzq = misioneroIzq;
        this.canibalIzq = canibalIzq;
        this.misioneroDer = misioneroDer;
        this.canibalDer = canibalDer;
        this.barcaIzq = barcaIzq;
        this.barcaDer = barcaDer;
    }
    
    /* Getters & Setters */
    public int getMisioneroIzq() { return misioneroIzq; }
    public int getMisioneroDer() { return misioneroDer; }

    public int getCanibalIzq() { return canibalIzq; }
    public int getCanibalDer() { return canibalDer; }

    public int getBarcaDer() { return barcaDer; }
    public int getBarcaIzq() { return barcaIzq; }

    public void setMisioneroIzq(int misioneroIzq) { this.misioneroIzq = misioneroIzq; }
    public void setMisioneroDer(int misioneroDer) { this.misioneroDer = misioneroDer; }

    public void setCanibalIzq(int canibalIzq) { this.canibalIzq = canibalIzq; }
    public void setCanibalDer(int canibalDer) { this.canibalDer = canibalDer; }

    public void setBarcaDer(int barca) { this.barcaDer = barca; }
    public void setBarcaIzq(int barca) { this.barcaIzq = barca; }

    /* Métodos de comportamiento */
    public void unMisionero() {
//        if (canibalIzq <= misioneroIzq - 1 && canibalDer <= misioneroDer + 1) {
        if (barcaIzq == 1) {
            misioneroIzq -= 1;
            misioneroDer += 1;
            barcaIzq = 0;
            barcaDer = 1;
//        } else if (canibalIzq <= misioneroIzq + 1 && canibalDer <= misioneroDer - 1) {
        } else {
            misioneroIzq += 1;
            misioneroDer -= 1;
            barcaIzq = 1;
            barcaDer = 0;
        }
    }

    public void unCanibal() {
//        if (canibalIzq - 1 <= misioneroIzq && canibalDer + 1 <= misioneroDer) {
        if (barcaIzq == 1) {
            canibalIzq -= 1;
            canibalDer += 1;
            barcaIzq = 0;
            barcaDer = 1;
//        } else if (canibalIzq + 1 <= misioneroIzq && canibalDer - 1 <= misioneroDer) {
        } else {
            canibalIzq += 1;
            canibalDer -= 1;
            barcaIzq = 1;
            barcaDer = 0;
        }
    }

    public void dosMisioneros() {
//        if (canibalIzq <= misioneroIzq - 2 && canibalDer <= misioneroDer + 2) {
        if (barcaIzq == 1) {
            misioneroIzq -= 2;
            misioneroDer += 2;
            barcaIzq = 0;
            barcaDer = 1;
//        } else if (canibalIzq <= misioneroIzq + 2 && canibalDer <= misioneroDer - 2) {
        } else {
            misioneroIzq += 2;
            misioneroDer -= 2;
            barcaIzq = 1;
            barcaDer = 0;
        }
    }

    public void dosCanibales() {
//        if (canibalIzq - 2 <= misioneroIzq && canibalDer + 2 <= misioneroDer) {
        if (barcaIzq == 1) {
            canibalIzq -= 2;
            canibalDer += 2;
            barcaIzq = 0;
            barcaDer = 1;
//        } else if (canibalIzq + 2 <= misioneroIzq && canibalDer - 2 <= misioneroDer) {
        } else {
            canibalIzq += 2;
            canibalDer -= 2;
            barcaIzq = 1;
            barcaDer = 0;
        }
    }

    public void unMisioneroUnCanibal() {
//        if (canibalIzq - 1 <= misioneroIzq - 1 && canibalDer + 1 <= misioneroDer + 1) {
        if (barcaIzq == 1) {
            misioneroIzq -= 1;
            canibalIzq -= 1;
            misioneroDer += 1;
            canibalDer += 1;
            barcaIzq = 0;
            barcaDer = 1;
//        } else if (canibalIzq + 1 <= misioneroIzq + 1 && canibalDer - 1 <= misioneroDer - 1) {
        } else {
            misioneroIzq += 1;
            canibalIzq += 1;
            misioneroDer -= 1;
            canibalDer -= 1;
            barcaIzq = 1;
            barcaDer = 0;
        }
    }

    /* Métodos sobreescritos de la clases Logic  */
    @Override
    public Logic cloneObject(Logic logic) {
        Misionero objMisionero = (Misionero)logic;
        Misionero cloneObjMisionero = new Misionero();

        cloneObjMisionero.setMisioneroDer(objMisionero.getMisioneroDer());
        cloneObjMisionero.setMisioneroIzq(objMisionero.getMisioneroIzq());
        cloneObjMisionero.setCanibalDer(objMisionero.getCanibalDer());
        cloneObjMisionero.setCanibalIzq(objMisionero.getCanibalIzq());
        cloneObjMisionero.setBarcaDer(objMisionero.getBarcaDer());
        cloneObjMisionero.setBarcaIzq(objMisionero.getBarcaIzq());

        return cloneObjMisionero;
    }

    @Override
    public String state() {
        return misioneroIzq + " " + canibalIzq + " " + barcaIzq + " | " + misioneroDer + " " + canibalDer + " " + barcaDer;
    }

    @Override
    public void action(int i) {
        switch (i) {
            case 1 -> unMisionero();
            case 2 -> unCanibal();
            case 3 -> dosMisioneros();
            case 4 -> dosCanibales();
            case 5 -> unMisioneroUnCanibal();
        }
    }
}