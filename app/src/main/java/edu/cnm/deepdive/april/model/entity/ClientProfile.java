package edu.cnm.deepdive.april.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import java.util.Date;
import java.util.jar.Attributes.Name;

// Creating PARENT Entity

@Entity(
    indices = {
        @Index(value = "name", unique = true)
    }
)
public class ClientProfile {

  // Primary Key of Client Profile Entity

  @ColumnInfo(name = "client_id")
  @PrimaryKey(autoGenerate = true)
  private long clientId;

  // Attributes of Client Profile Entity


  @NonNull
  @Expose
  private String name;



  @ColumnInfo(name = "date_of_birth", index = true)
  private Date dateOfBirth;


  @ColumnInfo(name = "address", index = true)
  private String Address;


  @ColumnInfo(name = "phone_number", index = true)
  public long phoneNumber;


  // Getters and Setters

  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}