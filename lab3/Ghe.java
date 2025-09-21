/**
 * @description: 1 lop chua cac thong tin ve 1 cai ghe
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 20:38:14
 */
package iuh.fit.lab3;

/**
 * lop Ghe
 */
public class Ghe extends CoSoVatChat {
    private boolean coTuaGhe;

    // constructor
    public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
        super(ma, chatLieu, kichCo, soChan);
        setCoTuaGhe(coTuaGhe);
    }

    // getter
    public boolean isCoTuaGhe() {
        return coTuaGhe;
    }
    
    // setter
    public void setCoTuaGhe(boolean coTuaGhe) {
        this.coTuaGhe = coTuaGhe;
    }

    @Override
    public double canNang() {
        double canNangTuaGhe = coTuaGhe ? 20 : 0;
        return (getSoChan() * 10) + canNangTuaGhe;
    }
}
