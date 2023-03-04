import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CheckNumber {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                                Select mode
                    1: Parallelepiped
                    2: Cylinder
                    3: End program
                    """);
            byte selectMode = new Scanner(System.in).nextByte();
            switch (selectMode) {
                case 1 -> parallelepipedSquare();
                case 2 -> cylinderSquareOrVolume();
                case 3 -> isTrue = false;
            }
        }


    }

    static void parallelepipedSquare() throws CheckNumber {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    1: Volume
                    2: Square
                    3: Back
                    """);
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode) {
                case 1 -> {
                    Parallelepiped parallelepiped = new Parallelepiped();
                    while (true) {
                        try {
                            System.out.println("Enter length");
                            double l = new Scanner(System.in).nextDouble();

                            if (l <= 0) {
                                throw new CheckNumber("Negative number !!!");
                            } else {
                                parallelepiped.setL(l);
                                break;
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    while (true) {
                        try {
                            System.out.println("Enter width");
                            double w = new Scanner(System.in).nextDouble();
                            if (w > 0) {
                                parallelepiped.setW(w);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Enter height");
                            double h = new Scanner(System.in).nextDouble();
                            if (h > 0) {
                                parallelepiped.setH(h);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber p) {
                            System.out.println(p.getMessage());
                        }
                    }
                    parallelepiped.volume();
                }
                case 2 -> {
                    Parallelepiped parallelepiped1 = new Parallelepiped();
                    while (true) {
                        try {
                            System.out.println("Enter length ");
                            double l = new Scanner(System.in).nextDouble();

                            if (l <= 0) {
                                throw new CheckNumber("Negative number !!!");
                            } else {
                                parallelepiped1.setL(l);
                                break;
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    while (true) {
                        try {
                            System.out.println("Enter width");
                            double w = new Scanner(System.in).nextDouble();
                            if (w > 0) {
                                parallelepiped1.setW(w);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Enter height");
                            double h = new Scanner(System.in).nextDouble();
                            if (h > 0) {
                                parallelepiped1.setH(h);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber p) {
                            System.out.println(p.getMessage());
                        }
                    }
                    System.out.println(parallelepiped1.square());
                }
                case 3 -> {
                    isTrue = false;
                }

            }
        }

    }

    static void cylinderSquareOrVolume() {
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("""
                    1: Volume
                    2: Square
                    3: Back
                    """);
            int selectMode = new Scanner(System.in).nextInt();
            switch (selectMode) {
                case 1 -> {
                    Cylinder cylinder = new Cylinder();
                    while (true) {
                        try {
                            System.out.println("Enter radius");
                            double r = new Scanner(System.in).nextDouble();

                            if (r <= 0) {
                                throw new CheckNumber("Negative number !!!");
                            } else {
                                cylinder.setR(r);
                                break;
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    while (true) {
                        try {
                            System.out.println("Enter height");
                            double h = new Scanner(System.in).nextDouble();
                            if (h > 0) {
                                cylinder.setH(h);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber p) {
                            System.out.println(p.getMessage());
                        }
                    }
                    cylinder.volume();
                }
                case 2 -> {
                    Cylinder cylinder = new Cylinder();
                    while (true) {
                        try {
                            System.out.println("Enter radius ");
                            double r = new Scanner(System.in).nextDouble();

                            if (r <= 0) {
                                throw new CheckNumber("Negative number !!!");
                            } else {
                                cylinder.setR(r);
                                break;
                            }
                        } catch (CheckNumber e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    while (true) {
                        try {
                            System.out.println("Enter height");
                            double h = new Scanner(System.in).nextDouble();
                            if (h > 0) {
                                cylinder.setH(h);
                                break;
                            } else {
                                throw new CheckNumber("Negative number !!!");
                            }
                        } catch (CheckNumber p) {
                            System.out.println(p.getMessage());
                        }
                    }
                    cylinder.square();
                }
                case 3 -> {
                    isTrue = false;
                }

            }
        }
    }
}

