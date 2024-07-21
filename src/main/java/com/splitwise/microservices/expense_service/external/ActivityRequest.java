package com.splitwise.microservices.expense_service.external;

import com.splitwise.microservices.expense_service.enums.ActivityType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;
    private Long groupId;
    private Long settlementId;
    private Long expenseId;
    private ActivityType activityType;
    private String message;
    private Date createDate;
    private List<ChangeLog> changeLogs;
}
