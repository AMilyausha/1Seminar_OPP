public class Main {
    public static void main(String[] args) {

       Persona father = new Persona ("Bob","father","mother Mila");
       Persona son = new Persona("Marat", "son");
       Persona sister = new Persona("Maria", "daughter");
       Persona grandson = new Persona("Malich", "grandson");
       father.AddPersona(son);
       father.AddPersona(sister);
       sister.AddPersona(grandson);

       TreeMain.view(father,0);
    }
}