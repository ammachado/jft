/**
 * 
 */
package com.cmm.jft.model.marketdata;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cmm.jft.db.DBObject;
import com.cmm.jft.model.security.Security;
import com.cmm.jft.model.util.JpaConverters;

/**
 * <p>
 * <code>HistoricalQuote.java</code>
 * </p>
 * 
 * @author Cristiano M Martins
 * @version 19/09/2013 17:45:57
 *
 */
@Entity
@Table(name = "HistoricalQuote", schema="MarketData")
public class HistoricalQuote implements DBObject<HistoricalQuote> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "historicalQuoteId", nullable = false)
	private Long historicalQuoteId;

	@Convert(converter=JpaConverters.LocalDateConverter.class)
	@Column(name = "QDateTime", nullable = false)
	private LocalDate qDateTime;

	@Column(name = "Open", precision = 19, scale = 10, nullable = false)
	private BigDecimal open;

	@Column(name = "Close", precision = 19, scale = 10, nullable = false)
	private BigDecimal close;

	@Column(name = "High", precision = 19, scale = 10, nullable = false)
	private BigDecimal high;

	@Column(name = "Low", precision = 19, scale = 10, nullable = false)
	private BigDecimal low;

	@Column(name = "Bid", precision = 19, scale = 10, nullable = false)
	private BigDecimal bid;

	@Column(name = "Ask", precision = 19, scale = 10, nullable = false)
	private BigDecimal ask;
	
	@Column(name = "AdjOpen", precision = 19, scale = 10, nullable = false)
	private BigDecimal adjOpen;

	@Column(name = "AdjClose", precision = 19, scale = 10, nullable = false)
	private BigDecimal adjClose;

	@Column(name = "AdjHigh", precision = 19, scale = 10, nullable = false)
	private BigDecimal adjHigh;

	@Column(name = "AdjLow", precision = 19, scale = 10, nullable = false)
	private BigDecimal adjLow;

	@Column(name = "AvgPrice", precision = 19, scale = 10, nullable = false)
	private BigDecimal avgPrice;

	@Column(name = "Volume", precision = 19, scale = 2, nullable = false)
	private BigDecimal volume;

	@Column(name = "TradedUnits")
	private Long tradedUnits;

	@Column(name = "TradedQuantity")
	private Long tradedQuantity;

	@Column(name = "QuoteFactor")
	private int quoteFactor;

	@JoinColumn(name = "securityId", referencedColumnName = "securityId", nullable = false)
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Security securityId;

	public HistoricalQuote() {

	}

	/**
	 * @return the qDateTime
	 */
	public LocalDate getqDateTime() {
		return this.qDateTime;
	}

	/**
	 * @param qDateTime
	 *            the qDateTime to set
	 */
	public void setqDateTime(LocalDate qDateTime) {
		this.qDateTime = qDateTime;
	}

	/**
	 * @return the open
	 */
	public BigDecimal getOpen() {
		return this.open;
	}

	/**
	 * @param open
	 *            the open to set
	 */
	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	/**
	 * @return the close
	 */
	public BigDecimal getClose() {
		return this.close;
	}

	/**
	 * @param close
	 *            the close to set
	 */
	public void setClose(BigDecimal close) {
		this.close = close;
	}

	/**
	 * @return the adjClose
	 */
	public BigDecimal getAdjClose() {
		return this.adjClose;
	}

	/**
	 * @param adjClose
	 *            the adjClose to set
	 */
	public void setAdjClose(BigDecimal adjClose) {
		this.adjClose = adjClose;
	}

	/**
	 * @return the high
	 */
	public BigDecimal getHigh() {
		return this.high;
	}

	/**
	 * @param high
	 *            the high to set
	 */
	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	/**
	 * @return the low
	 */
	public BigDecimal getLow() {
		return this.low;
	}

	/**
	 * @param low
	 *            the low to set
	 */
	public void setLow(BigDecimal low) {
		this.low = low;
	}

	/**
	 * @return the adjOpen
	 */
	public BigDecimal getAdjOpen() {
		return adjOpen;
	}

	/**
	 * @param adjOpen the adjOpen to set
	 */
	public void setAdjOpen(BigDecimal adjOpen) {
		this.adjOpen = adjOpen;
	}

	/**
	 * @return the adjHigh
	 */
	public BigDecimal getAdjHigh() {
		return adjHigh;
	}

	/**
	 * @param adjHigh the adjHigh to set
	 */
	public void setAdjHigh(BigDecimal adjHigh) {
		this.adjHigh = adjHigh;
	}
	
	/**
	 * @return the adjLow
	 */
	public BigDecimal getAdjLow() {
		return adjLow;
	}

	/**
	 * @param adjLow the adjLow to set
	 */
	public void setAdjLow(BigDecimal adjLow) {
		this.adjLow = adjLow;
	}

	/**
	 * @return the quoteFactor
	 */
	public int getQuoteFactor() {
		return quoteFactor;
	}

	/**
	 * @param quoteFactor the quoteFactor to set
	 */
	public void setQuoteFactor(int quoteFactor) {
		this.quoteFactor = quoteFactor;
	}

	/**
	 * @param historicalQuoteId the historicalQuoteId to set
	 */
	public void setHistoricalQuoteId(Long historicalQuoteId) {
		this.historicalQuoteId = historicalQuoteId;
	}

	/**
	 * @return the bid
	 */
	public BigDecimal getBid() {
		return this.bid;
	}

	/**
	 * @param bid
	 *            the bid to set
	 */
	public void setBid(BigDecimal bid) {
		this.bid = bid;
	}

	/**
	 * @return the ask
	 */
	public BigDecimal getAsk() {
		return this.ask;
	}

	/**
	 * @param ask
	 *            the ask to set
	 */
	public void setAsk(BigDecimal ask) {
		this.ask = ask;
	}

	/**
	 * @return the avgPrice
	 */
	public BigDecimal getAvgPrice() {
		return this.avgPrice;
	}

	/**
	 * @param avgPrice
	 *            the avgPrice to set
	 */
	public void setAvgPrice(BigDecimal avgPrice) {
		this.avgPrice = avgPrice;
	}

	/**
	 * @return the volume
	 */
	public BigDecimal getVolume() {
		return this.volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	/**
	 * @return the tradedUnits
	 */
	public Long getTradedUnits() {
		return this.tradedUnits;
	}

	/**
	 * @param tradedUnits
	 *            the tradedUnits to set
	 */
	public void setTradedUnits(Long tradedUnits) {
		this.tradedUnits = tradedUnits;
	}

	/**
	 * @return the tradedQuantity
	 */
	public Long getTradedQuantity() {
		return this.tradedQuantity;
	}

	/**
	 * @param tradedQuantity
	 *            the tradedQuantity to set
	 */
	public void setTradedQuantity(Long tradedQuantity) {
		this.tradedQuantity = tradedQuantity;
	}

	/**
	 * @return the securityId
	 */
	public Security getSecurityId() {
		return this.securityId;
	}

	/**
	 * @param securityId
	 *            the securityId to set
	 */
	public void setSecurityId(Security securityId) {
		this.securityId = securityId;
	}

	/**
	 * @return the historicalQuoteId
	 */
	public Long getHistoricalQuoteId() {
		return this.historicalQuoteId;
	}

	@Override
	public String toString() {
		return "HistoricalQuote [historicalQuoteId=" + historicalQuoteId + ", qDateTime=" + qDateTime + ", open=" + open
				+ ", close=" + close + ", high=" + high + ", low=" + low + ", bid=" + bid + ", ask=" + ask
				+ ", adjOpen=" + adjOpen + ", adjClose=" + adjClose + ", adjHigh=" + adjHigh + ", adjLow=" + adjLow
				+ ", avgPrice=" + avgPrice + ", volume=" + volume + ", tradedUnits=" + tradedUnits + ", tradedQuantity="
				+ tradedQuantity + ", quoteFactor=" + quoteFactor + ", securityId=" + securityId + "]";
	}

}
