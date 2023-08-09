package com.example.demosrm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table(name = "SRM_LOC_INDENT")

public class SrmLocIndent {
	@Id
	@Column(name = "LOC_INDENT_ID", length = 24)
	private String locIndentId;

	@Column(name = "LOCATION_CODE", length = 24)
	private String locationCode;

	@Column(name = "DIVISION_CODE", length = 24)
	private String divisionCode;

	@Column(name = "ZONE_CODE", length = 24)
	private String zoneCode;

	@Column(name = "INDENT_TYPE")
	private char indentType;

	@Column(name = "STOCK_TYPE")
	private char stockType;

	@Column(name = "PREVIOUS_CONSUMPTION", length = 24)
	private float previousConsumption;

	@Column(name = "INDENTOR", length = 24)
	private String indentor;
	
	@Column(name = "INDENTED_QTY", length = 24)
	private Float intendedQty;
	
	@Column(name = "INDENTED_DATE", length = 24)
	private Date indentedDate;

	@Column(name = "INDENTOR_REMARKS ", length = 24)
	private String indentorRemarks;

	@Column(name = "INDENT_STATUS_ID", length = 24)
	private char indentStatusId;

	@Column(name = "APPROVED_BY", length = 24)
	private String approvedBy;
	@Column(name = "APPROVED_QTY", length = 24)
	private Float approvedQty;

	@Column(name = "APPROVED_DATE")
	private char approvedDate;

	@Column(name = "APPROVED_REMARKS")
	private Date approvedRemarks;

	@Column(name = "DELIVERY_REQUIRED_BY")
	private Date deliveryRequiredBy;

	@Column(name = "HQ_INDENT_ID", length = 24)
	private String hqIndentId;

	@Column(name = "HQ_INDENT_DATE")
	private String hqIndentDate;

	@Column(name = "RECEIVED_QTY", length = 24)
	private Float receivedQty;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Column(name = "LAST_MODIFIED_BY", length = 24)
	private String lastModifiedBy;
}