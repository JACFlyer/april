package edu.cnm.deepdive.april.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

// Creating PARENT Entity


// Entity and Foreign Key designation of Fetal Condition class

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Assessment.class,
            parentColumns = "assessment_id",
            childColumns = "assessment_id"
        )
    },
      indices = {
          @Index(value = "fetal_id", unique = true)
      }
  )
    public class FetalCondition {

    // Primary Key of Client Profile Entity

    @ColumnInfo(name = "fetal_id")
    @PrimaryKey(autoGenerate = true)
    private long fetalId;

    // Attributes of Client Profile Entity

  @ColumnInfo(name = "fetal_heart_rate", index = true)
  private int fetalHeartRate;

}
