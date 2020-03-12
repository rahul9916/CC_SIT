package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class assessments implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("activeUser")
	private java.lang.String activeUser;
	@org.kie.api.definition.type.Label("assessmentCaseTime")
	private Long assessmentCaseTime;
	@org.kie.api.definition.type.Label("assessmentCreator")
	private java.lang.String assessmentCreator;
	@org.kie.api.definition.type.Label("assessmentOwner")
	private java.lang.String assessmentOwner;
	@org.kie.api.definition.type.Label("assessmentId")
	private java.lang.String assessmentId;
	@org.kie.api.definition.type.Label("brand")
	private java.lang.String brand;
	@org.kie.api.definition.type.Label("brandDescription")
	private java.lang.String brandDescription;
	@org.kie.api.definition.type.Label("dueDate")
	private java.lang.Long dueDate;
	@org.kie.api.definition.type.Label("caseStatus")
	private java.lang.String caseStatus;
	@org.kie.api.definition.type.Label("containerId")
	private java.lang.String containerId;
	@org.kie.api.definition.type.Label("createdAt")
	private java.lang.Long createdAt;
	@org.kie.api.definition.type.Label("createdBy")
	private java.lang.String createdBy;
	@org.kie.api.definition.type.Label("delayReason")
	private java.lang.String delayReason;
	@org.kie.api.definition.type.Label("delayType")
	private java.lang.String delayType;
	@org.kie.api.definition.type.Label("imsPrefix")
	private java.lang.String imsPrefix;
	@org.kie.api.definition.type.Label("processId")
	private java.lang.String processId;
	@org.kie.api.definition.type.Label("processInstanceId")
	private Long processInstanceId;
	@org.kie.api.definition.type.Label("requestType")
	private java.lang.String requestType;
	@org.kie.api.definition.type.Label("resendAssessment")
	private java.lang.Boolean resendAssessment;
	@org.kie.api.definition.type.Label("triggerSource")
	private java.lang.String triggerSource;
	@org.kie.api.definition.type.Label("subBrand")
	private java.lang.String subBrand;
	@org.kie.api.definition.type.Label("subBrandDescription")
	private java.lang.String subBrandDescription;
	@org.kie.api.definition.type.Label("vaStatus")
	private java.lang.String vaStatus;

	@org.kie.api.definition.type.Label("assessmentCustomerDetails")
	private com.myteam.tts_connected_claims.assessmentCustomerDetails assessmentCustomerDetails;

	@org.kie.api.definition.type.Label("assessmentPolicyDetails")
	private com.myteam.tts_connected_claims.assessmentPolicyDetails assessmentPolicyDetails;

	@org.kie.api.definition.type.Label("claimDetails")
	private com.myteam.tts_connected_claims.claimDetails claimDetails;

	@org.kie.api.definition.type.Label("channel")
	private com.myteam.tts_connected_claims.channel channel;

	@org.kie.api.definition.type.Label("classification")
	private com.myteam.tts_connected_claims.classification classification;

	@org.kie.api.definition.type.Label("timeline")
	private java.util.List<com.myteam.tts_connected_claims.timeline> timeline;

	@org.kie.api.definition.type.Label("caseClosedReason")
	private java.lang.String caseClosedReason;

	@org.kie.api.definition.type.Label("caseCancelledReason")
	private java.lang.String caseCancelledReason;

	@org.kie.api.definition.type.Label("coverType")
	private com.myteam.tts_connected_claims.coverType coverType;

	@org.kie.api.definition.type.Label("taskDashBoard")
	private java.lang.Boolean taskDashBoard;

	@org.kie.api.definition.type.Label("claimsData")
	private com.myteam.tts_connected_claims.claimsData claimsData;

	@org.kie.api.definition.type.Label("personSequenceNumber")
	private java.lang.String personSequenceNumber;

	@org.kie.api.definition.type.Label("riskItemSequenceNumber")
	private java.lang.String riskItemSequenceNumber;

	@org.kie.api.definition.type.Label("refferedToLA")
	private java.lang.Boolean refferedToLA;

	@org.kie.api.definition.type.Label("completedByLA")
	private java.lang.Boolean completedByLA;

	@org.kie.api.definition.type.Label("ownerGroupList")
	private java.util.List<java.lang.String> ownerGroupList;

	@org.kie.api.definition.type.Label("groupList")
	private java.util.List<java.lang.String> groupList;

	@org.kie.api.definition.type.Label("customerFollowUp")
	private java.lang.Boolean customerFollowUp;

	@org.kie.api.definition.type.Label("followUpCompleted")
	private java.lang.Boolean followUpCompleted;

	@org.kie.api.definition.type.Label("vehicleInnerDamage")
	private com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage;

	@org.kie.api.definition.type.Label("vehicleOuterDamage")
	private com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage;

	@org.kie.api.definition.type.Label("cancellationTime")
	private java.lang.Long cancellationTime;

	@org.kie.api.definition.type.Label("assessmentCompleted")
	private java.lang.Boolean assessmentCompleted;

	@org.kie.api.definition.type.Label("vehicleDamageAreaAssessment")
	private java.lang.Boolean vehicleDamageAreaAssessment;

	@org.kie.api.definition.type.Label("documentList")
	private java.util.List<java.lang.String> documentList;

	@org.kie.api.definition.type.Label("nonMotorClaimStatus")
	private String nonMotorClaimStatus;

	@org.kie.api.definition.type.Label("incidentCaseId")
	private java.lang.String incidentCaseId;

	@org.kie.api.definition.type.Label("sentDate")
	private java.lang.Long sentDate;

	@org.kie.api.definition.type.Label("completeReview")
	private java.lang.Boolean completeReview;

	@org.kie.api.definition.type.Label(value = "tpDriverDetails")
	private java.util.List<java.lang.String> tpDriverDetails;

	public assessments() {
	}

	public java.lang.String getActiveUser() {
		return this.activeUser;
	}

	public void setActiveUser(java.lang.String activeUser) {
		this.activeUser = activeUser;
	}

	public java.lang.String getAssessmentCreator() {
		return this.assessmentCreator;
	}

	public void setAssessmentCreator(java.lang.String assessmentCreator) {
		this.assessmentCreator = assessmentCreator;
	}

	public java.lang.String getAssessmentOwner() {
		return this.assessmentOwner;
	}

	public void setAssessmentOwner(java.lang.String assessmentOwner) {
		this.assessmentOwner = assessmentOwner;
	}

	public java.lang.String getAssessmentId() {
		return this.assessmentId;
	}

	public void setAssessmentId(java.lang.String assessmentId) {
		this.assessmentId = assessmentId;
	}

	public java.lang.String getBrand() {
		return this.brand;
	}

	public void setBrand(java.lang.String brand) {
		this.brand = brand;
	}

	public java.lang.String getBrandDescription() {
		return this.brandDescription;
	}

	public void setBrandDescription(java.lang.String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public java.lang.Long getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(java.lang.Long dueDate) {
		this.dueDate = dueDate;
	}

	public java.lang.String getCaseStatus() {
		return this.caseStatus;
	}

	public void setCaseStatus(java.lang.String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public java.lang.String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(java.lang.String containerId) {
		this.containerId = containerId;
	}

	public java.lang.Long getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(java.lang.Long createdAt) {
		this.createdAt = createdAt;
	}

	public java.lang.String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	public java.lang.String getDelayReason() {
		return this.delayReason;
	}

	public void setDelayReason(java.lang.String delayReason) {
		this.delayReason = delayReason;
	}

	public java.lang.String getDelayType() {
		return this.delayType;
	}

	public void setDelayType(java.lang.String delayType) {
		this.delayType = delayType;
	}

	public java.lang.String getImsPrefix() {
		return this.imsPrefix;
	}

	public void setImsPrefix(java.lang.String imsPrefix) {
		this.imsPrefix = imsPrefix;
	}

	public java.lang.String getProcessId() {
		return this.processId;
	}

	public void setProcessId(java.lang.String processId) {
		this.processId = processId;
	}

	public java.lang.String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(java.lang.String requestType) {
		this.requestType = requestType;
	}

	public java.lang.Boolean getResendAssessment() {
		return this.resendAssessment;
	}

	public void setResendAssessment(java.lang.Boolean resendAssessment) {
		this.resendAssessment = resendAssessment;
	}

	public java.lang.String getTriggerSource() {
		return this.triggerSource;
	}

	public void setTriggerSource(java.lang.String triggerSource) {
		this.triggerSource = triggerSource;
	}

	public java.lang.String getSubBrand() {
		return this.subBrand;
	}

	public void setSubBrand(java.lang.String subBrand) {
		this.subBrand = subBrand;
	}

	public java.lang.String getSubBrandDescription() {
		return this.subBrandDescription;
	}

	public void setSubBrandDescription(java.lang.String subBrandDescription) {
		this.subBrandDescription = subBrandDescription;
	}

	public java.lang.String getVaStatus() {
		return this.vaStatus;
	}

	public void setVaStatus(java.lang.String vaStatus) {
		this.vaStatus = vaStatus;
	}

	public com.myteam.tts_connected_claims.assessmentCustomerDetails getAssessmentCustomerDetails() {
		return this.assessmentCustomerDetails;
	}

	public void setAssessmentCustomerDetails(
			com.myteam.tts_connected_claims.assessmentCustomerDetails assessmentCustomerDetails) {
		this.assessmentCustomerDetails = assessmentCustomerDetails;
	}

	public com.myteam.tts_connected_claims.assessmentPolicyDetails getAssessmentPolicyDetails() {
		return this.assessmentPolicyDetails;
	}

	public void setAssessmentPolicyDetails(
			com.myteam.tts_connected_claims.assessmentPolicyDetails assessmentPolicyDetails) {
		this.assessmentPolicyDetails = assessmentPolicyDetails;
	}

	public com.myteam.tts_connected_claims.claimDetails getClaimDetails() {
		return this.claimDetails;
	}

	public void setClaimDetails(
			com.myteam.tts_connected_claims.claimDetails claimDetails) {
		this.claimDetails = claimDetails;
	}

	public com.myteam.tts_connected_claims.channel getChannel() {
		return this.channel;
	}

	public void setChannel(com.myteam.tts_connected_claims.channel channel) {
		this.channel = channel;
	}

	public com.myteam.tts_connected_claims.classification getClassification() {
		return this.classification;
	}

	public void setClassification(
			com.myteam.tts_connected_claims.classification classification) {
		this.classification = classification;
	}

	public java.util.List<com.myteam.tts_connected_claims.timeline> getTimeline() {
		return this.timeline;
	}

	public void setTimeline(
			java.util.List<com.myteam.tts_connected_claims.timeline> timeline) {
		this.timeline = timeline;
	}

	public java.lang.String getCaseClosedReason() {
		return this.caseClosedReason;
	}

	public void setCaseClosedReason(java.lang.String caseClosedReason) {
		this.caseClosedReason = caseClosedReason;
	}

	public java.lang.String getCaseCancelledReason() {
		return this.caseCancelledReason;
	}

	public void setCaseCancelledReason(java.lang.String caseCancelledReason) {
		this.caseCancelledReason = caseCancelledReason;
	}

	public com.myteam.tts_connected_claims.coverType getCoverType() {
		return this.coverType;
	}

	public void setCoverType(com.myteam.tts_connected_claims.coverType coverType) {
		this.coverType = coverType;
	}

	public java.lang.Boolean getTaskDashBoard() {
		return this.taskDashBoard;
	}

	public void setTaskDashBoard(java.lang.Boolean taskDashBoard) {
		this.taskDashBoard = taskDashBoard;
	}

	public com.myteam.tts_connected_claims.claimsData getClaimsData() {
		return this.claimsData;
	}

	public void setClaimsData(
			com.myteam.tts_connected_claims.claimsData claimsData) {
		this.claimsData = claimsData;
	}

	public java.lang.String getPersonSequenceNumber() {
		return this.personSequenceNumber;
	}

	public void setPersonSequenceNumber(java.lang.String personSequenceNumber) {
		this.personSequenceNumber = personSequenceNumber;
	}

	public java.lang.String getRiskItemSequenceNumber() {
		return this.riskItemSequenceNumber;
	}

	public void setRiskItemSequenceNumber(
			java.lang.String riskItemSequenceNumber) {
		this.riskItemSequenceNumber = riskItemSequenceNumber;
	}

	public java.lang.Boolean getRefferedToLA() {
		return this.refferedToLA;
	}

	public void setRefferedToLA(java.lang.Boolean refferedToLA) {
		this.refferedToLA = refferedToLA;
	}

	public java.lang.Boolean getCompletedByLA() {
		return this.completedByLA;
	}

	public void setCompletedByLA(java.lang.Boolean completedByLA) {
		this.completedByLA = completedByLA;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.util.List<java.lang.String> getOwnerGroupList() {
		return this.ownerGroupList;
	}

	public void setOwnerGroupList(
			java.util.List<java.lang.String> ownerGroupList) {
		this.ownerGroupList = ownerGroupList;
	}

	public java.util.List<java.lang.String> getGroupList() {
		return this.groupList;
	}

	public void setGroupList(java.util.List<java.lang.String> groupList) {
		this.groupList = groupList;
	}

	public java.lang.Long getAssessmentCaseTime() {
		return this.assessmentCaseTime;
	}

	public void setAssessmentCaseTime(java.lang.Long assessmentCaseTime) {
		this.assessmentCaseTime = assessmentCaseTime;
	}

	public java.lang.Boolean getCustomerFollowUp() {
		return this.customerFollowUp;
	}

	public void setCustomerFollowUp(java.lang.Boolean customerFollowUp) {
		this.customerFollowUp = customerFollowUp;
	}

	public java.lang.Boolean getFollowUpCompleted() {
		return this.followUpCompleted;
	}

	public void setFollowUpCompleted(java.lang.Boolean followUpCompleted) {
		this.followUpCompleted = followUpCompleted;
	}

	public com.myteam.tts_connected_claims.vehicleInnerDamage getVehicleInnerDamage() {
		return this.vehicleInnerDamage;
	}

	public void setVehicleInnerDamage(
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage) {
		this.vehicleInnerDamage = vehicleInnerDamage;
	}

	public com.myteam.tts_connected_claims.vehicleOuterDamage getVehicleOuterDamage() {
		return this.vehicleOuterDamage;
	}

	public void setVehicleOuterDamage(
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage) {
		this.vehicleOuterDamage = vehicleOuterDamage;
	}

	public java.lang.Long getCancellationTime() {
		return this.cancellationTime;
	}

	public void setCancellationTime(java.lang.Long cancellationTime) {
		this.cancellationTime = cancellationTime;
	}

	public java.lang.Boolean getAssessmentCompleted() {
		return this.assessmentCompleted;
	}

	public void setAssessmentCompleted(java.lang.Boolean assessmentCompleted) {
		this.assessmentCompleted = assessmentCompleted;
	}

	public java.lang.Boolean getVehicleDamageAreaAssessment() {
		return this.vehicleDamageAreaAssessment;
	}

	public void setVehicleDamageAreaAssessment(
			java.lang.Boolean vehicleDamageAreaAssessment) {
		this.vehicleDamageAreaAssessment = vehicleDamageAreaAssessment;
	}

	public java.util.List<java.lang.String> getDocumentList() {
		return this.documentList;
	}

	public void setDocumentList(java.util.List<java.lang.String> documentList) {
		this.documentList = documentList;
	}

	public java.lang.String getNonMotorClaimStatus() {
		return this.nonMotorClaimStatus;
	}

	public void setNonMotorClaimStatus(java.lang.String nonMotorClaimStatus) {
		this.nonMotorClaimStatus = nonMotorClaimStatus;
	}

	public java.lang.String getIncidentCaseId() {
		return this.incidentCaseId;
	}

	public void setIncidentCaseId(java.lang.String incidentCaseId) {
		this.incidentCaseId = incidentCaseId;
	}

	public java.lang.Long getSentDate() {
		return this.sentDate;
	}

	public void setSentDate(java.lang.Long sentDate) {
		this.sentDate = sentDate;
	}

	public java.lang.Boolean getCompleteReview() {
		return this.completeReview;
	}

	public void setCompleteReview(java.lang.Boolean completeReview) {
		this.completeReview = completeReview;
	}

	public java.util.List<java.lang.String> getTpDriverDetails() {
		return this.tpDriverDetails;
	}

	public void setTpDriverDetails(
			java.util.List<java.lang.String> tpDriverDetails) {
		this.tpDriverDetails = tpDriverDetails;
	}

	public assessments(
			java.lang.String activeUser,
			java.lang.Long assessmentCaseTime,
			java.lang.String assessmentCreator,
			java.lang.String assessmentOwner,
			java.lang.String assessmentId,
			java.lang.String brand,
			java.lang.String brandDescription,
			java.lang.Long dueDate,
			java.lang.String caseStatus,
			java.lang.String containerId,
			java.lang.Long createdAt,
			java.lang.String createdBy,
			java.lang.String delayReason,
			java.lang.String delayType,
			java.lang.String imsPrefix,
			java.lang.String processId,
			java.lang.Long processInstanceId,
			java.lang.String requestType,
			java.lang.Boolean resendAssessment,
			java.lang.String triggerSource,
			java.lang.String subBrand,
			java.lang.String subBrandDescription,
			java.lang.String vaStatus,
			com.myteam.tts_connected_claims.assessmentCustomerDetails assessmentCustomerDetails,
			com.myteam.tts_connected_claims.assessmentPolicyDetails assessmentPolicyDetails,
			com.myteam.tts_connected_claims.claimDetails claimDetails,
			com.myteam.tts_connected_claims.channel channel,
			com.myteam.tts_connected_claims.classification classification,
			java.util.List<com.myteam.tts_connected_claims.timeline> timeline,
			java.lang.String caseClosedReason,
			java.lang.String caseCancelledReason,
			com.myteam.tts_connected_claims.coverType coverType,
			java.lang.Boolean taskDashBoard,
			com.myteam.tts_connected_claims.claimsData claimsData,
			java.lang.String personSequenceNumber,
			java.lang.String riskItemSequenceNumber,
			java.lang.Boolean refferedToLA,
			java.lang.Boolean completedByLA,
			java.util.List<java.lang.String> ownerGroupList,
			java.util.List<java.lang.String> groupList,
			java.lang.Boolean customerFollowUp,
			java.lang.Boolean followUpCompleted,
			com.myteam.tts_connected_claims.vehicleInnerDamage vehicleInnerDamage,
			com.myteam.tts_connected_claims.vehicleOuterDamage vehicleOuterDamage,
			java.lang.Long cancellationTime,
			java.lang.Boolean assessmentCompleted,
			java.lang.Boolean vehicleDamageAreaAssessment,
			java.util.List<java.lang.String> documentList,
			java.lang.String nonMotorClaimStatus,
			java.lang.String incidentCaseId, java.lang.Long sentDate,
			java.lang.Boolean completeReview,
			java.util.List<java.lang.String> tpDriverDetails) {
		this.activeUser = activeUser;
		this.assessmentCaseTime = assessmentCaseTime;
		this.assessmentCreator = assessmentCreator;
		this.assessmentOwner = assessmentOwner;
		this.assessmentId = assessmentId;
		this.brand = brand;
		this.brandDescription = brandDescription;
		this.dueDate = dueDate;
		this.caseStatus = caseStatus;
		this.containerId = containerId;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.delayReason = delayReason;
		this.delayType = delayType;
		this.imsPrefix = imsPrefix;
		this.processId = processId;
		this.processInstanceId = processInstanceId;
		this.requestType = requestType;
		this.resendAssessment = resendAssessment;
		this.triggerSource = triggerSource;
		this.subBrand = subBrand;
		this.subBrandDescription = subBrandDescription;
		this.vaStatus = vaStatus;
		this.assessmentCustomerDetails = assessmentCustomerDetails;
		this.assessmentPolicyDetails = assessmentPolicyDetails;
		this.claimDetails = claimDetails;
		this.channel = channel;
		this.classification = classification;
		this.timeline = timeline;
		this.caseClosedReason = caseClosedReason;
		this.caseCancelledReason = caseCancelledReason;
		this.coverType = coverType;
		this.taskDashBoard = taskDashBoard;
		this.claimsData = claimsData;
		this.personSequenceNumber = personSequenceNumber;
		this.riskItemSequenceNumber = riskItemSequenceNumber;
		this.refferedToLA = refferedToLA;
		this.completedByLA = completedByLA;
		this.ownerGroupList = ownerGroupList;
		this.groupList = groupList;
		this.customerFollowUp = customerFollowUp;
		this.followUpCompleted = followUpCompleted;
		this.vehicleInnerDamage = vehicleInnerDamage;
		this.vehicleOuterDamage = vehicleOuterDamage;
		this.cancellationTime = cancellationTime;
		this.assessmentCompleted = assessmentCompleted;
		this.vehicleDamageAreaAssessment = vehicleDamageAreaAssessment;
		this.documentList = documentList;
		this.nonMotorClaimStatus = nonMotorClaimStatus;
		this.incidentCaseId = incidentCaseId;
		this.sentDate = sentDate;
		this.completeReview = completeReview;
		this.tpDriverDetails = tpDriverDetails;
	}

}