/**
 ░░█ █▀█ █▀ █░█ █▀▀ █▀█ █▀█ █▀▄▀█
 █▄█ █▄█ ▄█ █▄█ ██▄ █▀▄ █▄█ █░▀░█
**/
package interfaz;
import mundo.MisioneroCanibal;

public class InterfazApp {
   public static void main(String args[]) {
      MisioneroCanibal mc = new MisioneroCanibal();
      System.out.println("Mi Ci |   | Md Cd");
      mc.toString("inicio");

      mc.unCanibalUnMisionero("ida");
      mc.unMisionero("regreso");
      mc.dosCanibales("ida");
      mc.unCanibal("regreso");
      mc.dosMisioneros("ida");
      mc.unCanibalUnMisionero("regreso");
      mc.dosMisioneros("ida");
      mc.unCanibal("regreso");
      mc.dosCanibales("ida");
      mc.unMisionero("regreso");
      mc.unCanibalUnMisionero("ida");
   }
}
