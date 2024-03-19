import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { College } from './college.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CollegeService {

  constructor(private httpClient:HttpClient) { }

  API_URL = "http://localhost:8080/college"

  addCollege(newCollege:College):Observable<College>{
    return this.httpClient.post<College>(this.API_URL,newCollege);
  }

  getCollege():Observable<College[]>{
    return this.httpClient.get<College[]>(this.API_URL);
  }

  getCollegeById(id:number):Observable<College>{
    return this.httpClient.get<College>(this.API_URL+"/"+id);
  }

  updateCollege(id:number, College:College):Observable<College>{
    return this.httpClient.put<College>(this.API_URL+"/"+id,College);
  }
  removeCollege(id:number):Observable<College>{
    return this.httpClient.delete<College>(this.API_URL+"/"+id);
  }
}
