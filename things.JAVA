import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "things")

public class ThingTodoBefore {
  
  @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "thingsId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "thingsGrade")
    private int mGrade;
  
     private String mCreationDate;
    private int mAge;
    private String mDescription;

  
public ThingTodoBefore(int grade ,String creationDate , int age, String description) {
        mGrade= grade;
        mCreationDate= creationDate;
        mAge=age;
        mDescription=description;
 }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getGrade() {
        return mGrade;
    }

    public void setGrade(int grade ) {
        mGrade = grade;
    }
  
    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

   public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

  public String getCreationDate() {
        return mCreationDate;
    }

    public void setDescription(String description) {
        mDescription = description;
    }


}
