package model.AM.client;

import model.AM.common.WoScheduler_AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 06 15:31:42 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class WoScheduler_AMClient extends ApplicationModuleImpl implements WoScheduler_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public WoScheduler_AMClient() {
    }

    public String reWorkForHistRecord(String mainId, String userId,
                                      String reason) {
        Object _ret =
            this.riInvokeExportedMethod(this,"reWorkForHistRecord",new String [] {"java.lang.String","java.lang.String","java.lang.String"},new Object[] {mainId, userId, reason});
        return (String)_ret;
    }
}
