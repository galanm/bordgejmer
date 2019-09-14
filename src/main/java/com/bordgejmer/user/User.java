package com.bordgejmer.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Setter(AccessLevel.PACKAGE)
@Getter
public class User {
    @Id
    private String name;
}
