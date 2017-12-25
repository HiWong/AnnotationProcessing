package wang.imallen.blog.annotationprocessing.factory;

import wang.imallen.blog.annotation.Factory;

/**
 * Created by wangallen on 2017/12/25.
 */
@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {
    @Override
    public float getPrice() {
        return 4.5f;
    }
}
