/**
 * 
 */
package com.cmm.jft.data.extractor;

import java.time.LocalDate;
import java.util.Date;

import com.cmm.jft.core.enums.GeneralStatus;
import com.cmm.jft.vo.Extractable;

/**
 * <p><code>CVMCia.java</code></p>
 * @author Cristiano M Martins
 * @version 02/03/2015 15:41:55
 *
 */
public class CVMCia implements Extractable {
	
	private String cnpj;
	private String name;
	private String cvmCode;
	private LocalDate statusDate;
	private GeneralStatus status;
	
	/**
	 * @param cnpj
	 * @param name
	 * @param cvmCode
	 * @param statusDate
	 * @param status
	 */
	public CVMCia(String cnpj, String name, String cvmCode, LocalDate statusDate, GeneralStatus status) {
		super();
		this.cnpj = cnpj;
		this.name = name;
		this.cvmCode = cvmCode;
		this.statusDate = statusDate;
		this.status = status;
	}
	
	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return this.cnpj;
	}
	
	/**
	 * @return the cvmCode
	 */
	public String getCvmCode() {
		return this.cvmCode;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return the status
	 */
	public GeneralStatus getStatus() {
		return this.status;
	}
	
	/**
	 * @return the statusDate
	 */
	public LocalDate getStatusDate() {
		return this.statusDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CVMCia [cnpj=" + this.cnpj + ", name=" + this.name
				+ ", cvmCode=" + this.cvmCode + ", statusDate="
				+ this.statusDate + ", status=" + this.status + "]";
	}
	
	public String toCSV() {
		return this.cnpj + ";" + this.name + ";" + this.cvmCode + ";"
				+ this.statusDate + ";" + this.status;
	}
	
}
