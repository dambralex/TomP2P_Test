import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Random;

import net.tomp2p.connection.Bindings;
import net.tomp2p.dht.FutureGet;
import net.tomp2p.dht.PeerBuilderDHT;
import net.tomp2p.dht.PeerDHT;
import net.tomp2p.futures.FutureBootstrap;
import net.tomp2p.futures.FutureDiscover;
import net.tomp2p.p2p.Peer;
import net.tomp2p.p2p.PeerBuilder;
import net.tomp2p.peers.Number160;
import net.tomp2p.storage.Data;

public class Application{

    // 145.239.76.112:9800

    static private PeerDHT peerDHT;

    public Application(int peerId) throws Exception {

        Peer peer = new PeerBuilder(new Number160(new Random())).ports(4001).start();

        InetAddress address = Inet4Address.getByName("139.124.211.106");
        FutureDiscover futureDiscover = peer.discover().inetAddress( address ).ports( 4000 ).start();
        futureDiscover.awaitUninterruptibly();
        FutureBootstrap futureBootstrap = peer.bootstrap().inetAddress( address ).ports( 4000 ).start();
        futureBootstrap.awaitUninterruptibly();



//        peerDHT = new PeerBuilderDHT(peer).start();

//        FutureBootstrap fb = this.peerDHT.peer().bootstrap().inetAddress(InetAddress.getByName("127.0.0.1")).ports(4001).start();
//        fb.awaitUninterruptibly();
//        if(fb.isSuccess()) {
//            peerDHT.peer().discover().peerAddress(fb.bootstrapTo().iterator().next()).start().awaitUninterruptibly();
//        }
    }

    public static void main(String[] args) throws NumberFormatException, Exception {
        Application dns = new Application(Integer.parseInt(args[0]));
        if (args.length == 3) {
            dns.store(args[1], "Salut Alex");
        }
        if (args.length == 2) {
            System.out.println("Name:" + args[1] + " IP:" + dns.get(args[1]));
        }
//        Random rnd = new Random();
//
//        Peer peer = new PeerBuilder(new Number160(rnd)).ports(9801).start();
//        peerDHT = new PeerBuilderDHT(peer).start();
//
//        InetAddress address = Inet4Address.getByName("145.239.76.112");
//        FutureDiscover futureDiscover = peer.discover().inetAddress(address).ports(9800).start();
//        futureDiscover.awaitUninterruptibly();
//
//        FutureBootstrap futureBootstrap = peer.bootstrap().inetAddress(address).ports(9800).start();
//        futureBootstrap.awaitUninterruptibly();
//
//        if(futureBootstrap.isSuccess()){
//            System.out.println("Connection done");
//            peerDHT.peer().discover().peerAddress(futureBootstrap.bootstrapTo().iterator().next()).start().awaitUninterruptibly();
//        }
    }

    private String get(String name) throws ClassNotFoundException, IOException {
        FutureGet futureGet = peerDHT.get(Number160.createHash(name)).start();
        futureGet.awaitUninterruptibly();
        if (futureGet.isSuccess()) {
            return futureGet.dataMap().values().iterator().next().object().toString();
        }
        return "not found";
    }

    private void store(String name, String ip) throws IOException {
        peerDHT.put(Number160.createHash(name)).data(new Data(ip)).start().awaitUninterruptibly();
    }

}