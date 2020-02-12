package edu.cnm.deepdive.april.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

public class Labor {

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


    @ColumnInfo(name = "vaginal_discharge", index = true)
    private int vaginalDischarge;


    @ColumnInfo(name = "rupture_of_membranes", index = true)
    private boolean ruptureOfMembranes;


    @ColumnInfo(name = "contraction", index = true)
    private boolean contraction;

  }
}