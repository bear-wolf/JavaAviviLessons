package avivi.home.work14;

public class Student {
    private String FirstName;
    private String LastName;
    private String MiddleName;
    private Faculty Faculty;
    private String University;
    private Integer Age;

    public Student(String firstName, String lastName, String middleName) {
        FirstName = firstName;
        LastName = lastName;
        MiddleName = middleName;
    }

//    public Student(String firstName, String lastName, String middleName, String faculty, String university, Integer age) {
//        FirstName = firstName;
//        LastName = lastName;
//        MiddleName = middleName;
//        Faculty = faculty;
//        University = university;
//        Age = age;
//    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public Faculty getFaculty() {
        return Faculty;
    }

    public String getUniversity() {
        return University;
    }

    public Integer getAge() {
        return Age;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public Student setFaculty(Faculty faculty) {
        Faculty = faculty;
        return this;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public Student setAge(Integer age) {
        Age = age;
        return this;
    }

    boolean isProperty(Object property) {
        boolean status = false;
        String value;

        value = ((String) property);

        if ( this.FirstName.equals(value) || this.LastName.equals(value) || this.MiddleName.equals(value) || this.Faculty.name().equals(value)) {
            status = true;
        } else {
            try {
                    int age = Integer.valueOf((String) property);
                    status = (this.Age == age) ? true : false;
                } catch (Exception e) {

                }
        }

//        switch (value) {
//            case FirstName: {
//                status = true;
//                break;
//            }
//            default: {
//                try {
//                    int age = Integer.valueOf((String) property);
//                    status = (this.Age == age) ? true : false;
//                } catch (Exception e) {
//
//                }
//                break;
//            }
//        }

        return status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", University='" + University + '\'' +
                ", Age=" + Age +
                '}';
    }
}
