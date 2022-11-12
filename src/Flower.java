public class Flower {
    private String name;
    private String flowerColor;//цвет цветка
    private String country;//страна происхождения
    private Double cost;//стоимость
    int lifeSpan;//срок стояния, в днях


    Flower(String name, String flowerColor, String country, Double cost, Integer lifeSpan) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "цветок";
        }else {
            this.name = name;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost == null || cost <= 0) {
            this.cost = 1.0;
        }else {
            this.cost = cost;
        }
        if (lifeSpan == null || lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return name;
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        if (cost == null || cost <= 0) {
            this.cost = Double.valueOf(1);
        } else {
            this.cost = cost;
        }
    }

    static Double getBouquet(Flower[] flowers) {
        double sum = 0;
        int min = flowers[0].lifeSpan;
        for (int i = 0; i < flowers.length; i++) {
            sum = sum + flowers[i].getCost();
            if (min > flowers[i].lifeSpan) {
                min = flowers[i].lifeSpan;
            }
        }
        sum = sum + sum * 0.1;
        return sum;
    }

    static Integer getLifeSpanBouquet(Flower[] flowers) {
        int min = flowers[0].lifeSpan;
        for (int i = 0; i < flowers.length; i++) {
            if (min > flowers[i].lifeSpan) {
                min = flowers[i].lifeSpan;
            }
        }
        return min;
    }



    @Override
    public String toString() {
        return "Название цветка: " + name +
                ", Цвет: " + flowerColor +
                ", Страна происхождения: " + country +
                ", Стоимость: " + cost + " рублей" +
                ", Время стояния: " + lifeSpan + " дней";
    }

}
