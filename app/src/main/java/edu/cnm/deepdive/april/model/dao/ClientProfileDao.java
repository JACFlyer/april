package edu.cnm.deepdive.april.model.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.april.model.entity.ClientProfile;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Dao
public interface ClientProfileDao {


  //CRUD - Create
  @Insert(onConflict = OnConflictStrategy.IGNORE)
  Single<Long> insert(ClientProfile clientProfile);


  @Insert
  Single<List<Long>> insert(Collection<ClientProfile> clientProfile);


  // CRUD - Update
  @Update
  int update(ClientProfile clientProfile);


  // CRUD - Delete
  @Delete
  int delete(ClientProfile... clientProfiles);

  @Query("SELECT * FROM ClientProfile ORDER BY client_name")
  LiveData<List<ClientProfile>> select();


}
