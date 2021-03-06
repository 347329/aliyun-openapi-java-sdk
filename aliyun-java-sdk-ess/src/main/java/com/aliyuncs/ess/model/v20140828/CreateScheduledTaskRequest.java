/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateScheduledTaskRequest extends RpcAcsRequest<CreateScheduledTaskResponse> {
	
	public CreateScheduledTaskRequest() {
		super("Ess", "2014-08-28", "CreateScheduledTask", "ess");
	}

	private String launchTime;

	private String scheduledAction;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private Long ownerId;

	private String recurrenceValue;

	private Integer launchExpirationTime;

	private String recurrenceEndTime;

	private String scheduledTaskName;

	private Boolean taskEnabled;

	private String recurrenceType;

	public String getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
		if(launchTime != null){
			putQueryParameter("LaunchTime", launchTime);
		}
	}

	public String getScheduledAction() {
		return this.scheduledAction;
	}

	public void setScheduledAction(String scheduledAction) {
		this.scheduledAction = scheduledAction;
		if(scheduledAction != null){
			putQueryParameter("ScheduledAction", scheduledAction);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getRecurrenceValue() {
		return this.recurrenceValue;
	}

	public void setRecurrenceValue(String recurrenceValue) {
		this.recurrenceValue = recurrenceValue;
		if(recurrenceValue != null){
			putQueryParameter("RecurrenceValue", recurrenceValue);
		}
	}

	public Integer getLaunchExpirationTime() {
		return this.launchExpirationTime;
	}

	public void setLaunchExpirationTime(Integer launchExpirationTime) {
		this.launchExpirationTime = launchExpirationTime;
		if(launchExpirationTime != null){
			putQueryParameter("LaunchExpirationTime", launchExpirationTime.toString());
		}
	}

	public String getRecurrenceEndTime() {
		return this.recurrenceEndTime;
	}

	public void setRecurrenceEndTime(String recurrenceEndTime) {
		this.recurrenceEndTime = recurrenceEndTime;
		if(recurrenceEndTime != null){
			putQueryParameter("RecurrenceEndTime", recurrenceEndTime);
		}
	}

	public String getScheduledTaskName() {
		return this.scheduledTaskName;
	}

	public void setScheduledTaskName(String scheduledTaskName) {
		this.scheduledTaskName = scheduledTaskName;
		if(scheduledTaskName != null){
			putQueryParameter("ScheduledTaskName", scheduledTaskName);
		}
	}

	public Boolean getTaskEnabled() {
		return this.taskEnabled;
	}

	public void setTaskEnabled(Boolean taskEnabled) {
		this.taskEnabled = taskEnabled;
		if(taskEnabled != null){
			putQueryParameter("TaskEnabled", taskEnabled.toString());
		}
	}

	public String getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
		if(recurrenceType != null){
			putQueryParameter("RecurrenceType", recurrenceType);
		}
	}

	@Override
	public Class<CreateScheduledTaskResponse> getResponseClass() {
		return CreateScheduledTaskResponse.class;
	}

}
