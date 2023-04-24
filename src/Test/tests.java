import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class tests {

    @Test
    public void testConstrutorRetangulo() {
        String entrada1 = "0 0 3 0 3 4 0 4";
        String entrada2 = "6 4 2 8 6 12 10 8";
        String entrada3 = "10 4 6 8 10 12 14 8";

        Retangulo r1 = new Retangulo(entrada1);
        Retangulo r2 = new Retangulo(entrada2);
        Retangulo r3 = new Retangulo(entrada3);

        assertEquals(new Ponto(0,0), r1.a);
        assertEquals(new Ponto(3,0), r1.b);
        assertEquals(new Ponto(3,4), r1.c);
        assertEquals(new Ponto(0,4), r1.d);

        assertEquals(new Ponto(6,4), r2.a);
        assertEquals(new Ponto(2,8), r2.b);
        assertEquals(new Ponto(6,12), r2.c);
        assertEquals(new Ponto(10,8), r2.d);

        assertEquals(new Ponto(10,4), r3.a);
        assertEquals(new Ponto(6,8), r3.b);
        assertEquals(new Ponto(10,12), r3.c);
        assertEquals(new Ponto(14,8), r3.d);
    }
    @Test
    public void testConstrutorTriangulo() {
        String entrada1 = "6 8 14 8 10 4";
        String entrada2 = "6 10 6 20 12 14";
        String entrada3 = "12 6 6 10 12 14";

        Triangulo t1 = new Triangulo(entrada1);
        Triangulo t2 = new Triangulo(entrada2);
        Triangulo t3 = new Triangulo(entrada3);

        assertEquals(new Ponto(6,8), t1.a);
        assertEquals(new Ponto(14,8), t1.b);
        assertEquals(new Ponto(10,4), t1.c);

        assertEquals(new Ponto(6,10), t2.a);
        assertEquals(new Ponto(6,20), t2.b);
        assertEquals(new Ponto(12,14), t2.c);

        assertEquals(new Ponto(12,6), t3.a);
        assertEquals(new Ponto(6,10), t3.b);
        assertEquals(new Ponto(12,14), t3.c);
    }

    @Test
    public void testConstrutorCircunferencia() {
        String entrada1 = "12 12 4";
        String entrada2 = "10 8 2";
        String entrada3 = "6 14 4";

        Cricunferencia c1 = new Circunferencia(entrada1);
        Cricunferencia c2 = new Circunferencia(entrada2);
        Cricunferencia c3 = new Circunferencia(entrada3);

        assertEquals(new Ponto(12,12), t1.a);
        assertEquals(4, t1.raio);

        assertEquals(new Ponto(10,8), t2.a);
        assertEquals(2, t2.raio);

        assertEquals(new Ponto(6,14), t3.a);
        assertEquals(4, t3.raio);
    }

    @Test
    public void testPostoCarga()	{
        //status 1 se robo no posto, 0 se posto vazio
        Ponto p1 = new Ponto(0, 0);
        PostoCarga posto1 = new PostoCarga(p1, 1);

        assertEquals(p1, posto1.p);
        assertEquals(1, posto1.status);

        Ponto p2 = new Ponto(10, 0);
        PostoCarga posto2 = new PostoCarga(p2, 0);

        assertEquals(p2, posto2.p);
        assertEquals(0, posto2.status);

        Ponto p3 = new Ponto(20, 0);
        PostoCarga posto3 = new PostoCarga(p3, 0);

        assertEquals(p3, posto3.p);
        assertEquals(0, posto3.status);

        Ponto p4 = new Ponto(0, 20);
        PostoCarga posto4 = new PostoCarga(p4, 1);

        assertEquals(p4, posto4.p);
        assertEquals(1, posto4.status);
    }

    @Test
    public void testRobo()	{
        /*
            Status robot
            0 = precisa de carregar;
            1 = A carregar
            2 = Pronto a usar;
            3 = Esta a andar mas sem carga
            4 = Esta a andar com carga
         */

        Ponto p1 = new Ponto(0, 0);
        Robo robo1 = new Robo(100.0,0.0,0,p1);

        assertEquals(100.0, robo1.bat);
        assertEquals(0.0, robo1.dist);
        assertEquals(0, robo1.status);
        assertEquals(new Ponto(0, 0),robo1.pos);

        Ponto p2 = new Ponto(3, 5);
        Robo robo2 = new Robo(70.0,10.0,2,p2);

        assertEquals(70.0, robo2.bat);
        assertEquals(10.0, robo2.dist);
        assertEquals(2, robo2.status);
        assertEquals(new Ponto(3,5),robo2.pos);

        Ponto p3 = new Ponto(7,8);
        Robo robo3 = new Robo(30.0,20.0,1,p2);

        assertEquals(30.0, robo2.bat);
        assertEquals(20.0, robo2.dist);
        assertEquals(1, robo2.status);
        assertEquals(new Ponto(7,8),robo2.pos);

    }

    @Test
    public void testGestor()	{
        //status 1 se robo no posto, 0 se posto vazio
        Ponto p1 = new Ponto(0, 0);
        PostoCarga posto1 = new PostoCarga(p1, 1);

    }



    @Test
    public void testtoString0() {
        assertEquals("00:00:00", new T2time( 0).toString());
        assertEquals("00:00:01", new T2time( 1).toString());
        assertEquals("01:01:01", new T2time(3661).toString());
        assertEquals("13:27:15", new T2time(T2time.T2DAYSECONDS-1).toString());
    }

    @Test
    public void testAdd() {
        assertEquals("00:00:00",
                (new T2time(0,0,0).add(new T2time(0,0,0))).toString());
        assertEquals("00:00:01",
                (new T2time(0,0,1).add(new T2time(0,0,0))).toString());
        assertEquals("00:00:00",
                (new T2time(13,27,15).add(new T2time(0,0,1))).toString());
        assertEquals("00:00:01",
                (new T2time(13,27,15).add(new T2time(0,0,2))).toString());
        assertEquals("01:01:01",
                (new T2time(13,27,15).add(new T2time(1,1,2))).toString());
    }
}