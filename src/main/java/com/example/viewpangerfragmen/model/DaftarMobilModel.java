package com.example.viewpangerfragmen.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.GET;

public class DaftarMobilModel implements Parcelable {

    @SerializedName("id")
    private int id;

    @SerializedName("image")
    private String image;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private int Price;


    public DaftarMobilModel(int id, String image, String title, String description, int price) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.Price = price;
    }

    protected DaftarMobilModel(Parcel in) {
        id = in.readInt();
        image = in.readString();
        title = in.readString();
        description = in.readString();
        Price = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(image);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(Price);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<DaftarMobilModel> CREATOR = new Creator<DaftarMobilModel>() {
        @Override
        public DaftarMobilModel createFromParcel(Parcel in) {
            return new DaftarMobilModel(in);
        }

        @Override
        public DaftarMobilModel[] newArray(int size) {
            return new DaftarMobilModel[size];
        }
    };

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {

        return image;
    }

    public void setImage(String image) {

        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
