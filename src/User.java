import java.lang.reflect.Field;


public class User {
    private String login;
    private String password;
    private int age;
    private boolean administrator;

    public User(String login, String password, int age){
        this.login = login;
        this.password = password;
        this.age = age;
        this.administrator = false;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.age = 18;
        this.administrator = true;
    }

//    public static void displayProps(Object obj) {
//        Class<?> clazz = obj.getClass();
//        Field[] fields = clazz.getDeclaredFields();
//
//        for (Field field : fields) {
//            field.setAccessible(true); // to access private fields
//            try {
//                System.out.println(field.getName() + ": " + field.get(obj));
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    public void displayProps(){
        System.out.println("Login: " + login + " Password: " + password + " Age: " + age + " Email: " + email() + " Admin: " + administrator);
    }
    public String email(){
        return login + "@cesi.com";
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

}
