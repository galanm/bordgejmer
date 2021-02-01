package com.bordgejmer.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class User {
    private String id;
    @Indexed
    private String name;

    User(String name) {
        this.name = name;
    }
}
