public class Personinfo {
   String name ;
    String surname;
    String city;
    String phone;
    boolean skars;

 public Personinfo(String name) {
  this.name = name;

  this.surname = surname;

  this.city = city;

  this.phone = phone;

 }

 @Override
 public String toString() {
  return "Personinfo{" +
          "name='" + name + '\'' +
          ", surname='" + surname + '\'' +
          ", city='" + city + '\'' +
          ", phone='" + phone + '\'' +
          ", skars=" + skars +
          '}';


 }

}
