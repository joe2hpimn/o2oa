package com.x.processplatform.core.entity.content;

import java.util.ArrayList;
import java.util.List;

import com.x.base.core.entity.JsonProperties;
import com.x.base.core.project.annotation.FieldDescribe;
import com.x.processplatform.core.entity.element.Form;

public class WorkCompletedProperties extends JsonProperties {

	@FieldDescribe("合并已办对象")
	private List<TaskCompleted> taskCompletedList = new ArrayList<>();

	@FieldDescribe("合并已阅对象")
	private List<ReadCompleted> readCompletedList = new ArrayList<>();

	@FieldDescribe("合并参阅对象")
	private List<Review> reviewList = new ArrayList<>();

	@FieldDescribe("合并记录对象")
	private List<Record> recordList = new ArrayList<>();

	@FieldDescribe("合并数据对象")
	private Data data;

	@FieldDescribe("合并工作日志对象")
	private List<WorkLog> workLogList = new ArrayList<>();

	@FieldDescribe("合并工作Form")
	private Form form;

	@FieldDescribe("合并工作relatedFormList")
	private List<Form> relatedFormList = new ArrayList<>();

	@FieldDescribe("合并工作relatedScriptList")
	private List<Script> relatedScriptList = new ArrayList<>();

	@FieldDescribe("合并工作mobileRelatedFormList")
	private List<Form> mobileRelatedFormList = new ArrayList<>();

	@FieldDescribe("合并工作relatedScriptList")
	private List<Script> mobileRelatedScriptList = new ArrayList<>();

	@FieldDescribe("标题")
	private String title;

	public List<Record> getRecordList() {
		return recordList;
	}

	public void setRecordList(List<Record> recordList) {
		this.recordList = recordList;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public List<WorkLog> getWorkLogList() {
		return workLogList;
	}

	public void setWorkLogList(List<WorkLog> workLogList) {
		this.workLogList = workLogList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Form getForm() {
		return form;
	}

	public void setForm(Form form) {
		this.form = form;
	}

	public List<Form> getRelatedFormList() {
		return relatedFormList;
	}

	public List<Script> getRelatedScriptList() {
		return relatedScriptList;
	}

	public void setRelatedFormList(List<Form> relatedFormList) {
		this.relatedFormList = relatedFormList;
	}

	public void setRelatedScriptList(List<Script> relatedScriptList) {
		this.relatedScriptList = relatedScriptList;
	}

	public List<Form> getMobileRelatedFormList() {
		return mobileRelatedFormList;
	}

	public void setMobileRelatedFormList(List<Form> mobileRelatedFormList) {
		this.mobileRelatedFormList = mobileRelatedFormList;
	}

	public List<Script> getMobileRelatedScriptList() {
		return mobileRelatedScriptList;
	}

	public void setMobileRelatedScriptList(List<Script> mobileRelatedScriptList) {
		this.mobileRelatedScriptList = mobileRelatedScriptList;
	}

	public List<TaskCompleted> getTaskCompletedList() {
		return taskCompletedList;
	}

	public void setTaskCompletedList(List<TaskCompleted> taskCompletedList) {
		this.taskCompletedList = taskCompletedList;
	}

	public List<ReadCompleted> getReadCompletedList() {
		return readCompletedList;
	}

	public void setReadCompletedList(List<ReadCompleted> readCompletedList) {
		this.readCompletedList = readCompletedList;
	}

	public List<Review> getReviewList() {
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public static class Script {

		public static final String TYPE_PROCESSPLATFORM = "processPlatform";
		public static final String TYPE_CMS = "cms";
		public static final String TYPE_PORTAL = "portal";

		private String id;

		private String alias;

		private String name;

		private String type;

		private String text;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAlias() {
			return alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

	}

}
