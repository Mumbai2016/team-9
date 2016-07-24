
$(function () {
    var a1;
    var a2;
    var a3;
    var a4;
    
    $.ajax({
			url: 'get-charts-test' ,
			
			dataType : 'json',
			success : function(data){
                a1 = data['c1'];
                
			}
    });	
    
    $('#container').highcharts({
        chart: {
            plotBackgroundColor: null,
            plotBorderWidth: null,
            plotShadow: false,
            type: 'pie'
        },
        title: {
            text: 'Graduate Enrolment, CC'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                dataLabels: {
                    enabled: true,
                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
                    style: {
                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                    }
                }
            }
        },
        series: [{
            name: 'Yearwise Allotment',
            colorByPoint: true,
            data: [{

                name: '2012-13',
                y: 70
            }, {
                name: '2013-14',
                y: 682,

                name: a1[0],
                y: a1[1]
            }, {
                name: a1[2],
                y: a1[3],

                sliced: true,
                selected: true
            }, {
                name: '2014-15',
                y: 1168
            }, {
                name: '2015-16',
                y: 382
            }, {
                name: '2016-17',
                y: 364
            }, {
                name: '2017-18',
                y: 338
            }]
        }]
    });
});

$(function () {
    $('#container1').highcharts({
        chart: {
            type: 'bar'
        },
        title: {
            text: 'Age-wise Break Up'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            categories: ['Age 12-13', 'Age 14-15', 'Age 16-17', 'Age 18+'],
            title: {
                text: null
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Count of Persons Enrolled',
                align: 'high'
            },
            labels: {
                overflow: 'justify'
            }
        },
        tooltip: {
            valueSuffix: ''
        },
        plotOptions: {
            bar: {
                dataLabels: {
                    enabled: true
                }
            }
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'top',
            x: -40,
            y: 80,
            floating: true,
            borderWidth: 1,
            backgroundColor: ((Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'),
            shadow: true
        },
        credits: {
            enabled: false
        },
        series: [{
            name: 'Male',
            data: [2,84,630,838]
        }, {
            name: 'Female',
            data: [3,95,695,916]
        }, {
            name: 'Total',
            data: [5,179,1325,1754]
        }]
    });
});
$(function () {
    // Create the chart
    $('#container2').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Drop Out - Tracked status - Career Connect											'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            type: 'category'
        },
        yAxis: {
            title: {
                text: 'No of Students'
            }

        },
        legend: {
            enabled: false
        },
        plotOptions: {
            series: {
                borderWidth: 0,
                dataLabels: {
                    enabled: true,
                    format: '{point.y:.1f}%'
                }
            }
        },

        tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
        },

        series: [{
            name: 'No of Students',
            colorByPoint: true,
            data: [{
                name: 'Dropouts- Last Quarter',
                y: 121,
                drilldown: 'Dropouts- Last Quarter'
            }, {
                name: 'Meaningfully Engaged- Last Quarter',
                y: 33,
                drilldown: 'Meaningfully Engaged- Last Quarter'
            }, {
                name: 'LMS among Dropouts',
                y: 5,
                drilldown: 'LMS among Dropouts'
            }, {
                name: 'Continued Dropouts',
                y: 72,
                drilldown: 'Continued Dropouts'
            }, {
                name: 'Not Reachable from Last Quarter',
                y: 16,
                drilldown: 'Not Reachable from Last Quarter'
            }, {
                name: 'New Dropouts Added',
                y: 13,
                drilldown: 'New Dropouts Added'
            }]
        }],
        drilldown: {
            series: [{
                name: 'Microsoft Internet Explorer',
                id: 'Microsoft Internet Explorer',
                data: [
                    [
                        'v11.0',
                        24.13
                    ],
                    [
                        'v8.0',
                        17.2
                    ],
                    [
                        'v9.0',
                        8.11
                    ],
                    [
                        'v10.0',
                        5.33
                    ],
                    [
                        'v6.0',
                        1.06
                    ],
                    [
                        'v7.0',
                        0.5
                    ]
                ]
            }, {
                name: 'Chrome',
                id: 'Chrome',
                data: [
                    [
                        'v40.0',
                        5
                    ],
                    [
                        'v41.0',
                        4.32
                    ],
                    [
                        'v42.0',
                        3.68
                    ],
                    [
                        'v39.0',
                        2.96
                    ],
                    [
                        'v36.0',
                        2.53
                    ],
                    [
                        'v43.0',
                        1.45
                    ],
                    [
                        'v31.0',
                        1.24
                    ],
                    [
                        'v35.0',
                        0.85
                    ],
                    [
                        'v38.0',
                        0.6
                    ],
                    [
                        'v32.0',
                        0.55
                    ],
                    [
                        'v37.0',
                        0.38
                    ],
                    [
                        'v33.0',
                        0.19
                    ],
                    [
                        'v34.0',
                        0.14
                    ],
                    [
                        'v30.0',
                        0.14
                    ]
                ]
            }, {
                name: 'Firefox',
                id: 'Firefox',
                data: [
                    [
                        'v35',
                        2.76
                    ],
                    [
                        'v36',
                        2.32
                    ],
                    [
                        'v37',
                        2.31
                    ],
                    [
                        'v34',
                        1.27
                    ],
                    [
                        'v38',
                        1.02
                    ],
                    [
                        'v31',
                        0.33
                    ],
                    [
                        'v33',
                        0.22
                    ],
                    [
                        'v32',
                        0.15
                    ]
                ]
            }, {
                name: 'Safari',
                id: 'Safari',
                data: [
                    [
                        'v8.0',
                        2.56
                    ],
                    [
                        'v7.1',
                        0.77
                    ],
                    [
                        'v5.1',
                        0.42
                    ],
                    [
                        'v5.0',
                        0.3
                    ],
                    [
                        'v6.1',
                        0.29
                    ],
                    [
                        'v7.0',
                        0.26
                    ],
                    [
                        'v6.2',
                        0.17
                    ]
                ]
            }, {
                name: 'Opera',
                id: 'Opera',
                data: [
                    [
                        'v12.x',
                        0.34
                    ],
                    [
                        'v28',
                        0.24
                    ],
                    [
                        'v27',
                        0.17
                    ],
                    [
                        'v29',
                        0.16
                    ]
                ]
            }]
        }
    });
});

