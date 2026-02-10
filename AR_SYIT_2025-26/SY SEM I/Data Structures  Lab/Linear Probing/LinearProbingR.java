import java.util.Scanner;

public class LinearProbingR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of hash table: ");
        int n = sc.nextInt();
        int[] hashTable = new int[n];
        boolean[] occupied = new boolean[n];

        // Initialize hash table
        for (int i = 0; i < n; i++) {
            hashTable[i] = -1;
            occupied[i] = false;
        }

        System.out.print("Enter number of elements to insert: ");
        int m = sc.nextInt();

        if (m > n) {
            System.out.println("Error: Cannot insert more elements than table size!");
            sc.close();
            return;
        }

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            int key = sc.nextInt();
            int idx = key % n;

            if (!occupied[idx]) {
                // Direct insert
                hashTable[idx] = key;
                occupied[idx] = true;
            } else {
                // Replacement logic
                int existingKey = hashTable[idx];
                int existingHome = existingKey % n;

                if (existingHome != idx) {
                    // Replace current key with new one
                    hashTable[idx] = key;
                    key = existingKey;  // reinsert displaced element
                }

                // Find next available slot by linear probing
                int j = (idx + 1) % n;
                while (occupied[j]) {
                    j = (j + 1) % n;
                }
                hashTable[j] = key;
                occupied[j] = true;
            }
        }

        // Print final hash table
        System.out.println("\nHash Table:");
        for (int i = 0; i < n; i++) {
            if (hashTable[i] == -1)
                System.out.println(i + " : empty");
            else
                System.out.println(i + " : " + hashTable[i]);
        }

        sc.close();
    }
}
