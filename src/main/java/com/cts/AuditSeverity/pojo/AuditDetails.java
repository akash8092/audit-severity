package com.cts.AuditSeverity.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * 
This POJO class is for AuditDetails
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class AuditDetails {
	/**
	 * Variable auditType is used to store the type of Audit
	 */
	private String auditType;
	/**
	 * Variable auditQuestions is used to store the Audit responses of question
	 */
	private List<QuestionsEntity> auditQuestions;
	
		
}
