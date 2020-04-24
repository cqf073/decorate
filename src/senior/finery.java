package senior;

public class finery extends people {
    protected people pp=null;
    public  void  dec(people pp){

        this.pp=pp;
    }
    public  void  show(){
        if(pp!=null){
            pp.show();
        }
    }

    }

