package network.impl.tp2p;

import network.api.advertisement.Advertisement;
import network.impl.AbstractAdvertisement;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jdom2.output.XMLOutputter;

public class Tp2pAdvertisement extends AbstractAdvertisement{
    static private Logger log = LogManager.getLogger(Tp2pAdvertisement.class);
    private Advertisement adv;

    public Tp2pAdvertisement (Advertisement adv){
        log.info("Adv : \n" + new XMLOutputter().outputString(adv.getDocument()));
        this.adv = adv;
    }

    @Override
    public String getName() {
        return adv.getName();
    }

    @Override
    public String getAdvertisementType() {
        return "tomP2P" + getName();
    }
}
