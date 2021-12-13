public class Main {
    public static void main(String[] args) {

        // Definition of all vectors present in question.
        Vector A, B, C, D, E, F, G, H, J, I, Vec0;
        A = new Vector(3, 2);
        B = new Vector(1, 3);
        C = new Vector(1, -3);
        D = new Vector(4,0);
        E = new Vector(-3, 2);
        F = new Vector(0,4);
        G = new Vector(0, -4);
        H = new Vector(2, 0);
        I = new Vector(1, 0);
        J = new Vector(3, 4);

        // 0 Vector which will be needed for addition.
        Vec0 = new Vector(0, 0);

        // Loop for possible number of additions between 10 vectors (2^10 - 1)
        for (int i = 0; i < Math.pow(2, 10); i++) {
            // Take the index and make it binary
            String bin = Integer.toBinaryString(i);

            // fills in 0 values not present in index up until the 10th index, for example 3 would turn into "11" which would turn into "0000000011".
            if (bin.length() < 10) {
                String str0 = new String(new char[10 - bin.length()]).replace("\0", "0");
                bin = str0 + bin;
            }

            // Create array for each binary state.
            String[] binStates = bin.split("");

            // Sum vector of all vectors with activated binary state.
            Vector addVec = Vec0
                    .plus(A, binStates[0])
                    .plus(B, binStates[1])
                    .plus(C, binStates[2])
                    .plus(D, binStates[3])
                    .plus(E, binStates[4])
                    .plus(F, binStates[5])
                    .plus(G, binStates[6])
                    .plus(H, binStates[7])
                    .plus(I, binStates[8])
                    .plus(J, binStates[9]);

            // if the sum is zero the binary value is printed.
            if (addVec.isZero()) System.out.println(bin);
        }
    }
}
