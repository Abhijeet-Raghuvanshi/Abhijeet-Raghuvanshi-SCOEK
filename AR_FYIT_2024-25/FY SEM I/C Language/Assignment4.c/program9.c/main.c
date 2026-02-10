#include <stdio.h>

// Define an enum for days of the week
enum Day {
    SUNDAY,    // 0
    MONDAY,    // 1
    TUESDAY,   // 2
    WEDNESDAY, // 3
    THURSDAY,  // 4
    FRIDAY,    // 5
    SATURDAY   // 6
};

int main() {
    // Declare a variable of enum type
    enum Day today;

    // Assign a value to the variable
    today = WEDNESDAY;

    // Print the current day
    printf("Today is ");
    switch (today) {
        case SUNDAY:
            printf("Sunday.\n");
            break;
        case MONDAY:
            printf("Monday.\n");
            break;
        case TUESDAY:
            printf("Tuesday.\n");
            break;
        case WEDNESDAY:
            printf("Wednesday.\n");
            break;
        case THURSDAY:
            printf("Thursday.\n");
            break;
        case FRIDAY:
            printf("Friday.\n");
            break;
        case SATURDAY:
            printf("Saturday.\n");
            break;
        default:
            printf("an invalid day.\n");
    }

    return 0;
}
