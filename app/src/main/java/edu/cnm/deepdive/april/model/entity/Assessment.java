package edu.cnm.deepdive.april.model.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import java.util.Date;


@Entity(
    foreignKeys = @ForeignKey(
        entity = ClientProfile.class,
        parentColumns = "client_id",
        childColumns = "client_id",
        onDelete = ForeignKey.CASCADE
    )


)




public class Assessment {

  @ColumnInfo(name = "assessment_id", index = true)
  @PrimaryKey(autoGenerate = true)
  private long id;


  @ColumnInfo(name = "client_id", index = true)
  private long clientId;


  @NonNull
  private Date timestamp = new Date();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }









}





