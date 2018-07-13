package chapter15.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("불독", "단비", 10.5));
        dogs.add(new Dog("푸들", "맥시", 9.0));
        dogs.add(new Dog("비글", "도도", 2.9));
        dogs.add(new Dog("불독", "방울", 3.7));
        dogs.add(new Dog("푸들", "뽀", 8.7));
        dogs.add(new Dog("비글", "순이", 9.2));
        dogs.add(new Dog("불독", "바다", 4.7));
        dogs.add(new Dog("푸들", "쫑", 1.4));
        dogs.add(new Dog("비글", "캔디", 8.8));
        dogs.add(new Dog("불독", "호야", 2.4));
        
        System.out.println(dogs);
        
        // 1. 품종별 몸무게 합, 평균
        // 2. 품종별 몸무게 최대값, 최소값
        // 3. 품종(String breed)을 키로 하고 List<Dog>를 값으로 갖는
        //    Map 만들기 (이름 순 정렬)
        //    - 즉, 품종별로 리스트 나누어 Map에 저장하기 (이름순 정렬)
        Map<String, Computation> map = new HashMap<>();
        for (Dog dog : dogs) {
            if (map.containsKey(dog.getBreed())) {
                Computation com = map.get(dog.getBreed());
                com.put(dog);
            } else {
                Computation com = new Computation();
                com.put(dog);
                map.put(dog.getBreed(), com);
            }
        }
        
        
        for (String breed : map.keySet()) {
            System.out.println("=== 품종 : " + breed + " ===");
            System.out.println("sum : " + map.get(breed).getSum());
            System.out.println("avg : " + map.get(breed).getAvg());
            System.out.println("min : " + map.get(breed).getMin());
            System.out.println("max : " + map.get(breed).getMax());
        }
        
        Map<String, List<Dog>> result = new HashMap<>();
        for (String breed : map.keySet()) {
            result.put(breed, map.get(breed).getDogs());
        }
        
        for (String breed : result.keySet()) {
            List<Dog> list = result.get(breed);
            for (Dog dog : list) {
                System.out.println(dog);
            }
        }
    }
}

class Computation {
    private double sum;
    private double max;
    private double min;
    private List<Dog> dogs;
    
    public Computation() {
        max = 0.0;
        min = Double.MAX_VALUE;
        dogs = new ArrayList<>(); 
    }
    
    public void put(Dog dog) {
        sum = (sum * 10 + dog.getWeight() * 10) / 10;
        max = Math.max(max, dog.getWeight());
        min = Math.min(min, dog.getWeight());
        dogs.add(dog);
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return sum / dogs.size();
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public List<Dog> getDogs() {
        dogs.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
        return dogs;
    }
}

class Dog {
    private String breed; //품종
    private String name; // 이름
    private double weight; // 몸무게
    public Dog(String breed, String name, double weight) {
        this.breed = breed;
        this.name = name;
        this.weight = weight;
    }
    public String getBreed() {
        return breed;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", name=" + name + ", weight=" + weight + "]";
    }
}
