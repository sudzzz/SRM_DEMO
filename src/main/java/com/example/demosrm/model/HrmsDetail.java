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
@Table(name = "HRMS_DETAIL")
public class HrmsDetail {

	 @EmbeddedId
	 private HrmsPk id;
	 
	  @Embeddable
	    public static class HrmsPk implements Serializable {
		  
		  	@Column(name = "user_id")
			private String  userId;
			
			
			@Column(name = "hrms_id")
			private String  hrmsId;

			@Column(name = "valid_from")
			private Date  validFrom;
			
		  
	    
	    }

	@Column(name = "valid_upto")
	private Date validUpto ;

	@Column(name = "user_status")
	private int userStatus ;
	

	@Column(name = "last_modified")
	private Date lastModified ;
	

	@Column(name = "hrms_username")
	private String  hrmsUsername ;

	

	

}
