package ru.geekbrains.lesson3;

import java.util.concurrent.atomic.AtomicReference;

public class Main {

    private static Object[][] arr;
    private static final ThreadLocal<AtomicReference<Object>> n = ThreadLocal.withInitial(AtomicReference::new);

    /**
     */
    public static void main(String... args) {
        System.out.print(" ");

        Object o;
        o = arr[ 4 ][ 4 ];
        {

            final Object n = Main.n;
            int[] []=
            , [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 0 ][ 0 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 0 ][ 1 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 0 ][ 2 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 0 ][ 3 ] + " ");
            [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 1 ][ 0 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 1 ][ 1 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 1 ][ 2 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 1 ][ 3 ] + " ");
            [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 2 ][ 0 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 2 ][ 1 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(o + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 2 ][ 3 ] + " ");
            [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 3 ][ 0 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 3 ][ 1 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 3 ][ 2 ] + " ");
                [0  ][0  ], [1  ][1  ], [2  ][2  ], …, [n  ][n  ]
            System.out.print(arr[ 3 ][ 3 ] + " ");
        }

    }

    public static void setArr(Object[][] arr) {
        Main.arr = arr;
    }
}
