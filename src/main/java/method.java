class birdsmed {

    public void method() {
        Bird[] array = {eagle, swallow, penguin, kiwi};
        for (int i = 0; i < 4; i++)
            System.out.println(array[i].getClass() + " can fly " + array[i].fly());
    }

        Eagle eagle = new Eagle();
        Swallow swallow = new Swallow();
        Penguin penguin = new Penguin();
        Kiwi kiwi = new Kiwi();


}
