package com.example.resume_builder.adapters;

import androidx.annotation.NonNull;

import com.example.resume_builder.datamodel.School;

import java.util.List;

public class SchoolsAdapter extends ResumeEventAdapter<School> {

    public SchoolsAdapter(@NonNull List<School> list,
                          ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}