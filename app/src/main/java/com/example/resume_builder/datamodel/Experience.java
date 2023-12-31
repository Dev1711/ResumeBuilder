package com.example.resume_builder.datamodel;

import android.os.Parcel;
import android.os.Parcelable;

public class Experience extends ResumeEvent {
    public Experience() {
    }

    public static final Parcelable.Creator<Experience> CREATOR = new Creator<Experience>() {
        @Override
        public Experience createFromParcel(Parcel in) {
            return new Experience(new ResumeEvent(in));
        }

        @Override
        public Experience[] newArray(int size) {
            return new Experience[size];
        }
    };

    public Experience(ResumeEvent event) {
        super(event);
    }

    public String getCompany() {
        return getTitle();
    }

    public void setCompany(String company) {
        setTitle(company);
    }

    public String getLocation() {
        return getDetail();
    }

    public void setLocation(String location) {
        setDetail(location);
    }

    public String getJobTitle() {
        return getSubtitle();
    }

    public void setJobTitle(String jobTitle) {
        setSubtitle(jobTitle);
    }
}