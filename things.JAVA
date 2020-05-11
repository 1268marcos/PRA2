@Entity(tableName = "Things")
public class Things {
  
  @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "thingsId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "thingsGrade")
    private String mGrade;
  
  
public Things(@Nullable String Id, int Grade ,String CreationDate , int Age, String Description) {
        mId=id;
        mGrade= grade;
        mCreationDate= creationdate;
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

    public void setGrade(int Grade ) {
        mGrade = grade;
    }
  

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

   public int getAge() {
        return mAge;
    }

    public void setAge(int Age) {
        mAge = age;
    }

  public String getCreationDate() {
        return mCreationDate;
    }

    public void setDescription(String Description) {
        mDescription = description;
    }


}
