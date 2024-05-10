import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseListCtl } from '../base-list.component';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.PRODUCT, locator, route);
  }


  submit() {
    var _self = this;
    console.log('in submit');
    console.log(this.form);
    console.log(this.form.data);
    this.serviceLocator.httpService.post(this.api.save, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.data.id = res.result.data;
      // if (_self.fileToUpload) {
      //   console.log('Amisha');
      //   _self.myFile();
      // }
      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("----------Amisha----------.");

      } else {
        _self.form.error = true;
        if (res.result.inputerror) {
          _self.form.inputerror = res.result.inputerror;
        }
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }

  submit1() {
    var _self = this;
    console.log(this.form + "submit running start");
    console.log(this.form.data + "form data going to be submit");
    this.serviceLocator.httpService.post(this.api.search, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.inputerror = {};
      _self.form.data.id = res.result.data;
      // _self.myFile();
      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("--------------------.");

      } else {
        _self.form.error = true;
        _self.form.inputerror = res.result.inputerror;
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }


  

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }



 

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.roleId);
    console.log(form.roleId);
    flag = flag && validator.isNotNullObject(form.firstName);
    console.log(form.firstName);
    flag = flag && validator.isNotNullObject(form.lastName);
    console.log(form.lastName);
    flag = flag && validator.isNotNullObject(form.loginId);
    console.log(form.loginId);
    flag = flag && validator.isNotNullObject(form.password);
    console.log(form.password);
    flag = flag && validator.isNotNullObject(form.phone);
    console.log(form.phone);
    flag = flag && validator.isNotNullObject(form.alternateMobile);
    console.log(form.alternateMobile);
    flag = flag && validator.isNotNullObject(form.dob);
    console.log(form.dob);
    flag = flag && validator.isNotNullObject(form.gender);
    console.log(form.gender + 'gender--');
    flag = flag && validator.isNotNullObject(form.status);
    console.log(form.status + 'status---');


    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.productName = data.productName;
    form.quantity = data.quantity;
    form.price = data.price;
    form.paymentMode = data.paymentMode;
    form.status = data.status;
    
    console.log(form.status + 'status---');
  }
 

 

}
