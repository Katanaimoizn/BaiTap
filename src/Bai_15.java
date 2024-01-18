public class Bai_15 {
    public static String chuanHoaVanBan(String input) {
        if (input == null) {
            return null;
        }
        // Chuyển đổi ký tự in hoa thành ký tự thường
        String chuoiChuyenDoi = input.toLowerCase();

        // Loại bỏ khoảng trắng dư thừa
        String chuoiDaLoaiBoKhoangTrang = chuoiChuyenDoi.trim().replaceAll("\\s+", " ");

        return chuoiDaLoaiBoKhoangTrang;
    }
    public static String vietHoaChuCaiSauDauCham(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder ketQua = new StringBuilder();

        boolean vietHoaTiepTheo = true;

        for (char c : input.toCharArray()) {
            if (vietHoaTiepTheo && Character.isLetter(c)) {
                ketQua.append(Character.toUpperCase(c));
                vietHoaTiepTheo = false;
            } else {
                ketQua.append(c);
            }
            if (c == '.') {
                vietHoaTiepTheo = true;
            }
        }

        return ketQua.toString();
    }

    public static void main(String[] args) {
        String vanBanGoc = "   TrOng 1 ngày mưa lạnh. tÔi đặt bước ra khỏi nhà và ngay lập tức tÔi đã quên ô. tÔi vội vã quay trở lại nhưng cÁnh cửa đã tự đÓng lại, bẮt tÔi phẢi đứng ngoài ngẮm mưa. Chiếc ô, nơi tÔi đã dùng từ khi cÒn nhỎ, giờ đây nẰm quên lẠc trong gÓc phÒng. Đó lÀ 1 bÀi hỌc rằng cẨn thận luÔn quan trỌng, kể cẢ trong nhỮng ngÀy mƯa.   ";
        // Chuẩn hóa văn bản
        String vanBanChuanHoa =vietHoaChuCaiSauDauCham(chuanHoaVanBan(vanBanGoc)) ;
        System.out.println("\nVăn bản chuẩn hóa:\n" + vanBanChuanHoa);
    }
}
