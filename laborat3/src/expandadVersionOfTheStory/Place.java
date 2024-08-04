package expandadVersionOfTheStory;

//локальный класс

public class Place {
    private String imaginaryForest, nameOfTheForest;

    public Place(String imaginaryForest, String nameOfTheForest) {
        this.imaginaryForest = imaginaryForest;
        this.nameOfTheForest = nameOfTheForest;
    }

    private interface Address {
        String getImaginaryForest();

        String getNameOfTheForest();
    }

    public Address getAddress() {
        class PersonAddress implements Address {
            final String imaginaryForest = Place.this.imaginaryForest;
            final String nameOfTheForest = Place.this.nameOfTheForest;

            @Override
            public String getImaginaryForest() {
                return this.imaginaryForest;
            }

            @Override
            public String getNameOfTheForest() {
                return this.nameOfTheForest;
            }
        }

        return new PersonAddress();
    }


    }

