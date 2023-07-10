package Dog;




public class Dogs {
    public  String nome;
    public String cor;
    public String estadoEspirito;
    public int altura;
    public int sizeRabo;
    public double peso;
     
        public void Comer(){}
        public void Latir(){
            System.out.println("NOXUS!!!");
        }
        public String Pegar(){
            return "Head of Garen";
        }
        public String interate(String action){
        if (action.equals("carinho")){
            this.estadoEspirito = " feliz";
        }else if (action.equals("vai dormir")){
            this.estadoEspirito = " bravo";}
        else{
            this.estadoEspirito = " neutro";
        }
            return estadoEspirito;
        }
}
