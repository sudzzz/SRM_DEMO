package com.example.demosrm.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "PRIV")
public class Priv {
	
	
	 @EmbeddedId
	    private PrivPk id;

	  
	   @Embeddable
	   public static class PrivPk implements Serializable {
		   
		@Column(name = "privilege_id")
		private int privilegeId;

	   }
	   
	@Column(name = "privilege")
	private String privilege;
	
	@Column(name = "sub_privilege")
	private String subPrivilege;
	
	
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private int status;


}
