package in.cg.entities;

import jakarta.persistence.*;

@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String number;
    private double balance;

    // owner side
    @ManyToOne
    @JoinColumn(name="bank_id")
    private Bank bank;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Bank getBank() { return bank; }
    public void setBank(Bank bank) { this.bank = bank; }
}
