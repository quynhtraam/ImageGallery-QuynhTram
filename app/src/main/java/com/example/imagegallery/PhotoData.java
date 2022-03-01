package com.example.imagegallery;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0,"Flowers","https://image-us.eva.vn/upload/1-2021/images/2021-02-19/image1-1613707937-289-width600height400.jpg"));
        photos.add(new Photo(1,"Flowers","https://nhahangcarnaval.com/wp-content/uploads/2021/12/y-nghia-hoa-cuc-hoa-mi-6-min.jpg"));
        photos.add(new Photo(2,"Flowers","https://hoatuoithanhthao.com/media/ftp/hoa-huong-duong.jpg"));
        photos.add(new Photo(3,"Animals","https://image-us.eva.vn/upload/2-2020/images/2020-05-04/15286938-image-crop-3871x3414-1587457943-728-74cbba5910-1587984402-1588579083-970-width660height582.jpg"));
        photos.add(new Photo(4,"Animals","https://image-us.eva.vn/upload/2-2020/images/2020-05-04/15286944-image-crop-4105x3289-1587457909-728-7a3a5cf9d0-1587984402-1588579083-859-width728height583.jpg"));
        photos.add(new Photo(5,"Animals","https://photo-cms-kienthuc.zadn.vn/zoom/800/uploaded/trucchinh2/2021_04_17/nhung-dong-vat-de-thuong-la-quai-thu-an-thit-dong-loai.jpg"));
        photos.add(new Photo(6,"Foods","https://vietsensetravel.com/view-1200/at_do-an-nhat-ban-top-7-mon-an-nhat-ban-noi-tieng-the-gioi_40e8b4356a7ce1220042c4c2b275aa90.jpg"));
        photos.add(new Photo(7,"Foods","https://ik.imagekit.io/tvlk/blog/2018/11/mon-an-vat-ngon-ha-noi-1.jpg"));
        photos.add(new Photo(8,"Foods","https://cdn.jamja.vn/blog/wp-content/uploads/2017/11/cac-mon-an-vat-han-quoc-de-lam3.jpg"));
        return photos;
    }
    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i=0;i<phs.size();i++){
            if (phs.get(i).getId()==id)
                return phs.get(i);
        } return null;
    }
}
