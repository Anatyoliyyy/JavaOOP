package OnlineAuction.IO;

import OnlineAuction.AuctionsList;

import java.io.*;

public class LotsBinIO {

    public static AuctionsList readFromBinFile (String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            return (AuctionsList) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            objectInputStream.close();
        }
        return null;
    }

    public static void writeIntoBinFile (String fileName, AuctionsList auctionsList) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(auctionsList);
        objectOutputStream.close();
    }
}

