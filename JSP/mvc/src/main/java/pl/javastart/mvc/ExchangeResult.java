package pl.javastart.mvc;

import java.math.BigDecimal;

public class ExchangeResult {
    private BigDecimal base;
    private BigDecimal result;
    private ExchangeType exchangeType;

    public ExchangeResult(BigDecimal base, BigDecimal result, ExchangeType exchangeType) {
        this.base = base;
        this.result = result;
        this.exchangeType = exchangeType;
    }

    public BigDecimal getBase() {
        return base;
    }

    public ExchangeType getExchangeType() {
        return exchangeType;
    }

    public BigDecimal getResult() {
        return result;
    }
}
