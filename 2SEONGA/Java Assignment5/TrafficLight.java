import javax.swing.plaf.synth.ColorType;
import javafx.scene.effect.Light;

public class TrafficLight {
    public static void main(String[] args) {
      whatColor("RED");
      whatColor("YELLOW");
      whatColor("GREEN");
      whatColor("BLUE");
    }
    static String whatColor(String colorType) {      
      switch (colorType) {
        case "RED" -> System.out.printf("빨간불이 켜집니다.");
        case "YELLOW" -> System.out.printf("노란불이 켜집니다.");
        case "GREEN" -> System.out.printf("초록불이 켜집니다.");
        default -> System.out.printf("에러, 잘못된 색 입력 : %s\n", colorType);
      };
    }
}
