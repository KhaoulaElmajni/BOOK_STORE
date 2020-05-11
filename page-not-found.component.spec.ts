import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PageNOtFoundComponent } from './page-not-found.component';

describe('PageNOtFoundComponent', () => {
  let component: PageNOtFoundComponent;
  let fixture: ComponentFixture<PageNOtFoundComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PageNOtFoundComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PageNOtFoundComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
