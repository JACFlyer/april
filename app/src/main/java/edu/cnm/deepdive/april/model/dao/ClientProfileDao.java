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

  @Insert
  Single<Long> insert(ClientProfile clientProfile);

  @Insert
  Single<List<Long>> insert(Collection<ClientProfile> clientProfile);

  @Insert
  Single<List<Long>> insert(ClientProfile... clientProfiles);

  @Delete
  Single<Integer> delete(ClientProfile clientProfile);

  @Delete
  Single<Integer> delete(Collection<ClientProfile> clientProfile);

  @Delete
  Single<Integer> delete(ClientProfile... clientProfiles);

  @Query("SELECT * FROM ClientProfile ORDER BY client_id")
  List<ClientProfile> select();


  @Query("SELECT * FROM ClientProfile WHERE client_id = :id")
  Single<ClientProfile> select(long id);

}



