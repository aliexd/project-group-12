package ca.mcgill.ecse321.petadoption.dto;

import ca.mcgill.ecse321.petadoption.model.AppUser;

import java.sql.Date;

public class DonationDto {
    private AppUser donor;
    private Integer amount;
    private Date dateOfPayment;
    private String transactionID;

    // constructor: come back to this to see how many constructors u need and what u shld pass into them (???)
    public DonationDto(AppUser donor, Date dateOfPayment, Integer amount, String transactionID) {
        this.donor = donor;
        this.dateOfPayment = dateOfPayment;
        this.amount = amount;
        this.transactionID = transactionID;
    }

    // getters
    public AppUser getDonor() {
        return this.donor;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public Date getDateOfPayment() {
        return this.dateOfPayment;
    }

    public String getTransactionID() {
        return this.transactionID;
    }




}
