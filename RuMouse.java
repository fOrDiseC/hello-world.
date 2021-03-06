package patterns.creational.abstract_factory_pattern.first_variant;

/**
 * Created on 18. November. 16.
 *
 * @author Evgeniy
 */
public class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Щелчок мышью.");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мышью.");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Скроллим вверх. ");
        }
        else if (direction < 0){
            System.out.println("Скроллим вниз. ");
        }
        else {
            System.out.println("Не скроллим. ");
        }
    }
}
