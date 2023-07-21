package Dog;




public class Dogs {
    private  String nome;
    private String cor;
    private String estadoEspirito;
    private int altura;
    private int sizeRabo;
    private double peso;
     
    public Dogs(String nome, String cor, int altura, int sizeRabo, double peso){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.equals("Lilly")){
            this.nome = null;
            }
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public void setEstadoEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSizeRabo() {
        return sizeRabo;
    }

    public void setSizeRabo(int sizeRabo) {
        this.sizeRabo = sizeRabo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
        public void Comer(){}
        public void Latir(){
            System.out.println("NOXUS!!!");
        }
        public String Pegar(){
            return "Head of Garen";
        }
        public String interate(String action){
            
            switch(action){
                case "carinho":
                    this.estadoEspirito = "feliz";
                    break;
                case "vai dormir":
                    this.estadoEspirito = "Bravo";
                    break;
                case "pisar na batinha":
                    this.estadoEspirito = "triste";
                    break;
                default: 
                    this.estadoEspirito= "neutro";
                    break;
                
                }
        //if (action.equals("carinho")){
        //    this.estadoEspirito = " feliz";
        //}else if (action.equals("vai dormir")){
        //    this.estadoEspirito = " bravo";}
        //else{
        //    this.estadoEspirito = " neutro";
        //}
            return estadoEspirito;
        }
}
