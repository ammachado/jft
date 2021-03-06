package com.cmm.jft.vo;

import java.util.Date;

import com.cmm.jft.model.trading.enums.Side;


/**
 * 
 * <p><code>OrderEventVO.java</code></p>
 * @author Cristiano M Martins
 * @version 4 de set de 2015 21:24:43
 * 
 */
public class OrderEventVO implements Extractable, Comparable<OrderEventVO> {

    public long orderID;
    public long eventID;
    public String securityID = "";
    public Side side;
    public Date sessionDate;
    public double price;
    public int volume;
    public Date orderDate;
    public Date orderTime;
    public char orderStatus;
    public int orderEvent;
    public double tradedVolume;
    public int orderCondition;
    public Date eventDate;
    public Date eventTime;

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(OrderEventVO o) {
	int compDt = this.eventDate.compareTo(o.eventDate);
	int compTm = this.eventTime.compareTo(o.eventTime);
	int ret = 0;
	if (compDt == 0) {
	    ret = compTm;
	} else if (compDt < 0) {
	    ret = compDt;
	} else {
	    ret = 1;
	}

	return ret;
    }


    /**
     * @return the orderID
     */
    public long getOrderID() {
	return this.orderID;
    }


    /**
     * @return the eventID
     */
    public long getEventID() {
	return this.eventID;
    }


    /**
     * @return the securityID
     */
    public String getSecurityID() {
	return this.securityID;
    }


    /**
     * @return the side
     */
    public Side getSide() {
	return this.side;
    }


    /**
     * @return the sessionDate
     */
    public Date getSessionDate() {
	return this.sessionDate;
    }


    /**
     * @return the price
     */
    public double getPrice() {
	return this.price;
    }


    /**
     * @return the volume
     */
    public double getVolume() {
	return this.volume;
    }


    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
	return this.orderDate;
    }


    /**
     * @return the orderTime
     */
    public Date getOrderTime() {
	return this.orderTime;
    }


    /**
     * @return the orderStatus
     */
    public char getOrderStatus() {
	return this.orderStatus;
    }


    /**
     * @return the orderEvent
     */
    public int getOrderEvent() {
	return this.orderEvent;
    }


    /**
     * @return the tradedVolume
     */
    public double getTradedVolume() {
	return this.tradedVolume;
    }


    /**
     * @return the orderCondition
     */
    public int getOrderCondition() {
	return this.orderCondition;
    }


    /**
     * @return the eventDate
     */
    public Date getEventDate() {
	return this.eventDate;
    }


    /**
     * @return the eventTime
     */
    public Date getEventTime() {
	return this.eventTime;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "OrderEventVO [orderID=" + this.orderID + ", eventID=" + this.eventID + ", securityID=" + this.securityID
		+ ", side=" + this.side + ", sessionDate=" + this.sessionDate + ", price=" + this.price + ", volume="
		+ this.volume + ", orderDate=" + this.orderDate + ", orderTime=" + this.orderTime + ", orderStatus="
		+ this.orderStatus + ", orderEvent=" + this.orderEvent + ", tradedVolume=" + this.tradedVolume
		+ ", orderCondition=" + this.orderCondition + ", eventDate=" + this.eventDate + ", eventTime="
		+ this.eventTime + "]";
    }





}
