public class Person {
  //  public static void main(String[]args){
    //  Person person1= new Person ();
//System.out.println(person1);

  //  }
//}
  class person {

      public person(String name, String surname, String city, String phone) {

          this.name = name;

          this.surname = surname;

          this.city = city;

          this.phone = phone;

      }



      public String personInfo() {

          return "Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + phone;

      }

      private String name;

      private String surname;

      private String city;

      private String phone;

  }

    class Main {

        public void main(String[] args) {

            person person1 = new person("Wil", "Smith", "New york", "2936729462846");

            person person2 = new person("Jakie", "Chan", "Shanhai", "12312412412");

            person person3 = new person("Sherloc", "Holms", "London", "37742123513");

            System.out.println(person1.personInfo());

            System.out.println(person2.personInfo());

            System.out.println(person3.personInfo());

        }
    }
    }