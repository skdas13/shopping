package shopping.checkout;

import java.math.BigDecimal;

public class ReceiptFormatter {
	private final Printer printer;

	public ReceiptFormatter(Printer printer) {
		this.printer = printer;
	}
	
	public void printReceiptLine(Product product, int count, BigDecimal lineTotal) {
		printer.print(count + " " + product.name() + " @ "
				+ product.unitPrice() + " each = " + lineTotal + "\n");
	}

    public void printReceiptDiscountLine(Product product, int count, BigDecimal lineTotal) {
        printer.print("Discount " + count + " " + product.name() + " @ "
                + product.unitPrice() + " each = " + lineTotal + "\n");
    }

	public void printTotalLine(BigDecimal total) {
		printer.print("Total = " + total + "\n");
	}

    public void printDiscountLine(BigDecimal total) {
        printer.print("Discount = " + total + "\n");
    }

    public void printSubTotalLine(BigDecimal total) {
        printer.print("Sub Total = " + total + "\n");
    }
	
	public void endOfReceipt() {
		printer.feed();
	}
}