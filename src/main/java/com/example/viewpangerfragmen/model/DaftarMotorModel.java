package com.example.viewpangerfragmen.model;


public class DaftarMotorModel {



}
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import com.google.gson.annotations.SerializedName;
//
//public class DaftarMotorModel implements Parcelable {
//    @SerializedName("id")
//    private int id;
//
//    @SerializedName("image")
//    private String image;
//
//    @SerializedName("title")
//    private String title;
//
//    @SerializedName("description")
//    private String description;
//
//    @SerializedName("price")
//    private int price;
//
//    public DaftarMotorModel(int id, String image, String title, String description, int price) {
//        this.id = id;
//        this.image = image;
//        this.title = title;
//        this.description = description;
//        this.price = price;
//    }
//
//    public DaftarMotorModel() {
//
//    }
//
//    protected DaftarMotorModel(Parcel in) {
//        id = in.readInt();
//        image = in.readString();
//        title = in.readString();
//        description = in.readString();
//        price = in.readInt();
//    }
//    @Override
//    public void writeToParcel(Parcel parcel, int i) {
//        parcel.writeInt(id);
//        parcel.writeString(image);
//        parcel.writeString(title);
//        parcel.writeString(description);
//        parcel.writeInt(price);
//    }
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//
//    public static final Creator<DaftarMotorModel> CREATOR = new Creator<DaftarMotorModel>() {
//        @Override
//        public DaftarMotorModel createFromParcel(Parcel in) {
//            return new DaftarMotorModel(in);
//        }
//
//        @Override
//        public DaftarMotorModel[] newArray(int size) {
//            return new DaftarMotorModel[size];
//        }
//    };
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//
//
//}
