import java.util.ArrayList;

public class Persona {
    private String Name;
    private String Relation;

    private String Mother;

    public Persona(String name, String relation,String mother){
        this.Name = name;
        this.Relation = relation;
        this.Mother= mother;
    }
    public Persona(String name, String relation){
        this.Name = name;
        this.Relation = relation;
        this.Mother="";
    }

    public String GetMother(){
        return Mother;
    }
    public String GetName(){
        return Name;
    }
    public String GetRelation(){
        return Relation;
    }

    ArrayList<Persona> list = new ArrayList<>();

    public void AddPersona(Persona p){
        list.add(p);

    }

    public ArrayList<Persona> GetPersona(){
        return list;
    }

}