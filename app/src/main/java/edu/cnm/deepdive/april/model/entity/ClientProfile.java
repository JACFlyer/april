package edu.cnm.deepdive.april.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.util.Date;


// Creating PARENT Entity

@Entity(
    indices = {
        @Index(value = "client_name", unique = true)
    }
)
public class ClientProfile {


  // Primary Key of Client Profile Entity

  @ColumnInfo(name = "client_profile_id")
  @PrimaryKey(autoGenerate = true)
  private long id;



  // Attributes of Client Profile Entity

  @ColumnInfo(name = "client_record_number", index = true)
  private long clientRecordNumber;

  @ColumnInfo(name = "client_name", index = true, collate = ColumnInfo.NOCASE)
  private String clientName;


  @ColumnInfo(name = "date_of_birth", index = true)
  private Date dateOfBirth;


  @ColumnInfo(name = "address", index = true)
  private String address;


  @ColumnInfo(name = "client_phone", index = true)
  public long phoneNumber;


  @ColumnInfo(name = "emergency_contact")
  public String emergencyContact;


  @ColumnInfo(name = "emergency_contact_phone")
  public long emergencyContactPhoneNumber;


  @ColumnInfo(name = "medical_provider", index = true)
  public String medicalProvider;


  @ColumnInfo(name = "medical_provider_phone")
  public long medicalProviderPhone;



  // Getters and Setters

  public long getClientRecordNumber() {
    return clientRecordNumber;
  }

  public void setClientRecordNumber(long clientRecordNumber) {
    this.clientRecordNumber = clientRecordNumber;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmergencyContact() {
    return emergencyContact;
  }

  public void setEmergencyContact(String emergencyContact) {
    this.emergencyContact = emergencyContact;
  }

  public long getEmergencyContactPhoneNumber() {
    return emergencyContactPhoneNumber;
  }

  public void setEmergencyContactPhoneNumber(long emergencyContactPhoneNumber) {
    this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
  }

  public String getMedicalProvider() {
    return medicalProvider;
  }

  public void setMedicalProvider(String medicalProvider) {
    this.medicalProvider = medicalProvider;
  }

  public long getMedicalProviderPhone() {
    return medicalProviderPhone;
  }

  public void setMedicalProviderPhone(long medicalProviderPhone) {
    this.medicalProviderPhone = medicalProviderPhone;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

}
