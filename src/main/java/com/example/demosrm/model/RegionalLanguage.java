package com.example.demosrm.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "REGIONAL_LANGUAGE")
public class RegionalLanguage {
	
	 @EmbeddedId
	    private LangPk id;

	  
	   @Embeddable
	   public static class LangPk implements Serializable {

			@Column(name = "language_name")
			private String	 languageName;
			
			@Column(name = "authority_zone")
			private String	 authorityZone;

	   }
	
		@Column(name = "language_id")
		private int	 languageId;
		
		
		@Column(name = "language_code")
		private String	 languageCode;
		

	
	@Column(name = "action")
	private String	 action;
	
	@Column(name = "version")
	private int	version;
	
	
	@Column(name = "valid_from")
	private Date  validFrom;
	
	@Column(name = "valid_upto")
	private Date validUpto;
	
	@Column(name = "status")
	private int status ;
	
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	
	
	
	
	 
	
	
	
	
	

}
