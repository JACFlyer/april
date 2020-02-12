package edu.cnm.deepdive.april.model.entity;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.ColumnInfo.Collate;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import java.util.Date;
import java.util.EnumMap;


// Entity and Foreign Key designation of Client Assessment class
@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = ClientProfile.class,
            parentColumns = "client_id",
            childColumns = "client_id"
        )
    },

    indices = {
        @Index(value = {"assessment_id"}, unique = true)
    }

)
public class Assessment<ENUM> {

  // Primary Key of the Client Assessment Entity
  @ColumnInfo(name = "assessment_id", index = true)
  @PrimaryKey(autoGenerate = true)
  private long assessment;

  // Attributes of the Client Assessment Entity

  @ColumnInfo(name = "assessment_type", index = true)
  private ENUM assessmentType;

  @NonNull
  private Date timestamp = new Date();




  // Getters and Setters of Client Assessment Entity

}

