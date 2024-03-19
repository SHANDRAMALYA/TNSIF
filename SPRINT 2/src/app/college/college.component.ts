import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { College } from './college.model';
import { CollegeService } from './college.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-college',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './college.component.html',
  styleUrls: ['./college.component.css']
})
export class CollegeComponent implements OnInit {
  ngOnInit(): void {
    this.getColleges()
}

constructor(private collegeService:CollegeService){}

newCollege:College= {name:"",address:"",accreditation:"",establishedDate:""};
CollegeList:College[]=[];
deleteId:number | null=null;
editId:number | null=null;

addNewCollege(){
  this.collegeService.addCollege(this.newCollege).subscribe(result=>{
    this.CollegeList.push(result);
  });
  this.newCollege= {name:"",address:"",accreditation:"",establishedDate:""};
}
getColleges(){
  this.collegeService.getCollege().subscribe(result=>{
    this.CollegeList = result;
  })
}
setDeleteId(id: number | undefined){
  if (id !== undefined) {
    // If id is defined, assign it to the recordId property
    this.deleteId = id;
  } else {
    // If id is undefined, log an error or handle the case appropriately
    console.error("Failed to store record ID - College ID is undefined");
  }
}

setEditId(id: number | undefined){
  if (id !== undefined) {
    // If id is defined, assign it to the recordId property
    this.editId = id;
  } else {
    // If id is undefined, log an error or handle the case appropriately
    console.error("Failed to store record ID - College ID is undefined");
  }
}

deleteCollege(){
  if (this.deleteId !== null) {
    // Call your service method to delete the record with this.deleteId
    this.collegeService.removeCollege(this.deleteId).subscribe(() => {
      // Update UI by removing the deleted record from CollegeList array
    this.getColleges();
    });
    // Reset deleteId after deletion
    this.deleteId = null;
  }
}

editCollege(){
  if (this.editId !== null) {
    // Call your service method to delete the record with this.deleteId
    this.collegeService.updateCollege(this.editId,this.newCollege).subscribe(result=>{
      this.getColleges();
    });
    this.newCollege= {name:"",address:"",accreditation:"",establishedDate:""};
    // Reset deleteId after deletion
    this.editId = null;
  }
}
}
