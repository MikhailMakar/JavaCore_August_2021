package lessons.lesson7.pecs;

interface A1{}

interface A2{}

interface A3{}

interface A4{}

interface B1 extends A1{}

interface B2 extends A1,A2{}

interface B3 extends A3,A4{}

interface B4 extends A4{}

interface C1 extends B2{}

interface C2 extends B2,B3{}

interface C3 extends B3{}

interface D1 extends C1,C2{}

interface D2 extends C2{}

interface E1 extends D1{}

interface E2 extends D1{}

interface E3 extends D2{}

interface E4 extends D2{}