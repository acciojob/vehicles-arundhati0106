package com.driver;

public class F1 extends Car {
    //constructor
    public F1(String name, boolean isManual) {
        super(name, 4, 0, 6, isManual, "F1 race car", 1);
        //Use arbitrary values for parameters which are not mentioned
    }

    //methods
    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        //add rate to the current speed
        newSpeed = getCurrentSpeed() + rate;

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            this.setCurrentGear(1);
        }

        //for all other cases, change the gear accordingly
        if(newSpeed > 0) {
            if(newSpeed <= 50) {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(1);
            }

            else if(newSpeed <= 100) {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(2);
            }

            else if(newSpeed <= 150) {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(3);
            }

            else if(newSpeed <= 200) {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(4);
            }

            else if(newSpeed <= 250) {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(5);
            }

            else {
                this.setCurrentSpeed(newSpeed);
                this.setCurrentGear(6);
            }

            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
