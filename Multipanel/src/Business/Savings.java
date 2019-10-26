/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author sharw
 */
public class Savings {
    
    private String SBankname;
    private String SRoutingNo;
    private String SAccNo;
    private String SBal;
    private String SAccType;
    
    public String getSBankname() {
        return SBankname;
    }

    public void setSBankname(String SBankname) {
        this.SBankname = SBankname;
    }

    public String getSRoutingNo() {
        return SRoutingNo;
    }

    public void setSRoutingNo(String SRoutingNo) {
        this.SRoutingNo = SRoutingNo;
    }

    public String getSAccNo() {
        return SAccNo;
    }

    public void setSAccNo(String SAccNo) {
        this.SAccNo = SAccNo;
    }

    public String getSBal() {
        return SBal;
    }

    public void setSBal(String SBal) {
        this.SBal = SBal;
    }

    public String getSAccType() {
        return SAccType;
    }

    public void setSAccType(String SAccType) {
        this.SAccType = SAccType;
    }
}
