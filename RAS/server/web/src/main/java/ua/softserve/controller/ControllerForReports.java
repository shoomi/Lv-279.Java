/*
 * FakeControllerForReports
 *
 * Version 1.0-SNAPSHOT
 *
 * 30.11.17
 *
 * All rights reserved by DoubleO Team (Team#1)
 * */

package ua.softserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.softserve.persistence.entity.ItaTacticalReport;
import ua.softserve.persistence.repo.ItaTacticalReportRepository;
import ua.softserve.service.ItaTacticalReportService;
import ua.softserve.persistence.entity.views.CheckListReport;
import ua.softserve.service.CheckListReportService;


import java.util.List;
import java.util.Map;

/**
 * Controller of Reports generation
 */
@RestController
@RequestMapping("/reports")
public class ControllerForReports {

    @Autowired
    private CheckListReportService checkListReportService;
    @Autowired
    ItaTacticalReportService itaTacticalReportService;
    @Autowired
    private ItaTacticalReportRepository itaTacticalReportRepository;

    /**
     * Returns response with generated Check List By Groups Report
     * @return list of reports for all groups
     */
    @GetMapping("/check_list_by_groups")
    public ResponseEntity<List<CheckListReport>> getCheckListByGroupsDto() {
        return new ResponseEntity<>(checkListReportService.getCheckListDto(), HttpStatus.OK);
    }


    @GetMapping(value = "/ita_tactical_report")
    public ResponseEntity<Map<String,List<ItaTacticalReport>>> getItaTacticalrReport() {
        return new ResponseEntity<>(itaTacticalReportService.generateItaTacticalReport(), HttpStatus.OK);
    }

    @GetMapping(value = "/test")
    public ResponseEntity<List<ItaTacticalReport>> test() {
        return new ResponseEntity<>(itaTacticalReportRepository.findAll(), HttpStatus.OK);
    }


}
