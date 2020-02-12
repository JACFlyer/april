package edu.cnm.deepdive.april.model.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.april.model.entity.Assessment;
import edu.cnm.deepdive.april.model.entity.FetalCondition;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

public interface FetalConditionDao {


  @Insert
  Single<Long> insert(FetalCondition fetalCondition);


  @Insert
  Single<List<Long>> insert(FetalCondition... fetalCondition);

  @Delete
  Single<Integer> delete(FetalCondition fetalCondition);

  @Delete
  Single<Integer> delete(Collection<FetalCondition> fetalCondition);

  @Delete
  Single<Integer> delete(FetalCondition... fetalCondition);

  @Query("SELECT * FROM FetalCondition ORDER BY fetal_id")
  List<FetalCondition> select();

}
