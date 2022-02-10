import { FormControl, ValidationErrors } from '@angular/forms';

export class Luv2ShopValidators {
  //whitespace validation
  static notOnlyWhitespace(control: FormControl): ValidationErrors {
    if (control.value != null && control.value.trim().length === 0) {
      return {
        notOnlyWhitespace: true,
      };
    } else {
      return null;
    }
  }
}
