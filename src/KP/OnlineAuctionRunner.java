package KP;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(2000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());
        Account account3 = new Account(2000, LocalDateTime.now());

        UserBuyer userBuyer = new UserBuyer("sylvester", account3);
        UserBuyer userBuyer2 = new UserBuyer("Arnold", account1);
        UserSeller userSeller1 = new UserSeller("Sylvester", account3);


        Account account = new Account(1000, LocalDateTime.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());

        Lot watch = new Lot(userSeller1, "Watch", ProductCategory.ANTIQUES, 1000, "old watch");
        Lot tv = new Lot(userSeller1, "TV", ProductCategory.ELECTRONICS, 1200, "new TV");
        Rate rate = new Rate(1100, userBuyer2, watch, LocalDateTime.now());
        Rate rate1 = new Rate(1200, userBuyer, watch, LocalDateTime.now());
        Rate rate2 = new Rate(1300, userBuyer2, watch, LocalDateTime.now());
        LocalDateTime end = (LocalDateTime.now()).plusMinutes(10);
//        LocalDateTime end = (LocalDateTime.now()).minusMinutes(10);

        Trade trade = new Trade(watch, rate, LocalDateTime.now(), end);
        Trade trade1 = new Trade(tv, rate2, LocalDateTime.now(), end);
        trade.addRate(rate);

        System.out.println(trade.checkTimeOut());
        System.out.println(trade);
        trade.addRate(rate1);
        System.out.println(trade);
        trade.addRate(rate2);
        System.out.println();
        System.out.println(trade.getRatesHistory());


        Lots Lots = new Lots();
        Lots.addLot(watch);
        Lots.addLot(tv);
        System.out.println(Lots);
        System.out.println();
        UserBuyer winer = trade.checkWinner();
        System.out.println(winer);
        trade.withdraw(trade);
        System.out.println(userSeller1.getRemainingMoney());
        System.out.println(userBuyer2.getRemainingMoney());
        System.out.println(Lots.search(1000,3000));
        System.out.println(Lots.search(ProductCategory.ELECTRONICS));
        System.out.println(Lots.search("e"));
        System.out.println(Lots.searchByNamePart("TV"));
        String s = "sd";
        Lots result = Lots.filter(new PredicateNameContains("T"));
        System.out.println(result);
        Lots result2 = Lots.filter(new PredicatByStartingPrice(1000, 1300));
        System.out.println(result2);
        Trades tradess = new Trades();

        tradess.addtrade(trade);
        tradess.addtrade(trade1);

        Trades result3 = tradess.filter(new PredicatorHasExpiredDeadline());
        System.out.println(result3);

        tradess.sort(ComparatorsForAuction.byDeadline());
        for (Trade t : tradess.getTrades()
                ) {
            System.out.println(t);
        }

        Lots.sort(ComparatorsForAuction.byName());
        for (Lot t : Lots.getLots()
                ) {
            System.out.println(t);

        }
    }
}



//Account{money=1000, dateRegistration=2018-06-22T22:19:09.146}
//2018-06-22T22:19:09.146
//1000
//true
//Trade{id=4adab9c2-f87c-4b9c-b282-e4b2595d8880, currentRate=Rate{currentPrice=1100, userBuyer=UserBuyer{, name='Arnold'}}, startTime=2018-06-22T22:19:09.146, endTime=2018-06-22T22:29:09.146}
//Trade{id=4adab9c2-f87c-4b9c-b282-e4b2595d8880, currentRate=Rate{currentPrice=1200, userBuyer=UserBuyer{, name='sylvester'}}, startTime=2018-06-22T22:19:09.146, endTime=2018-06-22T22:29:09.146}
//
//[Rate{currentPrice=1100, userBuyer=UserBuyer{, name='Arnold'}}, Rate{currentPrice=1200, userBuyer=UserBuyer{, name='sylvester'}}, Rate{currentPrice=1300, userBuyer=UserBuyer{, name='Arnold'}}]
//Lots{lots=[Lot{id=42ac71d7-a536-4a6c-b6ef-5e6adbf3c2db, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//
//UserBuyer{, name='Arnold'}
//3300
//700
//[Lot{id=42ac71d7-a536-4a6c-b6ef-5e6adbf3c2db, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=42ac71d7-a536-4a6c-b6ef-5e6adbf3c2db, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//Lots{lots=[Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//Lots{lots=[Lot{id=42ac71d7-a536-4a6c-b6ef-5e6adbf3c2db, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//Trades{trades=[]}
//Trade{id=4adab9c2-f87c-4b9c-b282-e4b2595d8880, currentRate=Rate{currentPrice=1300, userBuyer=UserBuyer{, name='Arnold'}}, startTime=2018-06-22T22:19:09.146, endTime=2018-06-22T22:29:09.146}
//Trade{id=fcefdb72-e54a-49f9-8702-1b0062d22cfe, currentRate=Rate{currentPrice=1300, userBuyer=UserBuyer{, name='Arnold'}}, startTime=2018-06-22T22:19:09.146, endTime=2018-06-22T22:29:09.146}
//Lot{id=7b0dbdbd-307d-4101-89d6-c4fc10c41bdd, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}
//Lot{id=42ac71d7-a536-4a6c-b6ef-5e6adbf3c2db, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}
//
//Process finished with exit code 0