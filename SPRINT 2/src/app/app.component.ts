import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CollegeComponent } from './college/college.component';
import { from } from 'rxjs';
import { FormsModule } from '@angular/forms';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, AppComponent, CollegeComponent]
})
export class AppComponent {
  title = 'placement-management-frontend';
}
