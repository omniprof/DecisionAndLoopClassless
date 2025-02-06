import module java.base;

Scanner sc = null;

void checkPassFail() {
    int number = Integer.parseInt(readln("checkPassFail - Enter a number from 1 to 100: "));

    if (number > 50) {
        println("Pass");
    } else {
        println("Fail");
    }
}

void checkOddEven() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("checkOddEven - Please enter an integer: "));
    if (number % 2 == 0) {
        println("Even");
    } else {
        println("Odd");
    }
}

void calculateProduct1ToN() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("calculateProduct1ToN - Please enter an integer: "));

    int answer = 1;
    for (int x = 1; x <= number; x++) {
        answer *= x;
    }
    println("The product of 1 to " + number + " is " + answer);
}


void calculateSumAndAverage() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("calculateSumAndAverage - Please enter an integer: "));

    int answer = 0;
    for (int x = 1; x <= number; x++) {
        answer += x;
    }

    double average = (double) answer / number;

    println("answer = " + answer + " average = " + average);
}

void makeCheckerBoard() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("makeCheckerBoard - Please the number of symbols per row: "));
    
    if (number < 20) {
        // Rows
        for(int row = 0; row < number; ++row) {
            // Columns
            if (row % 2 == 1) {
                print("  ");
            }
            for(int col = 0; col < number; ++col) {
                print("# ");
            }
            println("");
        }
    } else {
        println("Numbers 20 and greater are not acceptable.");
    }
}

void displayCozaLozaWoza() {
    readln("Press enter to continue.\n");
    println("displayCozaLozaWoza");
    for (int x = 1; x <= 110; x += 11) {
        for (int y = x; y < x + 11; ++y) {
            if (y % 3 == 0 && y % 5 == 0 && y % 7 == 0) {
                print("CozaLozaWoza ");
            } else if (y % 3 == 0 && y % 7 == 0) {
                print("CozaWoza ");
            } else if (y % 5 == 0 && y % 7 == 0) {
                print("LozaWoza ");
            } else if (y % 3 == 0 && y % 5 == 0) {
                print("CozaLoza ");
            } else if (y % 3 == 0) {
                print("Coza ");
            } else if (y % 5 == 0) {
                print("Loza ");
            } else if (y % 7 == 0) {
                print("Woza ");
            } else {
                print(y + " ");
            }
        }
        print("\n");
    }
}

void printNumberInWordA() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("printNumberInWordA - Please enter a number from 0 to 9: "));
    String wordNumber;
    if (number >= 0 && number <= 9) {
        if (number == 0) {
            wordNumber = "Zero";
        } else if (number == 1) {
            wordNumber = "One";
        } else if (number == 2) {
            wordNumber = "Two";
        } else if (number == 3) {
            wordNumber = "Three";
        } else if (number == 4) {
            wordNumber = "Four";
        } else if (number == 5) {
            wordNumber = "Five";
        } else if (number == 6) {
            wordNumber = "Six";
        } else if (number == 7) {
            wordNumber = "Seven";
        } else if (number == 8) {
            wordNumber = "Eight";
        } else if (number == 9) {
            wordNumber = "Nine";
        } else {
            wordNumber = "Something has gone wrong.";
        }
        println("The number " + number + " in a word is " + wordNumber);
    } else {
        println("Number out of range.");
    }
}
void printNumberInWordB() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("printNumberInWordB - Please enter a number from 0 to 9: "));
    String wordNumber;
    if (number >= 0 && number <= 9) {
        switch (number) {
            case 0: 
                wordNumber = "Zero";
                break;
            case 1: 
                wordNumber = "One";
                break;
            case 2:
                wordNumber = "Two";
                break;
            case 3:
                wordNumber = "Three";
                break;
            case 4:
                wordNumber = "Four";
                break;
            case 5:
                wordNumber = "Five";
                break;
            case 6:
                wordNumber = "Six";
                break;
            case 7:
                wordNumber = "Seven";
                break;
            case 8:
                wordNumber = "Eight";
                break;
            case 9:
                wordNumber = "Nine";
                break;
            default:
                wordNumber = "Something has gone wrong.";
                break;
        }
        println("The number " + number + " in a word is " + wordNumber);
    } else {
        println("Number out of range.");
    }
}

void printNumberInWordC() {
    readln("Press enter to continue.\n");
    int number = Integer.parseInt(readln("printNumberInWordC - Please enter a number from 0 to 9: "));
    String wordNumber;
    if (number >= 0 && number <= 9) {
        wordNumber = switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Something has gone wrong.";
        };
        println("The number " + number + " in a word is " + wordNumber);
    } else {
        println("Number out of range.");
    }
}

void main() {
    sc = new Scanner(System.in);
    checkPassFail();
//    checkOddEven();
//    calculateProduct1ToN();
//    calculateSumAndAverage();
//    displayCozaLozaWoza();
//    makeCheckerBoard();
//    printNumberInWordA();
//    printNumberInWordB();
//    printNumberInWordC();
}

