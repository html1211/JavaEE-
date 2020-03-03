package com.xor.model;

import java.util.Date;

public class CourseVideo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column college_video.id
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column college_video.path
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column college_video.college_id
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    private Integer courseId;
  
    private Integer payCoin;
    
    private String teacherName;
    
    private String collegeName;
    
    
    public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Integer getPayCoin() {
		return payCoin;
	}

	public void setPayCoin(Integer payCoin) {
		this.payCoin = payCoin;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column college_video.record_time
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    private Date recordTime;
    
    private Integer teacherId;
    
    private String courseName;
    
    

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column college_video.id
     *
     * @return the value of college_video.id
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column college_video.id
     *
     * @param id the value for college_video.id
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column college_video.path
     *
     * @return the value of college_video.path
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column college_video.path
     *
     * @param path the value for college_video.path
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public void setPath(String path) {
        this.path = path;
    }


    public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column college_video.record_time
     *
     * @return the value of college_video.record_time
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column college_video.record_time
     *
     * @param recordTime the value for college_video.record_time
     *
     * @mbg.generated Sun Oct 20 12:01:45 CST 2019
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}