package OnlineAuction.Runners;

import OnlineAuction.*;
import OnlineAuction.Enums.Category;
import OnlineAuction.IO.LotsBinIO;
import OnlineAuction.IO.LotsTextIO;

import java.io.IOException;

public class IORunner {
    public static void main(String[] args) {
        User user = new User("Oleg", new Account(100000));
        Product product = new Product("Iphone", "something", 1, Category.SMARTPHONE);
        Product product1 = new Product("Samsung", "something", 1, Category.APPLIANCES);
        Product product2 = new Product("Acer", "something", 1, Category.COMPUTERS);
        Lot lot = user.createLot(product,1000);
        Lot lot1 = user.createLot(product1, 5000);
        Lot lot2 = user.createLot(product2, 3000);

        AuctionsList auctionsList = new AuctionsList();
        auctionsList.addLot(lot);
        auctionsList.addLot(lot1);
        auctionsList.addLot(lot2);

        System.out.println(auctionsList);

        try {
            LotsBinIO.writeIntoBinFile("Lots", auctionsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try {
            AuctionsList newAuctionsList = LotsBinIO.readFromBinFile("Lots");
            System.out.println(newAuctionsList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            LotsTextIO.writeText("Lots.txt",auctionsList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

//AuctionsList{lotList=[Lot{product=Product{name='Iphone', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:38:16.005, endTime=2018-07-15T12:38:21.005, currentPrice=1000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}, Lot{product=Product{name='Samsung', quantity=1, category=APPLIANCES}, startTime=2018-07-15T12:38:16.126, endTime=2018-07-15T12:38:21.126, currentPrice=5000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}, Lot{product=Product{name='Acer', quantity=1, category=COMPUTERS}, startTime=2018-07-15T12:38:16.126, endTime=2018-07-15T12:38:21.126, currentPrice=3000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}]}
//
//AuctionsList{lotList=[Lot{product=Product{name='Iphone', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:38:16.005, endTime=2018-07-15T12:38:21.005, currentPrice=1000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}, Lot{product=Product{name='Samsung', quantity=1, category=APPLIANCES}, startTime=2018-07-15T12:38:16.126, endTime=2018-07-15T12:38:21.126, currentPrice=5000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}, Lot{product=Product{name='Acer', quantity=1, category=COMPUTERS}, startTime=2018-07-15T12:38:16.126, endTime=2018-07-15T12:38:21.126, currentPrice=3000, owner=User{name='Oleg', account=Account{money=100000}}, status=RUNNING}]}
//
//Process finished with exit code 0