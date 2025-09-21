/**
 * @description: lop co so vat chat
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 20:30:47
 */
package iuh.fit.lab3;

/**
 * lop truu tuong CoSoVatChat
 */
public abstract class CoSoVatChat {
    private String ma;
    private ChatLieu chatLieu;
    private KichCo kichCo;
    private int soChan;

    // constructor
    public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
        setMa(ma);
        setChatLieu(chatLieu);
        setKichCo(kichCo);
        setSoChan(soChan);
    }

    // cac phuong thuc getter
    public String getMa() {
        return ma;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public KichCo getKichCo() {
        return kichCo;
    }

    public int getSoChan() {
        return soChan;
    }

    // cac phuong thuc setter
    public void setMa(String ma) {
        if (ma == null || ma.isEmpty()) {
            throw new IllegalArgumentException("Mã");
        }
        this.ma = ma;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public void setKichCo(KichCo kichCo) {
        this.kichCo = kichCo;
    }

    public void setSoChan(int soChan) {
        if (soChan <= 0) {
            throw new IllegalArgumentException("soChan > 0");
        }
        this.soChan = soChan;
    }

    // phuong thuc truu tuong can nang
    public abstract double canNang();
}
