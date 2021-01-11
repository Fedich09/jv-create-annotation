package core.lib;

import core.dao.BetDao;
import core.dao.BetDaoImp;
import core.dao.GainDao;
import core.dao.GainDaoImpl;
import core.exception.NotExistAnnotationException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {
    public static Object getInstance(Class clazz) {
        Constructor constructor;
        Object instance;
        Field[] declaredFields = clazz.getDeclaredFields();
        try {
            constructor = clazz.getConstructor();
            instance = constructor.newInstance();
            for (Field field : declaredFields) {
                if (field.getAnnotation(Inject.class) != null) {
                    field.setAccessible(true);
                    if (field.getType().equals(BetDao.class)
                            && BetDaoImp.class.getAnnotation(Dao.class) != null) {
                        field.set(instance, new BetDaoImp());
                    } else if (field.getType().equals(GainDao.class)
                            && GainDaoImpl.class.getAnnotation(Dao.class) != null) {
                        field.set(instance, new GainDaoImpl());
                    } else {
                        throw new NotExistAnnotationException("Not exist annotation "
                                + "in this class, we cant inject this instance ");
                    }
                }
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            throw new RuntimeException("Can't create instance this class " + e);
        }
        return instance;
    }
}
