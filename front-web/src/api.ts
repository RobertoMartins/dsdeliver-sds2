import axios from "axios";

const API_URL='https://dsdeliver-roberto.herokuapp.com';
export function fetchProducts(){
    return axios(`${API_URL}/products`)
}