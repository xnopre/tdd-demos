type Price = {
  unitPrice: number;
  quantity: number;
  tax?: number;
};

export class Pricer {
  getPrice({ quantity, unitPrice, tax }: Price) {
    const priceWithTax = unitPrice * quantity * (1 + tax / 100);
    return this.round(priceWithTax) + " €";
  }

  private round(priceWithTax: number) {
    return parseInt("" + (priceWithTax * 100 + 0.5)) / 100;
  }
}
