/*
 * Copyright (c) 2005-2011 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */

package org.mifos.androidclient.entities.customer;

import org.mifos.androidclient.entities.BaseEntity;

public class CenterPerformanceHistory extends BaseEntity {

    private Integer numberOfGroups;
    private Integer numberOfClients;
    private String totalOutstandingPortfolio;
    private String totalSavings;
    private String portfolioAtRisk;

    public Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(Integer numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public Integer getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(Integer numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public String getTotalOutstandingPortfolio() {
        return totalOutstandingPortfolio;
    }

    public void setTotalOutstandingPortfolio(String totalOutstandingPortfolio) {
        this.totalOutstandingPortfolio = totalOutstandingPortfolio;
    }

    public String getTotalSavings() {
        return totalSavings;
    }

    public void setTotalSavings(String totalSavings) {
        this.totalSavings = totalSavings;
    }

    public String getPortfolioAtRisk() {
        return portfolioAtRisk;
    }

    public void setPortfolioAtRisk(String portfolioAtRisk) {
        this.portfolioAtRisk = portfolioAtRisk;
    }

}
