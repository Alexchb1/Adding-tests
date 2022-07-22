import javax.print.attribute.standard.Finishings;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonus = service.calculate(5000, true);
        System.out.println(bonus);

    }
}
