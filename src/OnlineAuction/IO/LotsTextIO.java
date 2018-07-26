package OnlineAuction.IO;

import OnlineAuction.AuctionsList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LotsTextIO {
    public static void writeText (String fileName, AuctionsList auctionsList) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(String.valueOf(auctionsList));
        bufferedWriter.close();
    }
}
