package model.AM.client;

import model.AM.common.Receipt;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 04 10:39:44 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ReceiptClient extends ApplicationModuleImpl implements Receipt {
    /**
     * This is the default constructor (do not remove).
     */
    public ReceiptClient() {
    }

    public String OnCreateReceipt() {
        Object _ret =
            this.riInvokeExportedMethod(this,"OnCreateReceipt",null,null);
        return (String)_ret;
    }
}
