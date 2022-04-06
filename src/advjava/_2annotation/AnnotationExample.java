package advjava._2annotation;


import java.lang.reflect.Method;

public class AnnotationExample {

    //Annotations help to associate metadata (information) to the program elements
    // i.e. instance variables, constructors, methods, classes, etc.
    //Annotations are not pure comments as they can change the way a program is treated by the compiler


    public static void main(String[] args) throws Exception {

            AnnotationExample annotationExample = new AnnotationExample();
            Method method = annotationExample.getClass().getMethod("myMethod");

            MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
            System.out.println(""+annotation.value());

    }


    @MethodAnnotation(value = 1)
    public void myMethod() {
        System.out.println("Method");
    }

}

@ClassAnnotations
class ExClass {

}

