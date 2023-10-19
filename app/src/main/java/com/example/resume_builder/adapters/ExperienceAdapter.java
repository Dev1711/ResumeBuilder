package com.example.resume_builder.adapters;

import androidx.annotation.NonNull;

import com.example.resume_builder.datamodel.Experience;

import java.util.List;

public class ExperienceAdapter extends ResumeEventAdapter<Experience> {

    public ExperienceAdapter(@NonNull List<Experience> list,
                             ResumeEventOnClickListener resumeEventOnClickListener) {
        super(list, resumeEventOnClickListener);
    }
}
