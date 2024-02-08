
    public class Produit {
        private String n_prod;
        private float prix_prod;
        private int num_id;

        public Produit(String n_prod,float prix_prod,int num_id){
            this.n_prod = n_prod;
            this.prix_prod = prix_prod;
            this.num_id = num_id;
        }

        public String getN_prod(){
            return n_prod;
        }


        public float getPrix_prod(){
            return prix_prod;
        }

        public int getNum_id(){
            return num_id;
        }

        public String toString(){
            return "Nom produit : " + n_prod + "prix du produit : " + prix_prod + "Numero identifiant du produit : " + num_id;
        }
    }


