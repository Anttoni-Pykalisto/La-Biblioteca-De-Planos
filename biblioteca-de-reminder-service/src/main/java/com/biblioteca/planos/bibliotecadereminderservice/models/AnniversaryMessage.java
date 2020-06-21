package com.biblioteca.planos.bibliotecadereminderservice.models;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AnniversaryMessage {

    private LocalDateTime specialDate;
    private String ocassion;
    private int[] noticeIntervalDays;
    private String[] recipientNumbers;
    private String noticeMessage;
    private String specialDateMessage;
    
}