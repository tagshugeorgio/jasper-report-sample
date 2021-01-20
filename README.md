## Sample Jasper Report App

### Sample Data
POST http://localhost:12345/employees
```json
{
  "name": "sample",
  "designation": "Excellent",
  "salary": 120000000,
  "doj": "Jamper"
}
```

### Set Up Export Path w/ Environmental Variables
```bash
export export.jasper.report.path="{your path}"
```


### Generate Report
GET http://localhost:12345/employees/report