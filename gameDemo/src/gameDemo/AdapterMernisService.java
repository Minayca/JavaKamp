package gameDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class AdapterMernisService implements ServicePlayerCheck{

    @Override
    public Boolean checkIfRealPerson(EntityPlayer player) {
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

        boolean result = false;
        try {
            result = kpsPublicSoapProxy.TCKimlikNoDogrula(
                    Long.parseLong(player.getNationalityId()),
                    player.getFirstName().toUpperCase(),
                    player.getLastName().toUpperCase(),
                    player.getDateOfBirth().getYear()
                    );
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }

}