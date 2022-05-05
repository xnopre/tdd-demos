import { Pricer } from "./pricer";

describe("Pricer", function () {
  it("calculates price without tax", function () {
    const pricer = new Pricer();
    const price = pricer.getPrice({
      quantity: 3,
      unitPrice: 1.21,
      tax: 0,
    });
    expect(price).toEqual("3.63 €");
  });

  it("calculates price with tax", function () {
    const pricer = new Pricer();
    const price = pricer.getPrice({
      quantity: 3,
      unitPrice: 1.21,
      tax: 5,
    });
    expect(price).toEqual("3.81 €");
  });

  it("calculates price with tax 20", function () {
    const pricer = new Pricer();
    const price = pricer.getPrice({
      quantity: 3,
      unitPrice: 1.21,
      tax: 20,
    });
    expect(price).toEqual("4.36 €");
  });
});
