package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "stock", catalog = "learningDb")
public class Stock {
    @Id
    @Column(name = "STOCK_ID")
    int stockId;

    @Column(name = "STOCK_CODE")
    String stockCode;

    @Column(name = "STOCK_NAME")
    String stockName;

    public Stock() {
    }

    public Stock(int stockId, String stockCode, String stockName) {
        this.stockId = stockId;
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
