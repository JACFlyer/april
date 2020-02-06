package edu.cnm.deepdive.april.model.entity;


import androidx.room.ColumnInfo;
import androidx.room.ColumnInfo.Collate;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.util.Date;


// Entity and Foreign Key designation of Client Assessment class
@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = ClientProfile.class,
            parentColumns = "client_profile_id",
            childColumns = "client_profile_id"
        )
    },

    indices = {
        @Index(value = {"time_stamp"}, unique = true)
    }

)
public class ClientAssessment {

  // Primary Key of the Client Assessment Entity
  @ColumnInfo(name = "time_stamp", index = true)
  @PrimaryKey(autoGenerate = true)
  private Date timeStamp;

  // Attributes of the Client Assessment Entity

  @ColumnInfo(name = "pain_present", index = true)
  private boolean painPresent;


  @ColumnInfo(name = "pain_quantity", index = true)
  private int painQuantity;


  @ColumnInfo(name = "pain_location", index = true)
  private int painLocation;


  @ColumnInfo(name = "pain_radiation", index = true)
  private int painRadiation;


  @ColumnInfo(name = "pain_quality", index = true)
  private int painQuality;


  @ColumnInfo(name = "pain_resolved")
  private boolean painResolved;


  @ColumnInfo(name = "fetal_heart_rate", index = true)
  private int fetalHeartRate;


  @ColumnInfo(name = "vaginal_discharge", index = true)
  private int vaginalDischarge;


  @ColumnInfo(name = "rupture_of_membranes", index = true)
  private boolean ruptureOfMembranes;


  @ColumnInfo(name = "contraction", index = true)
  private boolean contraction;



  // Getters and Setters of Client Assessment Entity

  public Date getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Date timeStamp) {
    this.timeStamp = timeStamp;
  }

  public int getPainQuantity() {
    return painQuantity;
  }

  public void setPainQuantity(int painQuantity) {
    this.painQuantity = painQuantity;
  }

  public int getPainLocation() {
    return painLocation;
  }

  public void setPainLocation(int painLocation) {
    this.painLocation = painLocation;
  }

  public int getPainRadiation() {
    return painRadiation;
  }

  public void setPainRadiation(int painRadiation) {
    this.painRadiation = painRadiation;
  }

  public int getPainQuality() {
    return painQuality;
  }

  public void setPainQuality(int painQuality) {
    this.painQuality = painQuality;
  }

  public boolean isPainResolved() {
    return painResolved;
  }

  public void setPainResolved(boolean painResolved) {
    this.painResolved = painResolved;
  }

  public int getFetalHeartRate() {
    return fetalHeartRate;
  }

  public void setFetalHeartRate(int fetalHeartRate) {
    this.fetalHeartRate = fetalHeartRate;
  }

  public int getVaginalDischarge() {
    return vaginalDischarge;
  }

  public void setVaginalDischarge(int vaginalDischarge) {
    this.vaginalDischarge = vaginalDischarge;
  }

  public boolean isRuptureOfMembranes() {
    return ruptureOfMembranes;
  }

  public void setRuptureOfMembranes(boolean ruptureOfMembranes) {
    this.ruptureOfMembranes = ruptureOfMembranes;
  }

  public boolean isContraction() {
    return contraction;
  }

  public void setContraction(boolean contraction) {
    this.contraction = contraction;
  }


}

