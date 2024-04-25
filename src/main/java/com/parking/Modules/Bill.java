package com.parking.Modules;

import java.sql.Time;
import java.util.List;

public class Bill {
    private int id;
    private int TictetNumber;
    private Time exitTime;
    private double amount;
    private List<Payment> payments;
    private Status status;
}
