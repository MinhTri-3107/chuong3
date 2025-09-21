/**
 * @description: 
 * @author: duy
 * @version: 1.0
 * @created: 21 thg 9, 2025 21:03:23
 */
package iuh.fit.lab3;

/**
 * 
 */
public class Test {
    public static void main(String[] args) {
        // khởi tạo bàn
        Ban ban1 = new Ban("B001", ChatLieu.GO, KichCo.LON, 4, 2.0, 1.0);
        Ban ban2 = new Ban("B002", ChatLieu.KIMLOAI, KichCo.VUA, 6, 1.5, 0.8);

        // khởi tạo ghế
        Ghe ghe1 = new Ghe("G001", ChatLieu.NHUA, KichCo.NHO, 4, true);
        Ghe ghe2 = new Ghe("G002", ChatLieu.GO, KichCo.VUA, 3, false);

        // in thông tin và cân nặng
        System.out.println("Danh sách bàn:");
        System.out.println(ban1.getMa() + " - " + ban1.getChatLieu() + " - " +
                           ban1.getKichCo() + " - Cân nặng: " + ban1.canNang());
        System.out.println(ban2.getMa() + " - " + ban2.getChatLieu() + " - " +
                           ban2.getKichCo() + " - Cân nặng: " + ban2.canNang());
        System.out.println();
        System.out.println("Danh sách ghế:");
        System.out.println(ghe1.getMa() + " - " + ghe1.getChatLieu() + " - " +
                           ghe1.getKichCo() + " - Cân nặng: " + ghe1.canNang());
        System.out.println(ghe2.getMa() + " - " + ghe2.getChatLieu() + " - " +
                           ghe2.getKichCo() + " - Cân nặng: " + ghe2.canNang());
        
        // Kiểm tra đầu vào
        Ban ban3 = new Ban("B003", ChatLieu.KIMLOAI, KichCo.VUA, 0, 1.5, 0.8);
    }
}
