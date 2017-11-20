package com.example.mannnl.magikard;

/**
 * Created by mannnl on 11/2/2017.
 */

public class PokemonCard {

    private String mName;
    private String mHitPoints;
    private String mType;

    public PokemonCard(String Name, String HitPoints, String Type){
        this.mName = Name;
        this.mHitPoints = HitPoints;
        this.mType = Type;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmHitPoints() {
        return mHitPoints;
    }

    public void setmHitPoints(String mHitPoints) {
        this.mHitPoints = mHitPoints;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }
}
