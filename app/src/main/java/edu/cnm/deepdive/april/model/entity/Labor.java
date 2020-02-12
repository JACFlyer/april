package edu.cnm.deepdive.april.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;


// Creating PARENT Entity

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = Assessment.class,
            parentColumns = "assessment_id",
            childColumns = "assessment_id"
        )
    },
    indices = {
        @Index(value = "labor_id", unique = true)
    }
)




  public class Labor {


    // Primary Key of Labor Entity

    @ColumnInfo(name = "labor_id")
    @PrimaryKey(autoGenerate = true)
    private long laborId;



    // Attributes of Labor Entity


    @ColumnInfo(name = "rupture_of_membranes", index = true)
    private boolean ruptureOfMembranes;


    @ColumnInfo(name = "contraction", index = true)
    private boolean contraction;

  }