$(function () {
    $('#container3').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'Tracking Status, Career Connect				'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            categories: [
                'Less than 3 months',
                'Inactive',
                'Secondary/School',
                'Sr Secondary/PUC',
                'Diploma',
                'Graduation/ Degree',
                'Employed',
                'Vocation Training',
                'Student and Employed',
                'Dropout',
                'Married',
                'Not Reachable'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: 'No of Students'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} </b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        series: [{
            name: 'Q1',
            data: [382,
130,
23,
874,
49,
416,
15,
1,
0,
30,
5,
377
]

        }, {
            name: 'Q2',
            data: [386,
132,
124,
650,
53,
515,
110,
5,
9,
74,
17,
591,
]

        }, {
            name: 'Q3',
            data: [287,
132,
50,
790,
49,
617,
156,
8,
4,
121,
26,
685,
]

        }, {
            name: 'Q4',
            data: [443,
237,
80,
1011,
67,
725,
206,
6,
2,
78,
37,
371,
]

        }]
    });
});
$(function () {
    $('#container4').highcharts({
        chart: {
            type: 'line'
        },
        title: {
            text: 'Career growth graph'
        },
        subtitle: {
            text: 'Source: Database'
        },
        xAxis: {
            categories: ['Less than 3 months','Secondary/School','Senior Secondary/PUC','Graduation/Degree','Employed','Drop out','Not reachable','Inactive']
        },
        yAxis: {
			categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            
        },
        plotOptions: {
            line: {
                dataLabels: {
                    enabled: true
                },
                enableMouseTracking: false
            }
        },
        series: [ {
            name: 'London',
            data: [0, 3.2, 4.7, 6.5, 11, 9.6, 8.7,6.7]
        }]
    });
});
