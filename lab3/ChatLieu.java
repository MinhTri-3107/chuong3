/**
 * @description: 
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 21:02:15
 */
package iuh.fit.lab3;

/**
 * 
 */
public enum ChatLieu {
    GO("Gỗ"),
    NHUA("Nhựa"),
    KIMLOAI("Kim loại");

    private String value;

    private ChatLieu(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
