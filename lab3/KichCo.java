/**
 * @description: 
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 21:02:41
 */
package iuh.fit.lab3;

/**
 * 
 */
public enum KichCo {
    NHO("Nhỏ"),
    VUA("Vừa"),
    LON("Lớn");

    private String value;

    private KichCo(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
