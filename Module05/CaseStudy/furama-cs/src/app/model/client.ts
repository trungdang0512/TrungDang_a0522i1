import {CustomerType} from "./CustomerType";

export interface Client {
  id?: number,
  nameClient?: string,
  idClient?: number,
  typeClient?: CustomerType,
  dateOfBirth?: string,
  phone?: number,
  email?: string,
  address?: string
}
