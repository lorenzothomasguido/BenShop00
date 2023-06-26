package com.BenStore.BenStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;


    @Controller
    public class ViewsAdmin {


        @GetMapping("/index_admin")
        public RedirectView RedirectIndexA() {
            return new RedirectView("/admin/index_admin.html");
        }
        @GetMapping("/about_us")
        public RedirectView RedirectAboutUs() {
            return new RedirectView("/admin/about_us.html");
        }
        @GetMapping("/accepted_appointement")
        public RedirectView RedirectacceptedAppointment() {
            return new RedirectView("/admin/accepted_appointment.html");
        }
        @GetMapping("/add_customer")
        public RedirectView RedirectAddCustomer() {
            return new RedirectView("/admin/add_customer.html");
        }
        @GetMapping("/add_customer_services")
        public RedirectView RedirectAddCustomerServices() {
            return new RedirectView("/admin/add_customer_services.html");
        }
        @GetMapping("/add_services")  //revisar por que no se mappea//
        public RedirectView RedirectAddServices() {
            return new RedirectView("/admin/add_services.html");
        }
        @GetMapping("/admin_profile")
        public RedirectView RedirectAdminProfile() {
            return new RedirectView("/admin/admin_profile.html");
        }
        @GetMapping("/all_appointment")
        public RedirectView RedirectAllAppointment() {
            return new RedirectView("/admin/all_appointment.html");
        }
        @GetMapping("/bwdates_reports_details")
        public RedirectView RedirectBwdatesReportsDetails() {
            return new RedirectView("/admin/bwdates_reports_details.html");
        }
        @GetMapping("/bwdates_reports_ds")
        public RedirectView RedirectBwdatesReportsDs() {
            return new RedirectView("/admin/bwdates_reports_ds.html");
        }
        @GetMapping("/change_password")
        public RedirectView RedirectChangePassword() {
            return new RedirectView("/admin/Change-password.html");
        }
        @GetMapping("/contact_us")
        public RedirectView RedirectContactUs() {
            return new RedirectView("/admin/contact_us.html");
        }
        @GetMapping("/customer_list")
        public RedirectView RedirectCustomerList() {
            return new RedirectView("/admin/customer_list.html");
        }

        @GetMapping("/dashboard")
        public RedirectView RedirectDashboard() {
            return new RedirectView("/admin/dashboard.html");
        }
        @GetMapping("/edit_appointment")
        public RedirectView RedirectEditAppointment() {
            return new RedirectView("/admin/edit_appointment.html");
        }
        @GetMapping("/edit_customer_deatiled")
        public RedirectView RedirectEditCustomerDeatiled() {
            return new RedirectView("/admin/edit_customer_deatiled.html");
        }
        @GetMapping("/edit_services")
        public RedirectView RedirectEditServices() {
            return new RedirectView("/admin/edit_services.html");
        }
        @GetMapping("/forgot_password")
        public RedirectView RedirectForgotPassword() {
            return new RedirectView("/admin/forgot_password.html");
        }
        @GetMapping("/invoices")
        public RedirectView RedirectInvoices() {
            return new RedirectView("/admin/invoices.html");
        }
        @GetMapping("/logout")
        public RedirectView RedirectLogOut() {
            return new RedirectView("/admin/logout.html");
        }
        @GetMapping("/manage_services")
        public RedirectView RedirectManageServices() {
            return new RedirectView("/admin/manage_services.html");
        }
        @GetMapping("/new_appointment")
        public RedirectView RedirectNewAppointment() {
            return new RedirectView("/admin/new_appointment.html");
        }
        @GetMapping("/rejected_appointment")
        public RedirectView RedirectRejectedAppointment() {
            return new RedirectView("/admin/rejected_appointment.html");
        }
        @GetMapping("/reset_password")
        public RedirectView RedirectResetPassword() {
            return new RedirectView("/admin/reset_password.html");
        }
        @GetMapping("/sales_reports")
        public RedirectView RedirectSalesReports() {
            return new RedirectView("/admin/sales_reports.html");
        }
        @GetMapping("/sales_reports_detail")
        public RedirectView RedirectSalesReportsDetail() {
            return new RedirectView("/admin/sales_reports_detail.html");
        }
        @GetMapping("/search_appointment")
        public RedirectView RedirectSearchAppointment() {
            return new RedirectView("/admin/search_appointment.html");
        }
        @GetMapping("/search_invoices")
        public RedirectView RedirectHome() {
            return new RedirectView("/admin/search_invoices.html");
        }
        @GetMapping("/view_appointment")
        public RedirectView RedirectViewAppointment() {
            return new RedirectView("/admin/view_appointment.html");
        }
        @GetMapping("/view_invoice")
        public RedirectView RedirectViewInvoice() {
            return new RedirectView("/admin/view_invoice.html");
        }
    }

