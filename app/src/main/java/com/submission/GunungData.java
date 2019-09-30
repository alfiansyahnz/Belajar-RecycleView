package com.submission;

import com.submission.model.Gunung;

import java.util.ArrayList;

public class GunungData {

    public static String[][] data = new String[][]{
            {"Gunung Merbabu", "Kabupaten Boyolali , Jawa Tengah", "https://upload.wikimedia.org/wikipedia/id/thumb/8/84/Merbabu_060831_selo.jpg/280px-Merbabu_060831_selo.jpg"},
            {"Gunung Lawu", "Kabupaten Karanganyar , Jawa Tengah", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/Lawu.jpg/280px-Lawu.jpg"},
            {"Gunung Salak", "Kabupaten Bogor , Jawa Barat", "https://upload.wikimedia.org/wikipedia/id/thumb/2/20/Salak_050408_012_bblk_resize.jpg/280px-Salak_050408_012_bblk_resize.jpg"},
            {"Gunung Kelud", "Kota Blitar , Jawa Timur", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Kelut.jpg/280px-Kelut.jpg"},
            {"Gunung Prau", " Dataran Tinggi Dieng, Jawa Tengah", "https://upload.wikimedia.org/wikipedia/id/thumb/7/75/Gunung_prahu.jpg/280px-Gunung_prahu.jpg"},
            {"Gunung Merapi", " Kabupaten Sleman, Daerah Istimewa Yogyakarta", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Kegagahan_Merapi.jpg/288px-Kegagahan_Merapi.jpg"},
            {"Gunung Cikuray", "Dayeuhmanggung, Kabupaten Garut, Jawa Barat", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3c/Mount_Cikuray_from_Cisurupan.JPG/280px-Mount_Cikuray_from_Cisurupan.JPG"},
            {"Gunung Gede", "Kabupaten Cianjur , Jawa Barat", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Mount_Gede_00.jpg/280px-Mount_Gede_00.jpg",},
            {"Gunung Papandayan", "Kecamatan Cisurupan , Kabupaten Garut, Jawa Barat", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Indonesia_-_papandayan_4.jpg/280px-Indonesia_-_papandayan_4.jpg"},
            {"Gunung Semeru", " Kabupaten Malang , Jawa Timur", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Semeru.jpg/280px-Semeru.jpg"},
            {"Gunung Sindoro", " Kabupater Temanggung  , Jawa Tengah", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Mt_Sindoro_view_from_Mt_Sikunir.jpg/280px-Mt_Sindoro_view_from_Mt_Sikunir.jpg"}


    };

    public static ArrayList<Gunung> getData() {
        ArrayList<Gunung> isi = new ArrayList<>();
        for (String[] data : data) {
            Gunung gunung = new Gunung();
            gunung.setNama(data[0]);
            gunung.setDaerah(data[1]);
            gunung.setGambar(data[2]);
            isi.add(gunung);

        }
        return isi;
    }
}
