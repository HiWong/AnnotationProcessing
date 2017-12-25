package wang.imallen.blog.annotationprocessing.factory;

import wang.imallen.blog.annotation.Factory;

/**
 * Created by wangallen on 2017/12/25.
 */
@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {
    @Override
    public float getPrice() {
        return 8.5f;
    }
}
