package com.tree.problems;

import java.util.concurrent.Callable;

interface Reptile {
    ReptileEgg lay();
}

class FireDragon  implements Reptile{
    public FireDragon() {
    }

    public ReptileEgg lay(){
        System.out.println("lsls");
        Reptile fd = new FireDragon();

        return new ReptileEgg(fd);
    }
  
    public static void main(String[] args) throws Exception {
        FireDragon fireDragon = new FireDragon();
        System.out.println(fireDragon instanceof Reptile);
    }
}

class ReptileEgg {
    public ReptileEgg(Callable<Reptile> createReptile) {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public Reptile hatch() throws Exception {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
}