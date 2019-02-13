package com.retail.demo.domain;

import com.retail.demo.domain.bill.Bill;
import com.retail.demo.domain.user.User;

public class DiscountCalculation {

    private User user = null;
    private Bill bill = null;
    
    public DiscountCalculation() {
        
    }
    
    public DiscountCalculation(User user, Bill bill) {
        this.user = user;
        this.bill = bill;
    }
    
    public final User getUser() {
        return user;
    }
    
    public final void setUser(User user) {
        this.user = user;
    }
    
    public final Bill getBill() {
        return bill;
    }
    
    public final void setBill(Bill bill) {
        this.bill = bill;
    }
}
