package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData
{
  private final StringProperty ID;
  private final StringProperty Name;
  private final StringProperty email;
  private final StringProperty DOB;
   
        
    
  public StudentData(String id, String name, String email, String dob)
  {
    this.ID = new SimpleStringProperty(id);
    this.Name = new SimpleStringProperty(name);
    this.email = new SimpleStringProperty(email);
    this.DOB = new SimpleStringProperty(dob);
  }
  
  public String getID()
  {
    return (String)this.ID.get();
  }
  
  public String getName()
  {
    return (String)this.Name.get();
  }
  
  public String getEmail()
  {
    return (String)this.email.get();
  }
  
  public String getDOB()
  {
    return (String)this.DOB.get();
  }
  
  public void setID(String value)
  {
    this.ID.set(value);
  }
  
  public void setName(String value)
  {
    this.Name.set(value);
  }
  
  public void setEmail(String value)
  {
    this.email.set(value);
  }
  
  public void setDOB(String value)
  {
    this.DOB.set(value);
  }
  
  public StringProperty idProperty()
  {
    return this.ID;
  }
  
  public StringProperty NameProperty()
  {
    return this.Name;
  }
  
  public StringProperty emailProperty()
  {
    return this.email;
  }
  
  public StringProperty dobProperty()
  {
    return this.DOB;
  }
}
