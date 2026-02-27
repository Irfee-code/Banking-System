package model;
import java.time.LocalDateTime;
import java.util.*;

class Transaction {

    private String type;
    private double amount;
    private LocalDateTime timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }
}
