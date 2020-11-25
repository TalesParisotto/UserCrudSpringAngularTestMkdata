import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SerachDeleteComponent } from './serach-delete.component';

describe('SerachDeleteComponent', () => {
  let component: SerachDeleteComponent;
  let fixture: ComponentFixture<SerachDeleteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SerachDeleteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SerachDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });
  const app = fixture.debugElement.componentInstance;
  it('should create', () => {
    expect(component).toBeDefined();
  });
});
