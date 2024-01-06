package com.java.e_commerce.model;

import org.springframework.data.annotation.Transient;

public class Category {

    @Transient
    public static final String shortCode = "CA";

    // SequenceGeneratorService.generateSequence(SeasonSubSquad.shortCode);
    public String Id;
    public String Category;
}
