package reflection;

import shop.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionPlayground {

    public static void main(String[] args) {

        Dog dog = new Dog("burek");

        Class<?> dogClass = dog.getClass();

        createDogUsingNewInstanceOnConstructorObject(dogClass);

        System.out.println(Arrays.toString(dogClass.getMethods()));

        getAllSuperClasses(dog);

        invokePrivateMethod(dog, dogClass);
    }

    private static void invokePrivateMethod(Dog dog, Class<?> dogClass) {
        try {
            Method privateMethod = dogClass.getDeclaredMethod("privateMethod");
            //we need to set accessible to true to be able to invoke method
            privateMethod.setAccessible(true);
            privateMethod.invoke(dog);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void getAllSuperClasses(Dog dog) {

        Class<?> aClass = dog.getClass();
        List<Class<?>> classes = new ArrayList<>();
        while (aClass != null) {
            classes.add(aClass);
            //assign new superclass object
            aClass = aClass.getSuperclass();
        }

        System.out.println(classes);
    }

    private static void createDogUsingNewInstanceOnConstructorObject(Class<?> dogClass) {
        //get all constructors including private ones
        System.out.println(Arrays.toString(dogClass.getDeclaredConstructors()));

        //Get first constructor
        Constructor<?> declaredConstructor = dogClass.getDeclaredConstructors()[0];

        //need try catch cause newInstance is throwing bunch of exceptions
        try {
            // using newInstance to crate Object that can be later cast to Dog
            Object reflectionDog = declaredConstructor.newInstance("Dog", 7);
            if (reflectionDog instanceof Dog) {
                Dog castedDog = (Dog) reflectionDog;
                System.out.println(castedDog);
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
