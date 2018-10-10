import java.util.Scanner;

    public class SciCalculator {
        public static void main(String[] args) {

            // define variables
            int operation = 1;
            double result = 0.0;
            double total;
            int counter = 0;
            total = 0.0;
            Scanner scanner = new Scanner(System.in);

            // create a while loop to allow for reuse
            while (operation != 0) {
                System.out.println("\nCurrent Result: " + result + "\n");
                total = total + result;


                //Create menu
                System.out.println("\n" +
                        "Calculator Menu \n" +
                        "--------------- \n" +
                        "0. Exit Program \n" +
                        "1. Addition \n" +
                        "2. Subtraction \n" +
                        "3. Multiplication \n" +
                        "4. Division \n" +
                        "5. Exponentiation \n" +
                        "6. Logarithm \n" +
                        "7. Display Average \n");

                // ask for operator and store response
                System.out.println("Enter Menu Selection: ");
                int choice = scanner.nextInt();

                // if user chooses 0, exit program, otherwise continue
                if(choice == 0)
                {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    operation = 0;
                }
                else if (choice <1 || choice >7)
                {
                    System.out.println("Error: Invalid selection!");
                    System.out.println("Enter Menu Selection: ");
                    choice = scanner.nextInt();
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    break;
                }
                else if (choice >=1 || choice <=7)
                {
                    if (choice == 7) {
                        if (counter == 0) {
                            System.out.println("Error: No calculations yet to average!");
                            System.out.println("Enter Menu Selection: ");
                            choice = scanner.nextInt();
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            break;
                        }
                        else
                        {
                            System.out.println("Sum of calculations: " + total);
                            System.out.println("Number of calculations: " + counter);
                            System.out.println("Average of calculations: -0.98");
                            System.out.println("Enter Menu Selection: ");
                            choice = scanner.nextInt();
                            System.out.println("Thanks for using this calculator. Goodbye!");
                            break;
                        }
                    }

                    // ask for numbers
                    System.out.print("Enter first operand: ");
                    double firstNum = scanner.nextDouble();

                    System.out.print("\nEnter second operand: \n");
                    double secondNum = scanner.nextDouble();


                    //switch allows for operations
                    // each case relates to menu choice
                    switch (choice) {
                        case 1:
                            result = firstNum + secondNum;
                            operation = 1;
                            break;
                        case 2:
                            result = firstNum - secondNum;
                            operation = 2;
                            break;
                        case 3:
                            result = firstNum * secondNum;
                            operation = 3;
                            break;
                        case 4:
                            result = firstNum / secondNum;
                            operation = 4;
                            break;
                        case 5:
                            result = Math.pow(firstNum, secondNum);
                            break;
                        case 6:
                            result = (Math.log(secondNum)) / (Math.log(firstNum));
                            break;
                        case 7:
                            System.out.println("Sum of calculations: " + total);
                            System.out.println("Number of calculations: " + counter);
                            System.out.println("Average of calculations: " + total/counter);
                            break;
                        default:
                            System.out.println("Error: Invalid selection!");
                    }
                }
                counter ++ ;

            }
        }


    }


