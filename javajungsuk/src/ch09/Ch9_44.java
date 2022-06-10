package ch09;

import java.math.*;
import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;

public class Ch9_44 {

	public static void main(String[] args) throws Exception{

		// java.math.MathContext
		
		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");
		
		System.out.print("bd1 = " + bd1);
		System.out.print(",\tvalue = " + bd1.unscaledValue());
		System.out.print(",\tscale = " + bd1.scale());
		System.out.print(",\tprecision = " + bd1.precision());
		System.out.println();
		
		System.out.print("bd2 = " + bd2);
		System.out.print(",\tvalue = " + bd2.unscaledValue());
		System.out.print(",\tscale = " + bd2.scale());
		System.out.print(",\tprecision = " + bd2.precision());
		System.out.println();
		
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3 = " + bd3);
		System.out.print(",\tvalue = " + bd3.unscaledValue());
		System.out.print(",\tscale = " + bd3.scale());
		System.out.print(",\tprecision = " + bd3.precision());
		System.out.println();
		
		System.out.println("--------------------");
		System.out.println(bd1.divide(bd2, 2, HALF_UP));
		System.out.println(bd1.setScale(2, HALF_UP));
		System.out.println("--------------------");
		System.out.println(bd1.divide(bd2, new MathContext(1, HALF_UP)));
		System.out.println(bd1.divide(bd2, new MathContext(2, HALF_UP)));
		System.out.println(bd1.divide(bd2, new MathContext(3, HALF_UP)));
		System.out.println(bd1.divide(bd2, new MathContext(4, HALF_UP)));
		System.out.println(bd1.divide(bd2, new MathContext(5, HALF_UP)));

	}

}
