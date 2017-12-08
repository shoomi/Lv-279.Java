import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {ViewAcademiesComponent} from "./components/view-academies/view-academies.component";
import {AddGroupComponent} from "./components/group/add-group/add-group.component";
import {HistoryListComponent} from "./components/history/history-list/history-list.component";
import {StudentsComponent} from "./components/students/students.component";
import {FeedbackTeacherEditComponent} from "./components/feedbacks/feedback-edit/feedback-teacher-edit/feedback-teacher-edit.component";
import {FeedbacksComponent} from "./components/feedbacks/feedbacks.component";
import {FeedbackDetailComponent} from "./components/feedbacks/feedback-detail/feedback-detail.component";
import {FeedbackEditComponent} from "./components/feedbacks/feedback-edit/feedback-edit.component";
import {FeedbackListComponent} from "./components/feedbacks/feedback-list/feedback-list.component";
import {ItaTacticalPlanByGroupStageComponent} from "./components/ita-tactical-plan-by-group-stage/ita-tactical-plan-by-group-stage.component";
import {CheckListByGroupsComponent} from "./components/reports/check-list-by-groups/check-list-by-groups.component";
import {TestsNamesComponent} from "./components/tests-names/tests-names.component";


const appRoutes: Routes = [
  // {path: '', component: ViewAcademiesComponent},
  {path: 'ang/addgroup', component: AddGroupComponent, children: [
    {path: '', redirectTo: 'students', pathMatch: 'full'},
    {path: 'students', component: StudentsComponent},
    {path: 'feedbacks', component: FeedbackListComponent},
    {path: 'history', component: HistoryListComponent}]},
  {path: 'ang/viewAcademies', component: ViewAcademiesComponent},
  {path: 'ang/students', component: StudentsComponent},
  {path: 'ang/marks', component: FeedbackTeacherEditComponent},
  {path: 'ang/reports/checkListByGroups', component: CheckListByGroupsComponent},
  {path: 'ang/feed', component: FeedbacksComponent, children: [
    // think about this {path: '', component: FeedbackStartComponent},
    {path: ':id', component: FeedbackDetailComponent},
    {path: ':id/edit', component: FeedbackEditComponent},]},
  {path: 'ang/ita-tactical-plan-by-group-stage', component:ItaTacticalPlanByGroupStageComponent},
  {path: 'ang/tests', component:TestsNamesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
