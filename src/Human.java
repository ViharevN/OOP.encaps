public class Human {
    private Integer yearOfBirth;
    String name;
    private String town;
    String jobTitle;


    Human(String name, Integer yearOfBirth,  String town, String jobTitle) {
        if (name == null || name.length()==0) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town == null || town.length() == 0) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.length() == 0) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth == null || yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                " Я из города " + town +
                " Я родился в " + yearOfBirth + " году."+
                " Я работаю на должности "+jobTitle+
                " . Будем знакомы!";
    }
}
