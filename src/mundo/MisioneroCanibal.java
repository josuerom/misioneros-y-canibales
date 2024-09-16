/**
 ░░█ █▀█ █▀ █░█ █▀▀ █▀█ █▀█ █▀▄▀█
 █▄█ █▄█ ▄█ █▄█ ██▄ █▀▄ █▄█ █░▀░█
**/
package mundo;

public class MisioneroCanibal {
   private int misioneroI;
   private int canibalI;
   private int misioneroD;
   private int canibalD;

   public MisioneroCanibal() {
      misioneroI = 3;
      canibalI = 3;
      misioneroD = 0;
      canibalD = 0;
   }
   
   public MisioneroCanibal(int misionerosIzquierda, int canibalesIzquierda) {
      this.misioneroI = misionerosIzquierda;
      this.canibalI = canibalesIzquierda;
      this.misioneroD = 0;
      this.canibalD = 0;
   }

   /* Getters */
   public int getMisionerosIzq() {
      return this.misioneroI;
   }
   public int getCanibalesIzq() {
      return this.canibalI;
   }
   public int getMisionerosDer() {
      return this.misioneroD;
   }
   public int getCanibalesDer() {
      return this.canibalD;
   }

   /* Setters */
   public void setMisionerosIzq(int n) {
      this.misioneroI = n;
   }
   public void setCanibalesIzq(int n) {
      this.canibalI = n;
   }
   public void setMisionerosDer(int n) {
      this.misioneroD = n;
   }
   public void setCanibalesDer(int n) {
      this.canibalD = n;
   }

   /* toString */
   public void toString(String paso) {
      System.out.print(getMisionerosIzq() + "  " + getCanibalesIzq());
      System.out.print(paso.equalsIgnoreCase("ida") ? "  |  =| " : "  |=  | ");
      System.out.println(getMisionerosDer() + "  " + getCanibalesDer());
   }

   public static void advertencia() {
      System.err.println("Novato la jugada es inválida!");
      System.exit(0);
   }

   /* Funciones de espacios de estados */
   public void unMisionero(String paso) {
      if (paso.equalsIgnoreCase("ida")) {
         if (getMisionerosIzq() > 0) {
            setMisionerosIzq(getMisionerosIzq() - 1);
            setMisionerosDer(getMisionerosDer() + 1);
            toString("ida");
         } else advertencia();
      } else {
         if (getMisionerosDer() > 0) {
            setMisionerosDer(getMisionerosDer() - 1);
            setMisionerosIzq(getMisionerosIzq() + 1);
            toString("regreso");
         } else advertencia();
      }
   }

   public void unCanibal(String paso) {
      if (paso.equalsIgnoreCase("ida")) {
         if (getCanibalesIzq() > 0) {
            setCanibalesIzq(getCanibalesIzq() - 1);
            setCanibalesDer(getCanibalesDer() + 1);
            toString("ida");
         } else advertencia();
      } else {
         if (getCanibalesDer() > 0) {
            setCanibalesDer(getCanibalesDer() - 1);
            setCanibalesIzq(getCanibalesIzq() + 1);
            toString("regreso");
         } else advertencia();
      }
   }

   public void unCanibalUnMisionero(String paso) {
      if (paso.equalsIgnoreCase("ida")) {
         if (getMisionerosIzq() > 0 && getCanibalesIzq() > 0) {
            setMisionerosIzq(getMisionerosIzq() - 1);
            setCanibalesIzq(getCanibalesIzq() - 1);
            setMisionerosDer(getMisionerosDer() + 1);
            setCanibalesDer(getCanibalesDer() + 1);
            toString("ida");
         } else advertencia();
      } else {
         if (getMisionerosDer() > 0 && getCanibalesDer() > 0) {
            setMisionerosDer(getMisionerosDer() - 1);
            setCanibalesDer(getCanibalesDer() - 1);
            setMisionerosIzq(getMisionerosIzq() + 1);
            setCanibalesIzq(getCanibalesIzq() + 1);
            toString("regreso");
         }
      }
   }
   
   public void dosMisioneros(String paso) {
      if (paso.equalsIgnoreCase("ida")) {
         if (getMisionerosIzq() >= 2) {
            setMisionerosIzq(getMisionerosIzq() - 2);
            setMisionerosDer(getMisionerosDer() + 2);
            toString("ida");
         } else advertencia();
      } else {
         if (getMisionerosDer() >= 2) {
            setMisionerosDer(getMisionerosDer() - 2);
            setMisionerosIzq(getMisionerosIzq() + 2);
            toString("regreso");
         } else advertencia();
      }
   }

   public void dosCanibales(String paso) {
      if (paso.equalsIgnoreCase("ida")) {
         if (getCanibalesIzq() >= 2) {
            setCanibalesIzq(getCanibalesIzq() - 2);
            setCanibalesDer(getCanibalesDer() + 2);
            toString("ida");
         } else advertencia();
      } else {
         if (getCanibalesDer() >= 2) {
            setCanibalesDer(getCanibalesDer() - 2);
            setCanibalesIzq(getCanibalesIzq() + 2);
            toString("regreso");
         } else advertencia();
      }
   }
}