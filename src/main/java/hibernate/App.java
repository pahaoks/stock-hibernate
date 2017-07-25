package hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Stock stock = new Stock();
        stock.setStockCode("4723");
        stock.setStockName("GENM71");
        session.save(stock);
        session.getTransaction().commit();

        //List<Stock> list = session.createCriteria(Stock.class).list();
        List<Stock> list = session.createQuery("from Stock where stockName = 'GENM70'").list();
        for (Stock s: list) {
            System.out.println(s.stockName + " " + s.stockCode + " " + s.stockId);
        }

        session.close();
    }
}