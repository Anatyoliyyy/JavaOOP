package KP2;

import java.time.LocalDateTime;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(2000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());
        Account account3 = new Account(2000, LocalDateTime.now());

        User user = new User("sylvester", account3);
        User user2 = new User("Arnold", account1);
        User userSeller1 = new User("Sylvester", account3);


        Account account = new Account(1000, LocalDateTime.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());

        Lot watch = new Lot(user, "Watch", ProductCategory.ANTIQUES, 1000, "old watch");
        Lot tv = new Lot(user, "TV", ProductCategory.ELECTRONICS, 1200, "new TV");
        Rate rate = new Rate(1100, user2, watch, LocalDateTime.now());
        Rate rate1 = new Rate(1200, user, watch, LocalDateTime.now());
        Rate rate2 = new Rate(1300, user2, watch, LocalDateTime.now());
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
        User winer = trade.checkWinner();
        System.out.println(winer);
        trade.withdraw(trade);
        System.out.println(userSeller1.getRemainingMoney());
        System.out.println(user2.getRemainingMoney());
        System.out.println(Lots.search(1000,3000));
        System.out.println(Lots.search(ProductCategory.ELECTRONICS));
        System.out.println(Lots.search("e"));
        System.out.println(Lots.searchByNamePart("TV"));
        String s = "sd";
        KP2.Lots result = Lots.filter(new PredicateNameContains("T"));
        System.out.println(result);
        KP2.Lots result2 = Lots.filter(new PredicatByStartingPrice(1000, 1300));
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

        /* // check IO file.txt

        orders.getOrdersToTxt();
        orders.loadOrdersFromFile("Orders.txt", orders);
        System.out.println(orders.getNames(""));


        // check binari IO
        orders.clone();
        System.out.println(orders);*/

    }
}



//Account{money=1000, dateRegistration=2018-07-01T15:31:24.201}
//2018-07-01T15:31:24.201
//1000
//true
//Trade{id=a0dd824b-faae-4572-97f3-a27b78fbd25a, currentRate=Rate{currentPrice=1100, user=User{, name='Arnold'}}, startTime=2018-07-01T15:31:24.216, endTime=2018-07-01T15:41:24.201}
//Trade{id=a0dd824b-faae-4572-97f3-a27b78fbd25a, currentRate=Rate{currentPrice=1200, user=User{, name='sylvester'}}, startTime=2018-07-01T15:31:24.216, endTime=2018-07-01T15:41:24.201}
//
//[Rate{currentPrice=1100, user=User{, name='Arnold'}}, Rate{currentPrice=1200, user=User{, name='sylvester'}}, Rate{currentPrice=1300, user=User{, name='Arnold'}}]
//Lots{lots=[Lot{id=33c106d0-43c6-4624-be14-028139671d07, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//
//User{, name='Arnold'}
//3300
//700
//[Lot{id=33c106d0-43c6-4624-be14-028139671d07, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=33c106d0-43c6-4624-be14-028139671d07, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//[Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]
//Lots{lots=[Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//Lots{lots=[Lot{id=33c106d0-43c6-4624-be14-028139671d07, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}, Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}]}
//Trades{trades=[]}
//Trade{id=a0dd824b-faae-4572-97f3-a27b78fbd25a, currentRate=Rate{currentPrice=1300, user=User{, name='Arnold'}}, startTime=2018-07-01T15:31:24.216, endTime=2018-07-01T15:41:24.201}
//Trade{id=ef0695ac-749a-43c4-960f-8c784d1f6241, currentRate=Rate{currentPrice=1300, user=User{, name='Arnold'}}, startTime=2018-07-01T15:31:24.216, endTime=2018-07-01T15:41:24.201}
//Lot{id=85f48ef8-c127-44c9-afef-a8cade2485f6, name='TV', category='ELECTRONICS', startingPrice=1200, description='new TV'}
//Lot{id=33c106d0-43c6-4624-be14-028139671d07, name='Watch', category='ANTIQUES', startingPrice=1000, description='old watch'}
//
//Process finished with exit code 0