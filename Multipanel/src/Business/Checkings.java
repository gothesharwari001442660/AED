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
public class Checkings {
    
    private String CBankName;
    private String CRoutingNo;
    private String CAccNo;
    private String CBal;
    private String CAccType;
    
    public String getCBankName() {
        return CBankName;
    }

    public void setCBankName(String CBankName) {
        this.CBankName = CBankName;
    }

    public String getCRoutingNo() {
        return CRoutingNo;
    }

    public void setCRoutingNo(String CRoutingNo) {
        this.CRoutingNo = CRoutingNo;
    }

    public String getCAccNo() {
        return CAccNo;
    }

    public void setCAccNo(String CAccNo) {
        this.CAccNo = CAccNo;
    }

    public String getCBal() {
        return CBal;
    }

    public void setCBal(String CBal) {
        this.CBal = CBal;
    }

    public String getCAccType() {
        return CAccType;
    }

    public void setCAccType(String CAccType) {
        this.CAccType = CAccType;
    }
}
