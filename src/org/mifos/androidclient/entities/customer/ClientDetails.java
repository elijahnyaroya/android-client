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

import java.util.List;

public class ClientDetails extends CustomerDetailsEntity {

    private List<CustomerFlag> customerFlags;
    private ClientPerformanceHistory clientPerformanceHistory;
    private List<LoanAccountBasicInformation> loanAccountsInUse;
    private ClientDisplay clientDisplay;

    public List<CustomerFlag> getCustomerFlags() {
        return customerFlags;
    }

    public void setCustomerFlags(List<CustomerFlag> customerFlags) {
        this.customerFlags = customerFlags;
    }

    public ClientPerformanceHistory getClientPerformanceHistory() {
        return clientPerformanceHistory;
    }

    public void setClientPerformanceHistory(ClientPerformanceHistory clientPerformanceHistory) {
        this.clientPerformanceHistory = clientPerformanceHistory;
    }

    public List<LoanAccountBasicInformation> getLoanAccountsInUse() {
        return loanAccountsInUse;
    }

    public void setLoanAccountsInUse(List<LoanAccountBasicInformation> loanAccountsInUse) {
        this.loanAccountsInUse = loanAccountsInUse;
    }

    public ClientDisplay getClientDisplay() {
        return clientDisplay;
    }

    public void setClientDisplay(ClientDisplay clientDisplay) {
        this.clientDisplay = clientDisplay;
    }

}