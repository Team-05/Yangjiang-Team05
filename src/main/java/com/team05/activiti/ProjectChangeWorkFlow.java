package com.team05.activiti;

import com.team05.domain.ProjectChange;
import com.team05.utils.CommonUtils;
import org.activiti.engine.HistoryService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by dllo on 18/3/7.
 */
@Component
public class ProjectChangeWorkFlow {

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;

    public void employeeApply(ProjectChange projectChange) {
        try {
            String applyName = projectChange.getProjAssumeStaffName();//申请人

            String nextApprovalName = projectChange.getDeptManager();//审批人

            //将实体类转换成map
            Map<String,Object> map = CommonUtils.beanToMap(projectChange);

            //1.启动请求流程
            ProcessInstance instance = runtimeService
                    .startProcessInstanceByKey(
                            "projectChangeProcess", map);

            //2.处理请求申请的这个环节
            /*2.1 根据流程实例ID获取接下来的请求申请任务，
            即该流程的第一环*/
            String taskId = taskService.createTaskQuery()
                    .processInstanceId(
                            instance.getProcessInstanceId())
                    .singleResult()
                    .getId();

            /*2.2 将申请的流程办理人设置为map中的申请人*/
            taskService.setAssignee(taskId, applyName);

            /*2.3 将填写申请的这个流程完成*/
            taskService.complete(taskId, map);

            //3 当流程流转到项目申请审批时，需要将办理人设置
            //为具体某一个人，即设置为map中的nextApprovalName
            /*3.1 重新查询一下当前流程的顶层任务*/
            taskId = taskService.createTaskQuery()
                    .processInstanceId(
                            instance.getProcessInstanceId())
                    .singleResult().getId();

            /*3.2 设置审批人名称*/
            taskService.setAssignee(taskId, nextApprovalName);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
