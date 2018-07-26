package OnlineAuction.Runners;

import OnlineAuction.*;
import OnlineAuction.Enums.Category;
import OnlineAuction.SortAndFilter.AuctionPredicates;

public class FilterRunner {
    public static void main(String[] args) {
        User user = new User("Dima",new Account(10000));
        User user1 = new User("Vlad", new Account(20000));
        User user2 = new User("Vasya", new Account(15000));

        Product iphone = new Product("Iphone 5S", "like new",2, Category.SMARTPHONE);
        Product macBook = new Product("MacBook", "something",1,Category.COMPUTERS);
        Product samsung = new Product("Galaxy s8", "something",1,Category.SMARTPHONE);

        Lot lot1 = user.createLot(iphone,1000);
        Lot lot2 = user2.createLot(macBook, 3000);
        Lot lot3 = user.createLot(iphone,2000);
        Lot lot4 = user1.createLot(samsung,10000);
        Lot lot5 = user.createLot(macBook, 1200);
        Lot lot6 = user.createLot(samsung, 1500);
        Lot lot7 = user.createLot(samsung, 2500);
        Lot lot8 = user.createLot(iphone, 3500);

        AuctionsList lots = new AuctionsList();
        lots.addLot(lot1);
        lots.addLot(lot2);
        lots.addLot(lot3);
        lots.addLot(lot4);
        lots.addLot(lot5);
        lots.addLot(lot6);
        lots.addLot(lot7);
        lots.addLot(lot8);

        System.out.println(lots.filter(AuctionPredicates.hasPrice(1000,2000))); //1000,1200,1500,2000
        System.out.println(lots.filter(AuctionPredicates.nameContains("Gal")));
        System.out.println(lots.filter(AuctionPredicates.hasCategory(Category.COMPUTERS)));
    }
}

//AuctionsList{lotList=[Lot{product=Product{name='Iphone 5S', quantity=2, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.065, endTime=2018-07-15T12:37:58.065, currentPrice=1000, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}, Lot{product=Product{name='Iphone 5S', quantity=2, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.181, endTime=2018-07-15T12:37:58.181, currentPrice=2000, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}, Lot{product=Product{name='MacBook', quantity=1, category=COMPUTERS}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=1200, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}, Lot{product=Product{name='Galaxy s8', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=1500, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}]}
//AuctionsList{lotList=[Lot{product=Product{name='Galaxy s8', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=10000, owner=User{name='Vlad', account=Account{money=20000}}, status=RUNNING}, Lot{product=Product{name='Galaxy s8', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=1500, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}, Lot{product=Product{name='Galaxy s8', quantity=1, category=SMARTPHONE}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=2500, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}]}
//AuctionsList{lotList=[Lot{product=Product{name='MacBook', quantity=1, category=COMPUTERS}, startTime=2018-07-15T12:37:53.181, endTime=2018-07-15T12:37:58.181, currentPrice=3000, owner=User{name='Vasya', account=Account{money=15000}}, status=RUNNING}, Lot{product=Product{name='MacBook', quantity=1, category=COMPUTERS}, startTime=2018-07-15T12:37:53.182, endTime=2018-07-15T12:37:58.182, currentPrice=1200, owner=User{name='Dima', account=Account{money=10000}}, status=RUNNING}]}
//
//Process finished with exit code 0