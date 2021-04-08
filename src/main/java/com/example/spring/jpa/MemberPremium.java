package com.example.spring.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class MemberPremium {
    @Id
    private int memberid;
        private int policyid;
        private int topup;
        private int premiumAmountDue;
        private int LastpremiumAmount;
        
        public String DueDate;
    
    
        public MemberPremium() {
        }
    
        public MemberPremium(int memberid, int policyid, int topup, int premiumAmountDue, int LastpremiumAmount, String DueDate) {
            this.memberid = memberid;
            this.policyid = policyid;
            this.topup = topup;
            this.premiumAmountDue = premiumAmountDue;
            this.LastpremiumAmount = LastpremiumAmount;
            this.DueDate = DueDate;
        }
    
        public int getMemberid() {
            return this.memberid;
        }
    
        public void setMemberid(int memberid) {
            this.memberid = memberid;
        }
    
        public int getPolicyid() {
            return this.policyid;
        }
    
        public void setPolicyid(int policyid) {
            this.policyid = policyid;
        }
    
        public int getTopup() {
            return this.topup;
        }
    
        public void setTopup(int topup) {
            this.topup = topup;
        }
    
        public int getPremiumAmountDue() {
            return this.premiumAmountDue;
        }
    
        public void setPremiumAmountDue(int premiumAmountDue) {
            this.premiumAmountDue = premiumAmountDue;
        }
    
        public int getLastpremiumAmount() {
            return this.LastpremiumAmount;
        }
    
        public void setLastpremiumAmount(int LastpremiumAmount) {
            this.LastpremiumAmount = LastpremiumAmount;
        }
    
        public String getDueDate() {
            return this.DueDate;
        }
    
        public void setDueDate(String DueDate) {
            this.DueDate = DueDate;
        }
    
        public MemberPremium memberid(int memberid) {
            setMemberid(memberid);
            return this;
        }
    
        public MemberPremium policyid(int policyid) {
            setPolicyid(policyid);
            return this;
        }
    
        public MemberPremium topup(int topup) {
            setTopup(topup);
            return this;
        }
    
        public MemberPremium premiumAmountDue(int premiumAmountDue) {
            setPremiumAmountDue(premiumAmountDue);
            return this;
        }
    
        public MemberPremium LastpremiumAmount(int LastpremiumAmount) {
            setLastpremiumAmount(LastpremiumAmount);
            return this;
        }
    
        public MemberPremium DueDate(String DueDate) {
            setDueDate(DueDate);
            return this;
        }
    
        @Override
        public String toString() {
            return "{" +
                " memberid='" + getMemberid() + "'" +
                ", policyid='" + getPolicyid() + "'" +
                ", topup='" + getTopup() + "'" +
                ", premiumAmountDue='" + getPremiumAmountDue() + "'" +
                ", LastpremiumAmount='" + getLastpremiumAmount() + "'" +
                ", DueDate='" + getDueDate() + "'" +
                "}";
        }
      
        
}
