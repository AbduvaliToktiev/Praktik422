package com.example.Praktik422.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BookStatus {
    FREE("Свободна"),
    BUSY("Занята");

    final String desc;
}
