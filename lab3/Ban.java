/**
 * @description: 1 lop chua cac thong tin ve 1 cai ban
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 20:35:50
 */
package iuh.fit.lab3;

/**
 * lop Ban
 */
public class Ban extends CoSoVatChat {
    private double doDai;
    private double doRong;

    // constructor
    public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
        super(ma, chatLieu, kichCo, soChan);
        setDoDai(doDai);
        setDoRong(doRong);
    }

    // getters
    public double getDoDai() {
        return doDai;
    }

    public double getDoRong() {
        return doRong;
    }

    // setters
    public void setDoDai(double doDai) {
        if (doDai <= 0) {
            throw new IllegalArgumentException("doDai > 0");
        }
        this.doDai = doDai;
    }

    public void setDoRong(double doRong) {
        if (doRong <= 0) {
            throw new IllegalArgumentException("doRong > 0");
        }
        this.doRong = doRong;
    }

    @Override
    public double canNang() {
        return (doDai * doRong * 10) + (getSoChan() * 10);
    }
}
