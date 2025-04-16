public class RatioFinder {
    public static class ratioFinder{
        public void display(String msg){
            System.out.println(msg);             
        }
    //l = 2r = h    
        public void ratio(int l , int b){   
            int r = l/2;
            double ratioTriangle = (Math.sqrt(3)*l)/12;
            double ratioCircle = (double)r/2;
            double ratioRectangle = (double)(l*b)/(2*(l+b));
            String strTri = String.format("%f", ratioTriangle);
            String strCir = String.format("%f", ratioCircle);
            String strRec = String.format("%f", ratioRectangle);
            display(strTri);
            display(strCir);
            display(strRec);        
        }
    }
   

public static void main(String[] args) {
    
    ratioFinder rfinder = new ratioFinder();
        int l= 2;
        int b = 3;
        rfinder.display("Welcome");
        rfinder.ratio(l,b);
    }
}
    