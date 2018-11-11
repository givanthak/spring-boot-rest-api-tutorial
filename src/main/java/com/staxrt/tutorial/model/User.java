/*
 *
 *  Copyright (c) 2018-2020 Givantha Kalansuriya, This source is a part of
 *   Staxrt - sample application source code.
 *   http://staxrt.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.staxrt.tutorial.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.util.Date;

/**
 * The type User.
 *
 * @author Givantha Kalansuriya
 */
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_address", nullable = false)
    private String emailId;

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;

    @Column(name = "created_by", nullable = false)
    @CreatedBy
    private String createdBy;

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    private String updatedby;

  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
        return id;
    }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
        this.id = id;
    }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
        return firstName;
    }

  /**
   * Sets first name.
   *
   * @param firstName the first name
   */
  public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
        return lastName;
    }

  /**
   * Sets last name.
   *
   * @param lastName the last name
   */
  public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  /**
   * Gets email id.
   *
   * @return the email id
   */
  public String getEmailId() {
        return emailId;
    }

  /**
   * Sets email id.
   *
   * @param emailId the email id
   */
  public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

  /**
   * Gets created at.
   *
   * @return the created at
   */
  public Date getCreatedAt() {
        return createdAt;
    }

  /**
   * Sets created at.
   *
   * @param createdAt the created at
   */
  public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

  /**
   * Gets created by.
   *
   * @return the created by
   */
  public String getCreatedBy() {
        return createdBy;
    }

  /**
   * Sets created by.
   *
   * @param createdBy the created by
   */
  public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

  /**
   * Gets updated at.
   *
   * @return the updated at
   */
  public Date getUpdatedAt() {
        return updatedAt;
    }

  /**
   * Sets updated at.
   *
   * @param updatedAt the updated at
   */
  public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

  /**
   * Gets updatedby.
   *
   * @return the updatedby
   */
  public String getUpdatedby() {
        return updatedby;
    }

  /**
   * Sets updatedby.
   *
   * @param updatedby the updatedby
   */
  public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", createdAt=" + createdAt +
                ", createdBy='" + createdBy + '\'' +
                ", updatedAt=" + updatedAt +
                ", updatedby='" + updatedby + '\'' +
                '}';
    }


}
