package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = false)
    private float incentive;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserRecord sender;

    @ManyToOne
    @JoinColumn(nullable = false)
    private UserRecord recipient;

    protected TransactionRecord() {
    }

    public TransactionRecord(float amount,
                             float incentive,
                             UserRecord sender,
                             UserRecord recipient) {
        this.amount = amount;
        this.incentive = incentive;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Long getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public float getIncentive() {
        return incentive;
    }

    public UserRecord getSender() {
        return sender;
    }

    public UserRecord getRecipient() {
        return recipient;
    }
}