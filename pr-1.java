import java.util.Random;
class pr_1{
    public static void main(String[] args) {
        Random rand = new Random();int count=0; int coins=0;
        System.out.println("Roll the dice 2 times in one turn and each turn will cost 4$");
        System.out.println("you have to match the number of dice 1 and dice 2 to win the game");
        System.out.println("There will be wining coins in $  ,like how close you are to match the numbers of dice 1 and dice 2, you will get coins in $");
        while (true) { 
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        count++;
if(Math.abs(dice1-dice2)==1){
    
            System.out.println("You are very close to match the numbers of dice 1 and dice 2, you will get 3$");
coins+=3;
        }
        else if(Math.abs(dice1-dice2)==2){
            System.out.println("You are close to match the numbers of dice 1 and dice 2, you will get 2$");
coins+=2;
        }
        else if(Math.abs(dice1-dice2)==3){
            System.out.println("You are far from match the numbers of dice 1 and dice 2, you will get 1$");
coins+=1;
        }
        else if(Math.abs(dice1-dice2)==4){
            System.out.println("You are very far from match the numbers of dice 1 and dice 2, you will get 0.5$");
coins+=0.5;
        }
        else if(Math.abs(dice1-dice2)==5){
            System.out.println("You are extremely far from match the numbers of dice 1 and dice 2, you will get 0.10$");
coins+=0.10;
        }
        else{
            System.out.println("You are not close to match the numbers of dice 1 and dice 2, you will get nothing");
        }
        if (dice1 == dice2) {
            System.out.println("Congratulations! You matched the numbers and won the game!");
            System.out.println("Total turns taken: " + count + " and total cost: $" + 3 * count);
            System.out.println("Total coins earned: $" + (10 + coins));
            break;
        } 
        

    }
}}